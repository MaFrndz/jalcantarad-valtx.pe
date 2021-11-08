package com.finnegansfact.finnegans_chile.Entities;

import java.util.Date;

public class IdDoc {
    private String TipoDTE ;
    private Integer Folio;
    private Date FchEmis;
    public String getTipoDTE() {
        return TipoDTE;
    }
    public void setTipoDTE(String tipoDTE) {
        TipoDTE = tipoDTE;
    }
    public Integer getFolio() {
        return Folio;
    }
    public void setFolio(Integer folio) {
        Folio = folio;
    }
    public Date getFchEmis() {
        return FchEmis;
    }
    public void setFchEmis(Date fchEmis) {
        FchEmis = fchEmis;
    }
}