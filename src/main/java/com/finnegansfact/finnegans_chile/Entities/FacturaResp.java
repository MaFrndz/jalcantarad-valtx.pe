package com.finnegansfact.finnegans_chile.Entities;

import java.util.List;

public class FacturaResp {
    private String Nombre; 
     private List<Concepto> Conceptos; 
    private String FechaComprobante; 
    private String MotivoComprobanteID; 
    private String CAEFechaVto; 
    private String NumeroComprobante; 
    private String TransaccionAsociadaFCEID; 
    private String IdentificacionExterna; 
    private String WorkflowCodigo; 
    private String Fecha; 

    private String CondicionPagoCodigo; 
    private String ProvinciaIOrigen; 
    private String MonedaCodigo; 
    private String EmpresaCodigo; 
    private String RazonSocial; 
    private String TransaccionSubtipoCodigo; 
    private String ComprobanteTipoImpositivoCodigo; 
    private String Descripcion; 
    private String NumeroIdentificacionTributaria; 
    private String Cliente; 
    private String TransaccionTipoCodigo; 
    private String CAE; 
    private String ProvinciaDestino; 
    
    private List<Cotizacion> Cotizaciones;
    private List<Retencion> Retenciones; 
    private List<Producto> Productos;
    
    //#region  get.s  set.s
    
    public String getNombre() {
        return Nombre;
    }
    public List<Concepto> getConceptos() {
        return Conceptos;
    }
    public void setConceptos(List<Concepto> conceptos) {
        Conceptos = conceptos;
    }
    public List<Cotizacion> getCotizaciones() {
        return Cotizaciones;
    }
    public void setCotizaciones(List<Cotizacion> cotizaciones) {
        Cotizaciones = cotizaciones;
    }
    public List<Retencion> getRetenciones() {
        return Retenciones;
    }
    public void setRetenciones(List<Retencion> retenciones) {
        Retenciones = retenciones;
    }
    public List<Producto> getProductos() {
        return Productos;
    }
    public void setProductos(List<Producto> productos) {
        Productos = productos;
    }
    public String getCondicionPagoCodigo() {
        return CondicionPagoCodigo;
    }
    public void setCondicionPagoCodigo(String condicionPagoCodigo) {
        CondicionPagoCodigo = condicionPagoCodigo;
    }
    public String getProvinciaIOrigen() {
        return ProvinciaIOrigen;
    }
    public void setProvinciaIOrigen(String provinciaIOrigen) {
        ProvinciaIOrigen = provinciaIOrigen;
    }
    public String getMonedaCodigo() {
        return MonedaCodigo;
    }
    public void setMonedaCodigo(String monedaCodigo) {
        MonedaCodigo = monedaCodigo;
    }
    public String getEmpresaCodigo() {
        return EmpresaCodigo;
    }
    public void setEmpresaCodigo(String empresaCodigo) {
        EmpresaCodigo = empresaCodigo;
    }
    public String getRazonSocial() {
        return RazonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }
    public String getTransaccionSubtipoCodigo() {
        return TransaccionSubtipoCodigo;
    }
    public void setTransaccionSubtipoCodigo(String transaccionSubtipoCodigo) {
        TransaccionSubtipoCodigo = transaccionSubtipoCodigo;
    }
    public String getComprobanteTipoImpositivoCodigo() {
        return ComprobanteTipoImpositivoCodigo;
    }
    public void setComprobanteTipoImpositivoCodigo(String comprobanteTipoImpositivoCodigo) {
        ComprobanteTipoImpositivoCodigo = comprobanteTipoImpositivoCodigo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getNumeroIdentificacionTributaria() {
        return NumeroIdentificacionTributaria;
    }
    public void setNumeroIdentificacionTributaria(String numeroIdentificacionTributaria) {
        NumeroIdentificacionTributaria = numeroIdentificacionTributaria;
    }
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }
    public String getTransaccionTipoCodigo() {
        return TransaccionTipoCodigo;
    }
    public void setTransaccionTipoCodigo(String transaccionTipoCodigo) {
        TransaccionTipoCodigo = transaccionTipoCodigo;
    }
    public String getCAE() {
        return CAE;
    }
    public void setCAE(String cAE) {
        CAE = cAE;
    }
    public String getProvinciaDestino() {
        return ProvinciaDestino;
    }
    public void setProvinciaDestino(String provinciaDestino) {
        ProvinciaDestino = provinciaDestino;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getFechaComprobante() {
        return FechaComprobante;
    }
    public void setFechaComprobante(String fechaComprobante) {
        FechaComprobante = fechaComprobante;
    }
    public String getMotivoComprobanteID() {
        return MotivoComprobanteID;
    }
    public void setMotivoComprobanteID(String motivoComprobanteID) {
        MotivoComprobanteID = motivoComprobanteID;
    }
    public String getCAEFechaVto() {
        return CAEFechaVto;
    }
    public void setCAEFechaVto(String cAEFechaVto) {
        CAEFechaVto = cAEFechaVto;
    }
    public String getNumeroComprobante() {
        return NumeroComprobante;
    }
    public void setNumeroComprobante(String numeroComprobante) {
        NumeroComprobante = numeroComprobante;
    }
    public String getTransaccionAsociadaFCEID() {
        return TransaccionAsociadaFCEID;
    }
    public void setTransaccionAsociadaFCEID(String transaccionAsociadaFCEID) {
        TransaccionAsociadaFCEID = transaccionAsociadaFCEID;
    }
    public String getIdentificacionExterna() {
        return IdentificacionExterna;
    }
    public void setIdentificacionExterna(String identificacionExterna) {
        IdentificacionExterna = identificacionExterna;
    }
    public String getWorkflowCodigo() {
        return WorkflowCodigo;
    }
    public void setWorkflowCodigo(String workflowCodigo) {
        WorkflowCodigo = workflowCodigo;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }

   
    //#endregion
}
