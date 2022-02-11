package com.jugadoresReserva;

public class Error extends Exception{
    public Error(){
        super();
    }
    public Error(String m){
        super(m);
    }
    // aca defino el inicio del texto del error
    public String toString () {
        return "Se produjo el siguiente error: "+this.getMessage();
    }
}
