package com.finnegansfact.finnegans_chile.Service.implement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import com.finnegansfact.finnegans_chile.Entities.Empresa;
import com.finnegansfact.finnegans_chile.Entities.FacturaParams;
import com.finnegansfact.finnegans_chile.Entities.FacturaResp;
import com.finnegansfact.finnegans_chile.Entities.Cliente;
import com.finnegansfact.finnegans_chile.Entities.Concepto;
import com.finnegansfact.finnegans_chile.Entities.Localidad;
import com.finnegansfact.finnegans_chile.Entities.Producto;
import com.finnegansfact.finnegans_chile.Entities.Result;
import com.finnegansfact.finnegans_chile.Entities.TokenReq;
import com.finnegansfact.finnegans_chile.Entities.TokenResp;
import com.finnegansfact.finnegans_chile.Entities.prueba;
import com.finnegansfact.finnegans_chile.Entities.prueba2;
import com.finnegansfact.finnegans_chile.Service.facturaService;
import com.finnegansfact.finnegans_chile.Util.serviceConsumer;
import com.google.gson.Gson;
import com.liquid_technologies.ltxmllib12.DateTime;
import com.liquid_technologies.ltxmllib12.exceptions.LtException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import DocumentoDTE.SiiDte.Referencia_CodRef;
import dteboxcliente.Ambiente;
import dteboxcliente.TipoPDF417;
@Service
public class facturaImpl implements facturaService {
    
    
    @Autowired
    private Gson gson;
    
    @Autowired
    private serviceConsumer consumer;

    @Value("${url.finnegans.facturaVenta}")
    private String url_facturaVenta;
    @Value("${url.finnegans.empresa}")
    private String url_empresa;
    @Value("${url.finnegans.localidad}")
    private String url_localidad;
    @Value("${url.finnegans.cliente}")
    private String url_cliente;
    @Value("${url.gdexpress.api}")
    private String url_gdeexpres_api;
    @Value("${url.gdexpress.auth}")
    private String url_gdeexpres_auth;


    @Override
    public prueba2 pruebaPost(){

        String BASE_URL = "http://localhost:5050/api/fLogin/autenticacion";     
        
        prueba p = new prueba();
        p.setContrasenia("123456789");
        p.setUsuarioSistema("mfernandez");
        
        String JSON = gson.toJson(p);
        //serviceConsumer consumer  = new serviceConsumer();
        prueba2 result = gson.fromJson(consumer.ejecutarServicio_post(JSON, BASE_URL), prueba2.class);
        return result;
    }
    
