package com.arcade;

import java.util.Objects;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida=3;
    }

    @Override
    public void irA(int x, int y, char d) {
        if (this.getDireccion()!=d){
            this.girar(d);
        }super.irA(x, y, d);
    }

    public void girar(char d){
        super.setDireccion(d);
    }
    public void restaVida (int n){
        this.vida--;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "posx=" + getPosx() +
                ", posy=" + getPosy() +
                ", direccion=" + getDireccion() +
                ", velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Double.compare(nave.velocidad, velocidad) == 0 && vida == nave.vida && super.equals(o);
    }
    @Override
    public int hashCode() {
        return Objects.hash(velocidad, vida) + super.hashCode();
    }
}
