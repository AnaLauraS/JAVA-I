package com.jugadoresReserva;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String nombrePais;
    private List<Jugador> equipo = new ArrayList<>(); // 11 titulares, 7 suplentes, 5 reserva

    // dos constructores. uno sin equipo. Recordar instanciar la colección
    public Seleccion(String nombrePais, List<Jugador> equipo) {
        this.nombrePais = nombrePais;
        this.equipo = equipo;
    };
    public Seleccion(String nombrePais) {
        this.nombrePais = nombrePais;
        this.equipo = new ArrayList<>();
    };

    // getter y setter
    public String getNombrePais() {
        return nombrePais;
    };
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    };
    public List<Jugador> getEquipo() {
        return equipo;
    }

    //agregar y sacar jugadores
    public void addJugador (Jugador a){
        this.equipo.add(a);
    };
    public void eliminarJugador (Jugador a) {
        this.equipo.remove(a);
    }

    //método obtenerReservas que devuelva a todos los jugadores de reserva de la selección.
    public ArrayList<Jugador> obtenerReservas () {
        ArrayList<Jugador> reserva = new ArrayList<>();
        for (int i=this.equipo.size()-1; i>17; i--){
            reserva.add(this.equipo.get(i));
        }
        return reserva;
    }

    //método cantJugadores que recibe como parámetro una posición y devuelva la cantidad de jugadores en esa posición. Si la posición no es ninguna de las mencionadas arrojar una excepción. */
    public int cantJugadores (String b) throws Error {
        int contador=0;
        for (Jugador jugador: this.equipo){
            if (jugador.getPosicion().equals(b)){
             contador++;
          }
        }
        if (contador!=0){
          return contador;
        }
        else { //aca le digo que va a tirar un error si no cumple con una condición, y detallo el testo del error
            throw new Error("No existe la posición");
        }
    };
}
