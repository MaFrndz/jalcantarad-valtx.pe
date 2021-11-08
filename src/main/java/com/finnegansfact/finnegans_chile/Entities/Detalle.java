package com.finnegansfact.finnegans_chile.Entities;

public class Detalle {
    private Integer NroLinDet; 
    private String NmbItem; 
    private Integer MontoItem; 
    private Integer QtyItem; 
    private Integer PrcItem;
    public Integer getNroLinDet() {
        return NroLinDet;
    }
    public void setNroLinDet(Integer nroLinDet) {
        NroLinDet = nroLinDet;
    }
    public String getNmbItem() {
        return NmbItem;
    }
    public void setNmbItem(String nmbItem) {
        NmbItem = nmbItem;
    }
    public Integer getMontoItem() {
        return MontoItem;
    }
    public void setMontoItem(Integer montoItem) {
        MontoItem = montoItem;
    }
    public Integer getQtyItem() {
        return QtyItem;
    }
    public void setQtyItem(Integer qtyItem) {
        QtyItem = qtyItem;
    }
    public Integer getPrcItem() {
        return PrcItem;
    }
    public void setPrcItem(Integer prcItem) {
        PrcItem = prcItem;
    } 
}