    @Override
    public Result factura(FacturaParams param){

        String mensaje = "";
        Result resultado = new Result();
        
        String base_url = url_facturaVenta+param.getCodigo()+"?ACCESS_TOKEN="+param.getToken();
        String respuesta_api = consumer.ejecutarServicio_get(base_url);
        if(respuesta_api.contains("invalid token")){
            mensaje  ="Factura Venta : invalid token"; 
            resultado.setMensaje(mensaje); 
            return resultado; 
        }
        mensaje = "facturaVenta: consultado correctamente"; 
        FacturaResp facturaVenta = gson.fromJson(respuesta_api, FacturaResp.class);

        base_url = url_empresa+facturaVenta.getEmpresaCodigo()+"?ACCESS_TOKEN="+param.getToken();
        respuesta_api = consumer.ejecutarServicio_get(base_url); 
        if(respuesta_api.contains("invalid token")){
            mensaje += ", Empresa : invalid token"; 
            resultado.setMensaje(mensaje);
            return resultado; 
        }
        mensaje = "Empresa: consultado correctamente"; 
        Empresa empresa  = gson.fromJson(respuesta_api, Empresa.class);

        base_url = url_localidad+empresa.getDireccionItems().get(0).getLocalidadID()+"?ACCESS_TOKEN="+param.getToken();
        respuesta_api = consumer.ejecutarServicio_get(base_url); 
        if(respuesta_api.contains("invalid token")){
            mensaje += ", Empresa : invalid token"; 
            resultado.setMensaje(mensaje);
            return resultado; 
        }
        mensaje = "Empresa: consultado correctamente"; 
        Localidad localidad  = gson.fromJson(respuesta_api, Localidad.class);

        base_url = url_cliente+facturaVenta.getCliente()+"?ACCESS_TOKEN="+param.getToken();
        respuesta_api = consumer.ejecutarServicio_get(base_url); 
        if(respuesta_api.contains("invalid token")){
            mensaje += ", cliente : invalid token"; 
            resultado.setMensaje(mensaje);
            return resultado; 
        }
        Cliente cliente = gson.fromJson(respuesta_api, Cliente.class);

        //#region DTE
        try {
            DocumentoDTE.SiiDte.DTEDefType dte = new DocumentoDTE.SiiDte.DTEDefType();
            dte.setDTE_Choice(new DocumentoDTE.SiiDte.DTE_Choice());

            //Documento
            dte.getDTE_Choice().setDocumento( new DocumentoDTE.SiiDte.Documento());
            DocumentoDTE.SiiDte.Documento doc = dte.getDTE_Choice().getDocumento();

            // documento - encabezado
            doc.setEncabezado(new DocumentoDTE.SiiDte.Encabezado());
            doc.getEncabezado().setIdDoc(new DocumentoDTE.SiiDte.IdDoc());;
        
            //Documento/Encabezado/IdDoc
            doc.getEncabezado().getIdDoc().setTipoDTE(DocumentoDTE.SiiDte.DTEType.n33); //facturaVenta.getComprobanteTipoImpositivoCodigo();
            doc.getEncabezado().getIdDoc().setFolio(new BigInteger("2444")); //facturaVenta.getNumeroComprobante()

            GregorianCalendar myCalendar = new GregorianCalendar(); // facturaVenta.getFechaComprobante();
            doc.getEncabezado().getIdDoc().setFchEmis( new DateTime(myCalendar, true) ); // xxx
        
            //emisor
            doc.getEncabezado().setEmisor(new DocumentoDTE.SiiDte.Emisor());
            doc.getEncabezado().getEmisor().setRUTEmisor("76129486-5"); //empresa.getNumeroIdentificacion().replaceAll("[.]", "")
            doc.getEncabezado().getEmisor().setRznSoc(empresa.getNombre());
            doc.getEncabezado().getEmisor().setGiroEmis(empresa.getNumeroIdentificacion()); 
            if(empresa.getNroIIBB().equals("")==false){
                doc.getEncabezado().getEmisor().getActeco().add(new BigInteger( empresa.getNroIIBB() ));
            }
            doc.getEncabezado().getEmisor().setDirOrigen(empresa.getDireccionItems().get(0).getCalle()+
            " "+empresa.getDireccionItems().get(0).getNumero()+
            " "+empresa.getDireccionItems().get(0).getDpto()+
            " "+empresa.getDireccionItems().get(0).getPiso());
            doc.getEncabezado().getEmisor().setCmnaOrigen(localidad.getNombre());

            //receptor
            doc.getEncabezado().setReceptor(new DocumentoDTE.SiiDte.Receptor());
            doc.getEncabezado().getReceptor().setRUTRecep(cliente.getIdentificacionTributariaNumero().replaceAll("[.]", "")); 
            doc.getEncabezado().getReceptor().setRznSocRecep(cliente.getRazonSocial());
            doc.getEncabezado().getReceptor().setDirRecep(cliente.getDirecciones().get(0).getCalle()+
            " "+cliente.getDirecciones().get(0).getNumero()+
            " "+cliente.getDirecciones().get(0).getDpto()+
            " "+cliente.getDirecciones().get(0).getPiso());
            doc.getEncabezado().getReceptor().setCmnaRecep(localidad.getNombre());
            doc.getEncabezado().getReceptor().setGiroRecep("hoteles"); //cliente.getGiroRecep() == null?"":cliente.getGiroRecep()

            //Totales
            doc.getEncabezado().setTotales(new DocumentoDTE.SiiDte.Totales());
            // Integer montoTotal = 0 ; 
            // Integer montoNeto = 0; 
            // Integer iva = 0; 
            // for (Concepto item : facturaVenta.getConceptos()) {
            //     montoTotal += item.getConceptoImporte() ;
            //     montoTotal += item.getConceptoImporteGravado();
            //     montoNeto += item.getConceptoImporteGravado();
            //     iva += item.getConceptoImporte(); 
            // }
            // doc.getEncabezado().getTotales().setMntTotal(new BigInteger( montoTotal.toString() ));
            // doc.getEncabezado().getTotales().setMntNeto(new BigInteger(montoNeto.toString()));
            // doc.getEncabezado().getTotales().setTasaIVA(new BigDecimal("19")); //19 - duracel
            // doc.getEncabezado().getTotales().setIVA(new BigInteger(iva.toString()));


            //Detalle
            DocumentoDTE.SiiDte.Detalle det = new DocumentoDTE.SiiDte.Detalle();
            //Referencia
            //DocumentoDTE.SiiDte.Referencia reference = new DocumentoDTE.SiiDte.Referencia();
            Integer i  = 0 ; 
            for (Producto element : facturaVenta.getProductos()) {     
                i++;            
                det.setNroLinDet(new BigInteger(i.toString()));
                det.setNmbItem(element.getProductoCodigo());
                det.setMontoItem(new BigInteger(element.getPrecio().toString())); 
                det.setQtyItem(new BigDecimal(element.getCantidad()));
                det.setPrcItem(new BigDecimal(element.getPrecio()*element.getCantidad()));
                doc.getDetalle().add(det);   
            }

            // referencia
            // reference.setNroLinRef(new BigInteger("1"));   
            // reference.setTpoDocRef("34"); //facturaVenta.getComprobanteTipoImpositivoCodigo()
            // //Referencia_CodRef rf = new Referencia_CodRef();
            // reference.setCodRef(null);
            // reference.setFolioRef(facturaVenta.getNumeroComprobante());      
            // reference.setFchRef(new DateTime(myCalendar, true));
            // doc.getReferencia().add(reference);

                        
            // llamada servicio
            //DTEBoxCliente.Ambiente ambiente = DTEBoxCliente.Ambiente.Homologacion;
            
            String ambiente = Ambiente.Homologacion; 
            //DateTime fechaResolucion = new DateTime(myCalendar, true);

            Integer numeroResolucion = 0;
            new dteboxcliente.TipoPDF417();
            Integer tipoPdf417 = TipoPDF417.Fuente;
            Boolean generarFolio = false;
                                
            dteboxcliente.Servicio servicio = new dteboxcliente.Servicio(url_gdeexpres_api, url_gdeexpres_auth);        
            dteboxcliente.ResultadoEnvioDocumento resultado_envio = servicio.EnviarDocumento(dte,ambiente, "2021-10-19",numeroResolucion,tipoPdf417,generarFolio);
            resultado.setDetalle(resultado_envio);
            

        } catch (LtException e) {
            e.printStackTrace();
        }
        return resultado;
        //#endregion
    }

    @Override
    public TokenResp token (TokenReq param){
        String base_url = "https://api.teamplace.finneg.com/api/oauth/token?grant_type=client_credentials&client_id="+param.getClient_id()+"&client_secret="+param.getClient_secret();
        TokenResp resp = new TokenResp();
        resp.setToken(consumer.ejecutarServicio_get(base_url));
        return resp; 
    }
    
}
