package com.finnegansfact.finnegans_chile.Service;
import com.finnegansfact.finnegans_chile.Entities.*;


public interface facturaService {

    prueba2 pruebaPost(); 
    
    Result factura(FacturaParams param) ; 
    
    TokenResp token(TokenReq param);
}