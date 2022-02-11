package com.patronesConsolidados;

public class Reparación {
    private String nombre;
    private double costo;
    private String direccion;
    private Estado estado;

    // constructor
    public Reparación(String nombre, String direccion) {
        this.nombre = nombre;
        this.costo = 0;
        this.direccion = direccion;
        this.estado = new EnPresupuesto(this);
    }

    // metodos que van a implementar segun el estado
    public void cambiarDireccion (String e){
        estado.cambiarDireccion(e);
    }
    public void darValorPresupuesto (double e){
        estado.darValorPresupuesto(e);
    }
    public void agregarRepuestos (double e){
        estado.agregarRepuestos(e);
    }
    public void siguientePaso (Estado t){
        this.setEstado(t);
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    };
    public void setNombre(String nombre) {
        this.nombre = nombre;
    };
    public double getCosto() {
        return costo;
    };
    public void setCosto(double costo) {
        this.costo = costo;
    };
    public String getDireccion() {
        return direccion;
    };
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    };
    public Estado getEstado() {
        return estado;
    };
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
