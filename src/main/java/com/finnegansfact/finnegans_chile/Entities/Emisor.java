package com.finnegansfact.finnegans_chile.Entities;

import java.util.List;

public class Emisor {
    private String RUTEmisor;
    private String RznSoc;
    private String GiroEmis;
    private List<Integer> Acteco;
    private String DirOrigen;
    private String CmnaOrigen;
    public String getRUTEmisor() {
        return RUTEmisor;
    }
    public void setRUTEmisor(String rUTEmisor) {
        RUTEmisor = rUTEmisor;
    }
    public String getRznSoc() {
        return RznSoc;
    }
    public void setRznSoc(String rznSoc) {
        RznSoc = rznSoc;
    }
    public String getGiroEmis() {
        return GiroEmis;
    }
    public void setGiroEmis(String giroEmis) {
        GiroEmis = giroEmis;
    }
    public List<Integer> getActeco() {
        return Acteco;
    }
    public void setActeco(List<Integer> acteco) {
        Acteco = acteco;
    }
    public String getDirOrigen() {
        return DirOrigen;
    }
    public void setDirOrigen(String dirOrigen) {
        DirOrigen = dirOrigen;
    }
    public String getCmnaOrigen() {
        return CmnaOrigen;
    }
    public void setCmnaOrigen(String cmnaOrigen) {
        CmnaOrigen = cmnaOrigen;
    }
}
