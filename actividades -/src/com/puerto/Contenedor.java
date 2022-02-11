package com.puerto;

public class Contenedor implements Comparable<Contenedor> { //comparable para ordenar objetos en lista.
    private int id;
    private String pais;
    private boolean matPel;

    public Contenedor(int id, String pais, boolean matPel) {
        this.id = id;
        this.pais = pais;
        this.matPel = matPel;
    };

    public int getId() {
        return id;
    };
    public void setId(int id) {
        this.id = id;
    };
    public String getPais() {
        return pais;
    };
    public void setPais(String pais) {
        this.pais = pais;
    };
    public boolean isMatPel() {
        return matPel;
    };
    public void setMatPel(boolean matPel) {
        this.matPel = matPel;
    };

    @Override
    public int compareTo(Contenedor o) {
        return this.getId()-o.getId();
    }
}
