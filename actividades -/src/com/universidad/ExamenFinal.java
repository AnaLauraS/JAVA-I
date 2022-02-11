package com.universidad;

public class ExamenFinal extends Examen implements Comparable{
    private double notaOral;
    private String descOral;

    public ExamenFinal(String titulo, String enunciado, double nota, double notaOral, String descOral) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descOral = descOral;
    };

    public double getNotaOral() {
        return notaOral;
    };
    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    };
    public String getDescOral() {
        return descOral;
    };
    public void setDescOral(String descOral) {
        this.descOral = descOral;
    };

    @Override
    public boolean estaAprobado() {
        return (super.estaAprobado() && this.getNotaOral() >= 4);
    };

    @Override
    public int compareTo(Object o) {
        // primero casteo el objeto
        ExamenFinal examenFinal = (ExamenFinal)o;
        // hago los promedios para comparar
        double promedioThis = this.getPromedioNotas();
        double primedioOtro = examenFinal.getPromedioNotas();
        //aca comparo
        if (promedioThis>primedioOtro){
            return 1;
        }else if (promedioThis==primedioOtro){
            return 0;
        }else {
            return -1;
        }
    };

    //creo la funcion que voy a usar en el compareTo
    private double getPromedioNotas(){
        return (super.getNota()+this.getNotaOral())/2;
    }
}
