package com.banco_nacion;

public class Cliente {
    private int nro;
    private String apellido;
    private int DNI;
    private int CUIT;

    public Cliente(int nro, String apellido, int DNI, int CUIT) {
        this.nro = nro;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

    public int getNro() {
        return nro;
    }
    public void setNro(int nro) {
        this.nro = nro;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public int getCUIT() {
        return CUIT;
    }
    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }
}
