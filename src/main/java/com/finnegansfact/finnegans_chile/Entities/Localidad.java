package com.finnegansfact.finnegans_chile.Entities;

public class Localidad {
    private String Descripcion; 
    private String Codigo; 
    private String ProvinciaID; 
    private String Nombre; 
    private Boolean Activo;
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    public String getProvinciaID() {
        return ProvinciaID;
    }
    public void setProvinciaID(String provinciaID) {
        ProvinciaID = provinciaID;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Boolean getActivo() {
        return Activo;
    }
    public void setActivo(Boolean activo) {
        Activo = activo;
    } 
    
}
