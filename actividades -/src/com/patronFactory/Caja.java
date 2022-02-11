package com.patronFactory;

public class Caja extends Producto{
    private double longitud;
    private double ancho;
    private double altura;

    public Caja () {
        this.longitud=10.;
        this.ancho=10.;
        this.altura=10.;
    };
    public Caja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }
    public Caja(double peso, double longitud, double ancho, double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        return this.getAltura()*this.getAncho()*this.getLongitud();
    }

    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
