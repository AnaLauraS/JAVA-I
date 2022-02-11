package com.digitalProject;

public class ProyectoAgil extends Proyecto implements Comparable{
    private int sprints;
    private int sprintActual;
    private String descripcion;

    // constructor


    public ProyectoAgil(String fechaInicio, String fechaFin, String fechaRealI, String fechaRealF, int sprints, String descripcion) {
        super(fechaInicio, fechaFin, fechaRealI, fechaRealF);
        this.sprints = sprints;
        this.sprintActual = 1;
        this.descripcion = descripcion;
    }

    // comparación por cantidad de sprints
    @Override
    public int compareTo(Object o) {
        // primero casteo el objeto
        ProyectoAgil proy = (ProyectoAgil) o;

        //aca comparo
        if (this.getSprints()>((ProyectoAgil) o).getSprints()){
            return 1;
        }else if (this.getSprints()==((ProyectoAgil) o).getSprints()){
            return 0;
        }else {
            return -1;
        }
    }

    // getters y setters
    public int getSprints() {
        return sprints;
    };
    public void setSprints(int sprints) {
        this.sprints = sprints;
    };
    public int getSprintActual() {
        return sprintActual;
    };
    public void setSprintActual(int sprintActual) {
        this.sprintActual = sprintActual;
    };
    public String getDescripcion() {
        return descripcion;
    };
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
