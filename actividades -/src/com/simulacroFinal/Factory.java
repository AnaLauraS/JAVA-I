package com.simulacroFinal;

public class Factory {
    // lo hacemos singleton
    private static Factory instance;
    // es una buena practica poner las constantes para que cuando usen el constructor de la fábrica, sepan cuáles tienen disponibles
    public static final String OF_C = "CURSO";
    public static final String OF_P = "PROGRAMA";

    // armo los constructores privados. solo accesible por la instancia
    private Factory(){};
    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    };

    // creo el método de la fábrica. aca no hace falta el break porque ya esta el return que termina la función
    public OfertaAcademica crearOferta(String codigo){
        switch(codigo){
            case OF_C:
                System.out.println("Creando curso");
                return new Curso();
            case OF_P:
                System.out.println("Creando programa");
                return new Programa();
            default:
                return null;
        }
    }
}
