package com.universidad;

public class ExamenParcial extends Examen{
    private int unidad;
    private int reintentos;

    public ExamenParcial(String titulo, String enunciado, double nota, int unidad) {
        super(titulo, enunciado, nota);
        this.unidad = unidad;
        this.reintentos = 1;
    };

    public boolean sePuedeRecuperar(){
        int intentosPosibles;
        if (this.getUnidad()<=3){
            intentosPosibles=3;
        }else {
            intentosPosibles=2;
        };
        return this.getReintentos() < intentosPosibles; //si no digo nada, lo que devuelve es una evaluación de los atributos ahi puestos
    };

    public int getUnidad() {
        return unidad;
    };
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    };
    public int getReintentos() {
        return reintentos;
    };
    public void setReintentos(int reintentos) {
        this.reintentos = reintentos;
    };
}
