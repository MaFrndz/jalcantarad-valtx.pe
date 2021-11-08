package com.finnegansfact.finnegans_chile.Api;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;

import com.finnegansfact.finnegans_chile.Entities.FacturaParams;
import com.finnegansfact.finnegans_chile.Entities.Result;
import com.finnegansfact.finnegans_chile.Entities.ResultFactura;
import com.finnegansfact.finnegans_chile.Entities.TokenReq;
import com.finnegansfact.finnegans_chile.Entities.TokenResp;
import com.finnegansfact.finnegans_chile.Service.facturaService;
import com.google.gson.Gson;
import com.liquid_technologies.ltxmllib12.Base64.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.Response;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.InputStream;

import java.awt.FileDialog;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Base64;


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
    public String factura(@RequestBody FacturaParams param ,  HttpServletResponse response) throws IOException{
        Result result = serv.factura(param) ;
        
        return new String(result.getDetalle().getPDF417());
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


    @GetMapping(value = "excel")
    public void excel2s() throws IOException{
        
        // URL fetchWebsite = new URL("https://theswissbay.ch/pdf/Gentoomen%20Library/Programming/Java/Introduction%20to%20Java%20IO.pdf");
        // ReadableByteChannel readableByteChannel = Channels.newChannel(fetchWebsite.openStream());
        // try (FileOutputStream fos = new FileOutputStream("C:\\Users\\mafer\\Downloads\\IntroToJava.pdf")) {
        //     fos.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        // }

        String fichero = "";
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mafer\\Downloads\\ejemplo.json"));
        String linea;
        while ((linea = br.readLine()) != null) {
            fichero += linea;
        }
        ResultFactura  ent  = gson.fromJson(fichero, ResultFactura.class);

        try (
            BufferedInputStream in = new BufferedInputStream(new URL("https://theswissbay.ch/pdf/Gentoomen%20Library/Programming/Java/Introduction%20to%20Java%20IO.pdf").openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\mafer\\Downloads\\juats.pdf")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
        
    }
}
