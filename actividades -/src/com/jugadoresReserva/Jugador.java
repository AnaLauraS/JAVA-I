package com.jugadoresReserva;

public class Jugador {
    private String posicion;
    private String apellido;
    private int camiseta;

    public Jugador(String posicion, String apellido, int camiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.camiseta = camiseta;
    };

    public String getPosicion() {
        return posicion;
    };
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    };
    public String getApellido() {
        return apellido;
    };
    public void setApellido(String apellido) {
        this.apellido = apellido;
    };
    public int getCamiseta() {
        return camiseta;
    };
    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }
}
