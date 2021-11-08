package com.finnegansfact.finnegans_chile.Entities;

import java.util.List;

public class DimensionDistribucion {
    private String tipoCalculo;
    private String distribucionCodigo;
    private List<distribucionItem> distribucionItems;
    private String dimensionCodigo;
    public String getTipoCalculo() {
        return tipoCalculo;
    }
    public void setTipoCalculo(String tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }
    public String getDistribucionCodigo() {
        return distribucionCodigo;
    }
    public void setDistribucionCodigo(String distribucionCodigo) {
        this.distribucionCodigo = distribucionCodigo;
    }
    public List<distribucionItem> getDistribucionItems() {
        return distribucionItems;
    }
    public void setDistribucionItems(List<distribucionItem> distribucionItems) {
        this.distribucionItems = distribucionItems;
    }
    public String getDimensionCodigo() {
        return dimensionCodigo;
    }
    public void setDimensionCodigo(String dimensionCodigo) {
        this.dimensionCodigo = dimensionCodigo;
    }
}
