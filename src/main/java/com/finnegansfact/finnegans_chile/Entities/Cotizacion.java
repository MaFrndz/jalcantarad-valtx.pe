package com.finnegansfact.finnegans_chile.Entities;

public class Cotizacion {
    private String MonedaCodigo; 
    private Integer Cotizacion;
    public String getMonedaCodigo() {
        return MonedaCodigo;
    }
    public void setMonedaCodigo(String monedaCodigo) {
        MonedaCodigo = monedaCodigo;
    }
    public Integer getCotizacion() {
        return Cotizacion;
    }
    public void setCotizacion(Integer cotizacion) {
        Cotizacion = cotizacion;
    } 
}
