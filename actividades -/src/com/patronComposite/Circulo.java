package com.patronComposite;

public class Circulo implements Figura{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    };
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return this.getRadio()*this.getRadio()*3.14;
    }
}
