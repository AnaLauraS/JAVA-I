package com.patronFactory;

public abstract class Producto {
    private double peso;

    public Producto(){};
    public Producto(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspacio();
}
