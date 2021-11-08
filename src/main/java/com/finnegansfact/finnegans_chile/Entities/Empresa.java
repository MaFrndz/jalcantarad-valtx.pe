package com.finnegansfact.finnegans_chile.Entities;

import java.util.List;

public class Empresa {
    private String Codigo; 
    private Boolean Activo;
    private String Nombre; 
    private String Descripcion; 
    private String CategoriaFiscalCodigo; 
    private String IdentificacionTributariaCodigo; 
    private String NumeroIdentificacion; 
    private String NroIIBB;
    private String FechaInicioActividad;
    private String Logo;
    private String CodigoCertificado;
    private String CertificadoCotAgip;
    private String RepreCuitAgip;
    private String AdminCuitAgip;
    private String PaisID;
    private String MonedaPrincipalCodigo;
    private List<DireccionItems> DireccionItems;
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    public Boolean getActivo() {
        return Activo;
    }
    public void setActivo(Boolean activo) {
        Activo = activo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getCategoriaFiscalCodigo() {
        return CategoriaFiscalCodigo;
    }
    public void setCategoriaFiscalCodigo(String categoriaFiscalCodigo) {
        CategoriaFiscalCodigo = categoriaFiscalCodigo;
    }
    public String getIdentificacionTributariaCodigo() {
        return IdentificacionTributariaCodigo;
    }
    public void setIdentificacionTributariaCodigo(String identificacionTributariaCodigo) {
        IdentificacionTributariaCodigo = identificacionTributariaCodigo;
    }
    public String getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        NumeroIdentificacion = numeroIdentificacion;
    }
    public String getNroIIBB() {
        return NroIIBB;
    }
    public void setNroIIBB(String nroIIBB) {
        NroIIBB = nroIIBB;
    }
    public String getFechaInicioActividad() {
        return FechaInicioActividad;
    }
    public void setFechaInicioActividad(String fechaInicioActividad) {
        FechaInicioActividad = fechaInicioActividad;
    }
    public String getLogo() {
        return Logo;
    }
    public void setLogo(String logo) {
        Logo = logo;
    }
    public String getCodigoCertificado() {
        return CodigoCertificado;
    }
    public void setCodigoCertificado(String codigoCertificado) {
        CodigoCertificado = codigoCertificado;
    }
    public String getCertificadoCotAgip() {
        return CertificadoCotAgip;
    }
    public void setCertificadoCotAgip(String certificadoCotAgip) {
        CertificadoCotAgip = certificadoCotAgip;
    }
    public String getRepreCuitAgip() {
        return RepreCuitAgip;
    }
    public void setRepreCuitAgip(String repreCuitAgip) {
        RepreCuitAgip = repreCuitAgip;
    }
    public String getAdminCuitAgip() {
        return AdminCuitAgip;
    }
    public void setAdminCuitAgip(String adminCuitAgip) {
        AdminCuitAgip = adminCuitAgip;
    }
    public String getPaisID() {
        return PaisID;
    }
    public void setPaisID(String paisID) {
        PaisID = paisID;
    }
    public String getMonedaPrincipalCodigo() {
        return MonedaPrincipalCodigo;
    }
    public void setMonedaPrincipalCodigo(String monedaPrincipalCodigo) {
        MonedaPrincipalCodigo = monedaPrincipalCodigo;
    }
    public List<DireccionItems> getDireccionItems() {
        return DireccionItems;
    }
    public void setDireccionItems(List<DireccionItems> direccionItems) {
        DireccionItems = direccionItems;
    }

    //+++
    
}
