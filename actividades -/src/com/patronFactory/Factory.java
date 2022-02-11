package com.patronFactory;

public class Factory {
    // lo hacemos singleton
    private static Factory instance;
    // es una buena practica poner las constantes para que cuando usen el constructor de la fábrica, sepan cuáles tienen disponibles
    public static final String PROD_CAJA = "CAJA10X10";
    public static final String PROD_PELOTA = "PELOTAFUTBOL";

    // armo los constructores privados. solo accesible por la instancia
    private Factory(){};
    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    };

    // creo el método de la fábrica. aca no hace falta el break porque ya esta el return que termina la función
    public Producto crearProd(String codigo){
        switch(codigo){
            case PROD_CAJA:
                System.out.println("Creando caja");
                return new Caja();
            case PROD_PELOTA:
                System.out.println("Creando pelota");
                return new Pelota();
            default:
                return null;
        }
    }
}
