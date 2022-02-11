package com.digitalProject;

public class ProyectoTradicional extends Proyecto {
    private String fase;

    // constructor
    public ProyectoTradicional(String fechaInicio, String fechaFin, String fechaRealI, String fechaRealF, String fase) {
        super(fechaInicio, fechaFin, fechaRealI, fechaRealF);
        this.fase = fase;
    }

    // metodo si está en fase de diseño
    public boolean estaEnDiseño() {
        return this.getFase().equals("Diseño");
    }

    // getters y setters
    public String getFase() {
        return fase;
    };
    public void setFase(String fase) {
        this.fase = fase;
    }
}
