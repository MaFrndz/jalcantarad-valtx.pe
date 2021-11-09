package com.finnegansfact.finnegans_chile.Entities;

public class Result {
    private String mensaje;
    private dteboxcliente.ResultadoEnvioDocumento detalle; 
    private FacturaVentaActualizarResp facturaVentaActualizar; 
    
    public FacturaVentaActualizarResp getFacturaVentaActualizar() {
        return facturaVentaActualizar;
    }

    public void setFacturaVentaActualizar(FacturaVentaActualizarResp facturaVentaActualizar) {
        this.facturaVentaActualizar = facturaVentaActualizar;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public dteboxcliente.ResultadoEnvioDocumento getDetalle() {
        return detalle;
    }

    public void setDetalle(dteboxcliente.ResultadoEnvioDocumento detalle) {
        this.detalle = detalle;
    } 
}
