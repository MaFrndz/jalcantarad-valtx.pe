package com.finnegansfact.finnegans_chile.Api;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.finnegansfact.finnegans_chile.Entities.FacturaParams;
import com.finnegansfact.finnegans_chile.Entities.Result;
import com.finnegansfact.finnegans_chile.Entities.ResultFactura;
import com.finnegansfact.finnegans_chile.Entities.TokenReq;
import com.finnegansfact.finnegans_chile.Entities.TokenResp;
import com.finnegansfact.finnegans_chile.Service.facturaService;
import com.google.gson.Gson;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/factura")
public class Factura {
    
    @Autowired
    private facturaService  serv ; 
    @Autowired
    private Gson gson;

    @GetMapping(value = "token")
    public TokenResp token(){
        TokenReq param = new TokenReq();
        param.setClient_id("7c5bd4ff12b3d654615d362b6ecd083b");
        param.setClient_secret("bb6f2ec3cda8eecf69c02c65cf4df2c6");
        return serv.token(param) ;
    }

    @PostMapping(value = "factura")
    public Result factura(@RequestBody FacturaParams param ,  HttpServletResponse response) throws IOException{
        Result result = serv.factura(param) ;
        
        return result; //new String(result.getDetalle().getPDF417());
    }


    @PostMapping(value = "factura2")
    public void factura2(@RequestBody FacturaParams param ,  HttpServletResponse response) throws IOException{
        Result result = serv.factura(param) ;
        
        try {
            Document document = new Document();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            //baos.write(result.getDetalle().getPDF417comoBytes(), 0, result.getDetalle().getPDF417comoBytes().length);
            
            PdfWriter.getInstance(document, baos);
            document.open();
            document.add(new Paragraph("sdasdads"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("a paragraph"));
            document.close();           
      
            response.setHeader("Expires", "0");
            response.setHeader("Cache-Control","no-cache");
            response.setHeader("Pragma", "no-cache");      
            response.setContentType("application/pdf");
            //response.setContentType("Content-Disposition : attachment; filename=sdasd.pdf");
            response.setContentLength(baos.size());
      
            ServletOutputStream out = response.getOutputStream();
            baos.writeTo(out);
            out.flush();
      
          } catch (Exception e2) {
            System.out.println("Error in " + getClass().getName() + "\n" + e2);
          }
			
        //return resp ;
    }


   
}
