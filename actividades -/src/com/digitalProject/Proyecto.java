package com.digitalProject;

public abstract class Proyecto {
    private String fechaInicio;
    private String fechaFin;
    private String fechaRealI;
    private String fechaRealF;
    private String status;
    private ProjectManager pm;

    // constructor
    public Proyecto(String fechaInicio, String fechaFin, String fechaRealI, String fechaRealF) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaRealI = fechaRealI;
        this.fechaRealF = fechaRealF;
        this.status="En inicio";
    }

    // método
    public boolean terminoEnFecha(){
        return this.getFechaFin()==this.getFechaRealF();
    }

    // getters y setters
    public String getFechaInicio() {
        return fechaInicio;
    };
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    };
    public String getFechaFin() {
        return fechaFin;
    };
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    };
    public String getFechaRealI() {
        return fechaRealI;
    };
    public void setFechaRealI(String fechaRealI) {
        this.fechaRealI = fechaRealI;
    };
    public String getFechaRealF() {
        return fechaRealF;
    };
    public void setFechaRealF(String fechaRealF) {
        this.fechaRealF = fechaRealF;
    };
    public String getStatus() {
        return status;
    };
    public void setStatus(String status) {
        this.status = status;
    };
    public ProjectManager getPM() {
        return pm;
    };
    public void setPm(ProjectManager pm) {
        this.pm = pm;
    }
}
