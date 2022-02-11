package com.arcade;

import java.util.Objects;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char d) {
        super.irA(x, y, d);
        //Los asteroides pueden ir a cualquier posición sin importar su dirección actual. Entonces no sé porque sería una sobreescritura.
    }

    public int getLesion() {
        return lesion;
    }
    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "posx=" + getPosx() +
                ", posy=" + getPosy() +
                ", direccion=" + getDireccion() +
                ", lesion=" + lesion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asteroide asteroide = (Asteroide) o;
        return lesion == asteroide.lesion && super.equals(o);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lesion) + super.hashCode();
    }
}
