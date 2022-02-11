package com.simulacroFinal;
// lo hago como clase abstracta. Pero si lo que quiero es usar composite, debe ser una interface, no una clase.

public abstract class OfertaAcademica {
    private String nombre;
    private String descripcion;

    // constructores
    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public OfertaAcademica() {
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // método que debe definir como aplicar cada clase
    public abstract double precio();
}