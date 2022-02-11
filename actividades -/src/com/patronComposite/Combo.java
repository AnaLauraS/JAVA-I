package com.patronComposite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Figura{
    private List<Figura> figuras;
    private String nombre;

    public Combo(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    };
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addFig (Figura f){
        this.figuras.add(f);
    }

    @Override
    public double area() {
        double suma =0;
        for (Figura fig : figuras){
            suma+= fig.area();
        } return suma;
    }
}
