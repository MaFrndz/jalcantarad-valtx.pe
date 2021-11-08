package com.finnegansfact.finnegans_chile.Entities;

import java.math.BigDecimal;

public class Concepto {
    private Integer ConceptoImporteGravado;
    private Boolean ImporteEditable; 
    private BigDecimal ConceptoImporte; 
    private String ConceptoCodigo;

    public Integer getConceptoImporteGravado() {
        return ConceptoImporteGravado;
    }
    public void setConceptoImporteGravado(Integer conceptoImporteGravado) {
        ConceptoImporteGravado = conceptoImporteGravado;
    }
    public Boolean getImporteEditable() {
        return ImporteEditable;
    }
    public void setImporteEditable(Boolean importeEditable) {
        ImporteEditable = importeEditable;
    }
    public BigDecimal getConceptoImporte() {
        return ConceptoImporte;
    }
    public void setConceptoImporte(BigDecimal conceptoImporte) {
        ConceptoImporte = conceptoImporte;
    }
    public String getConceptoCodigo() {
        return ConceptoCodigo;
    }
    public void setConceptoCodigo(String conceptoCodigo) {
        ConceptoCodigo = conceptoCodigo;
    }
}
