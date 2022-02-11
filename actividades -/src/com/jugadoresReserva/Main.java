package com.jugadoresReserva;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Seleccion seleccion = new Seleccion("ARGENTINA");

        seleccion.addJugador(new Jugador("ARQUERO","Pumpido",1));
        seleccion.addJugador(new Jugador("MEDIOCAMPISTA","Batista",2));
        seleccion.addJugador(new Jugador("DELANTERO","Balbo",3));
        seleccion.addJugador(new Jugador("MEDIOCAMPISTA","Basualdo",4));
        seleccion.addJugador(new Jugador("DEFENSOR","Bauza",5));
        seleccion.addJugador(new Jugador("DELANTERO","Calderon",6));
        seleccion.addJugador(new Jugador("MEDIOCAMPISTA","Burruchaga",7));
        seleccion.addJugador(new Jugador("DELANTERO","Caniggia",8));
        seleccion.addJugador(new Jugador("DELANTERO","Dezotti",9));
        seleccion.addJugador(new Jugador("MEDIOCAMPISTA","Maradona",10));
        seleccion.addJugador(new Jugador("DEFENSOR","Fabri",11));
        seleccion.addJugador(new Jugador("ARQUERO","Goycochea",12));
        seleccion.addJugador(new Jugador("DEFENSOR","Lorenzo",13));
        seleccion.addJugador(new Jugador("MEDIOCAMPISTA","Giusti",14));
        seleccion.addJugador(new Jugador("DEFENSOR","Monzon",15));
        seleccion.addJugador(new Jugador("MEDIOCAMPISTA","Olarticoechea",16));
        seleccion.addJugador(new Jugador("DEFENSOR","Sensini",17));
        seleccion.addJugador(new Jugador("DEFENSOR","Serrizuela",18));
        seleccion.addJugador(new Jugador("DEFENSOR","Ruggeri",19));
        seleccion.addJugador(new Jugador("DEFENSOR","Simon",20));
        seleccion.addJugador(new Jugador("MEDIOCAMPISTA","Troglio",21));
        seleccion.addJugador(new Jugador("ARQUERO","Cancelarich",22));
        seleccion.addJugador(new Jugador("ARQUERO","Comizzo",23));
//Prueba del método obtenerReservas()
        ArrayList<Jugador> jugadoresReserva = seleccion.obtenerReservas();
        System.out.println("Jugadores de Reserva");
        for(Jugador jugador: jugadoresReserva)
            System.out.println(jugador.getApellido());

//Prueba del método cantJugadores() y atrapar la excepción.
        // en el main uso el try para intentar ejecutar el software, y el catch para atrapar los errores definidos en las clases.
        try {
            System.out.println("Cantidad de Defensores: " + seleccion.cantJugadores("otro"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
