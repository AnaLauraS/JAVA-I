package com.simulacroFinal;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertas;

    // constructor
    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // agrego ofertas
    public void addOfertas(OfertaAcademica e) {
        this.ofertas.add(e);
    }

    // metodo especifico que pide la consigna
    public void generarInforme() {
        for (OfertaAcademica e : ofertas) {
            if (e instanceof Curso) {
                System.out.println("Curso: " + e.getNombre() + ", precio: " + e.precio());
            } else {
                System.out.println("Programa intensivo: " + e.getNombre() + ", precio: " + e.precio());
            }
        }
    }
}
