package com.finnegansfact.finnegans_chile.Entities;

import java.util.Date;

public class Referencia {
    private Integer NroLinRef; 
    private String TpoDocRef; 
    private String FolioRef;
    private Date FchRef;
    public Integer getNroLinRef() {
        return NroLinRef;
    }
    public void setNroLinRef(Integer nroLinRef) {
        NroLinRef = nroLinRef;
    }
    public String getTpoDocRef() {
        return TpoDocRef;
    }
    public void setTpoDocRef(String tpoDocRef) {
        TpoDocRef = tpoDocRef;
    }
    public String getFolioRef() {
        return FolioRef;
    }
    public void setFolioRef(String folioRef) {
        FolioRef = folioRef;
    }
    public Date getFchRef() {
        return FchRef;
    }
    public void setFchRef(Date fchRef) {
        FchRef = fchRef;
    } 
}
