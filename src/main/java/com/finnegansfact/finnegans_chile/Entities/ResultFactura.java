package com.finnegansfact.finnegans_chile.Entities;

public class ResultFactura {
    private String mensaje; 
    private DetalleExcel detalle ;
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public DetalleExcel getDetalle() {
        return detalle;
    }
    public void setDetalle(DetalleExcel detalle) {
        this.detalle = detalle;
    } 
    
}
