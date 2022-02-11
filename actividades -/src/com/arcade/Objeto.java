package com.arcade;

import java.util.Objects;

public class Objeto {
    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
    public void irA (int x, int y, char d) { //esto seria un setter
        this.posx = x;
        this.posy = y;
        this.direccion = d;
    }

    public int getPosx() {
        return posx;
    }
    public int getPosy() {
        return posy;
    }
    public char getDireccion() {
        return direccion;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }
    public void setPosy(int posy) {
        this.posy = posy;
    }
    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return posx == objeto.posx && posy == objeto.posy && direccion == objeto.direccion;
    }
    @Override
    public int hashCode() {
        return Objects.hash(posx, posy, direccion);
    }
}
