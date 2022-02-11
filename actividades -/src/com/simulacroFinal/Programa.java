package com.simulacroFinal;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademica{
    private double porcentaje;
    private List<OfertaAcademica> cursos = new ArrayList<>();

    public Programa(String nombre, String descripcion, double porcentaje) {
        super(nombre, descripcion);
        this.porcentaje = porcentaje;
    }
    public Programa(){};

    public double getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void addCurso (OfertaAcademica curso) {
        this.cursos.add(curso);
    }

    @Override
    public double precio() {
        double suma=0;
        for (OfertaAcademica e: cursos) {
            suma+=e.precio();
        }
        return suma*(1-this.getPorcentaje());
    }
}
