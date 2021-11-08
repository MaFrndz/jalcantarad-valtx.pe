package com.finnegansfact.finnegans_chile.Entities;

public class Retencion {
    private Integer RetencionImporte;
    private String RetencionCodigo;
    private String Comprobante;
    private Integer ISAR;
    private String TipoRetencionCodigo;

    public Integer getRetencionImporte() {
        return RetencionImporte;
    }
    public void setRetencionImporte(Integer retencionImporte) {
        RetencionImporte = retencionImporte;
    }
    public String getRetencionCodigo() {
        return RetencionCodigo;
    }
    public void setRetencionCodigo(String retencionCodigo) {
        RetencionCodigo = retencionCodigo;
    }
    public String getComprobante() {
        return Comprobante;
    }
    public void setComprobante(String comprobante) {
        Comprobante = comprobante;
    }
    public Integer getISAR() {
        return ISAR;
    }
    public void setISAR(Integer iSAR) {
        ISAR = iSAR;
    }
    public String getTipoRetencionCodigo() {
        return TipoRetencionCodigo;
    }
    public void setTipoRetencionCodigo(String tipoRetencionCodigo) {
        TipoRetencionCodigo = tipoRetencionCodigo;
    }   
}