package com.finnegansfact.finnegans_chile.Entities;

import java.util.List;

public class Producto {
    private String ProductoCodigo;
    private Integer CantidadStock2;
    private Integer Cantidad;
    private String vinculacionOrigen;
    private Integer PrecioTipo;
    private Integer VinculacionIDOrigen;
    private String Descripcion;

    private List<DimensionDistribucion> DimensionDistribuciones; 

    private Integer Precio;

    public String getProductoCodigo() {
        return ProductoCodigo;
    }

    public void setProductoCodigo(String productoCodigo) {
        ProductoCodigo = productoCodigo;
    }

    public Integer getCantidadStock2() {
        return CantidadStock2;
    }

    public void setCantidadStock2(Integer cantidadStock2) {
        CantidadStock2 = cantidadStock2;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public String getVinculacionOrigen() {
        return vinculacionOrigen;
    }

    public void setVinculacionOrigen(String vinculacionOrigen) {
        this.vinculacionOrigen = vinculacionOrigen;
    }

    public Integer getPrecioTipo() {
        return PrecioTipo;
    }

    public void setPrecioTipo(Integer precioTipo) {
        PrecioTipo = precioTipo;
    }

    public Integer getVinculacionIDOrigen() {
        return VinculacionIDOrigen;
    }

    public void setVinculacionIDOrigen(Integer vinculacionIDOrigen) {
        VinculacionIDOrigen = vinculacionIDOrigen;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public List<DimensionDistribucion> getDimensionDistribuciones() {
        return DimensionDistribuciones;
    }

    public void setDimensionDistribuciones(List<DimensionDistribucion> dimensionDistribuciones) {
        DimensionDistribuciones = dimensionDistribuciones;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }    
    
}
