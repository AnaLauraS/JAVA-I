package com.simulacroFinal;

public class Curso extends OfertaAcademica{
    private int cantHorasMes;
    private int cantMeses;
    private double valorHora;

    public Curso(String nombre, String descripcion, int cantHorasMes, int cantMeses, double valorHora) {
        super(nombre, descripcion);
        this.cantHorasMes = cantHorasMes;
        this.cantMeses = cantMeses;
        this.valorHora = valorHora;
    }
    public Curso(){};

    public int getCantHorasMes() {
        return cantHorasMes;
    }
    public void setCantHorasMes(int cantHorasMes) {
        this.cantHorasMes = cantHorasMes;
    }
    public int getCantMeses() {
        return cantMeses;
    }
    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double precio() {
        return this.getCantHorasMes()*this.getCantMeses()*this.getValorHora();
    }
}
