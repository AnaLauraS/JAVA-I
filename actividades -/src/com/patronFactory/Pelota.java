package com.patronFactory;

public class Pelota extends Producto{
    private double radio;

    public Pelota(){
        this.radio=11.;
    };
    public Pelota(double radio) {
        this.radio = radio;
    }
    public Pelota(double peso, double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return 4/3*3.14*this.getRadio();
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
