package com.finnegansfact.finnegans_chile.Entities;

import java.util.List;

public class Cliente {
    private String Nombre; 
    private String Codigo; 
    private Boolean Activo; 
    private String RazonSocial; 
    private Integer SituacionIIBB; 
    private String NroInscripcionIIBB; 
    private String Descripcion; 
    private String Email; 
    private String CategoriaFiscalCodigo; 
    private String IdentificacionTributariaCodigo; 
    private String IdentificacionTributariaNumero; 
    private String ConceptoClienteCodigo; 
    private String CuentaClienteCodigo;
    //

    private String GiroRecep; 
    private List<Direcciones> Direcciones; 
    
    public List<Direcciones> getDirecciones() {
        return Direcciones;
    }
    public void setDirecciones(List<Direcciones> direcciones) {
        Direcciones = direcciones;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
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
    public String getRazonSocial() {
        return RazonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }
    public Integer getSituacionIIBB() {
        return SituacionIIBB;
    }
    public void setSituacionIIBB(Integer situacionIIBB) {
        SituacionIIBB = situacionIIBB;
    }
    public String getNroInscripcionIIBB() {
        return NroInscripcionIIBB;
    }
    public void setNroInscripcionIIBB(String nroInscripcionIIBB) {
        NroInscripcionIIBB = nroInscripcionIIBB;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
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
    public String getIdentificacionTributariaNumero() {
        return IdentificacionTributariaNumero;
    }
    public void setIdentificacionTributariaNumero(String identificacionTributariaNumero) {
        IdentificacionTributariaNumero = identificacionTributariaNumero;
    }
    public String getConceptoClienteCodigo() {
        return ConceptoClienteCodigo;
    }
    public void setConceptoClienteCodigo(String conceptoClienteCodigo) {
        ConceptoClienteCodigo = conceptoClienteCodigo;
    }
    public String getCuentaClienteCodigo() {
        return CuentaClienteCodigo;
    }
    public void setCuentaClienteCodigo(String cuentaClienteCodigo) {
        CuentaClienteCodigo = cuentaClienteCodigo;
    }
    public String getGiroRecep() {
        return GiroRecep;
    }
    public void setGiroRecep(String giroRecep) {
        GiroRecep = giroRecep;
    }
    
    
}
