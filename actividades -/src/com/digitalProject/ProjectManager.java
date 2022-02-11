package com.digitalProject;

public class ProjectManager {
    private String nombre;
    private String apellido;
    private int dni;
    private String legajo;

    // constructor
    public ProjectManager(String nombre, String apellido, int dni, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
    }

    // setters y getters
    public String getNombre() {
        return nombre;
    };
    public void setNombre(String nombre) {
        this.nombre = nombre;
    };
    public String getApellido() {
        return apellido;
    };
    public void setApellido(String apellido) {
        this.apellido = apellido;
    };
    public int getDni() {
        return dni;
    };
    public void setDni(int dni) {
        this.dni = dni;
    };
    public String getLegajo() {
        return legajo;
    };
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}
