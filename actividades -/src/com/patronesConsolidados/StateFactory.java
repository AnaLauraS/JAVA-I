package com.patronesConsolidados;
// creo una fábrica de estados para cumplir con la consigna de patrones Factory y Singleton

public class StateFactory {
    // lo hacemos singleton
    private static StateFactory instance;
    // es una buena practica poner las constantes para que cuando usen el constructor de la fábrica, sepan cuáles tienen disponibles
    public static final String EST_ENPRES = "Hacia: En presupuesto";
    public static final String EST_ENREP = "Hacia: En reparación";
    public static final String EST_PARAENVIO = "Hacia: para envío";
    public static final String EST_FIN = "Hacia: finalizado";

    // armo los constructores privados. solo accesible por la instancia
    private StateFactory(){};
    public static StateFactory getInstance(){
        if(instance == null){
            instance = new StateFactory();
        }
        return instance;
    };

    // creo el método de la fábrica. aca no hace falta el break porque ya esta el return que termina la función
    public Estado fabricarEstado (String codigo, Reparación t){
        switch(codigo){
            case EST_ENPRES:
                System.out.println("El producto "+t.getNombre()+" cambió a estado 'en preparación'. Su dirección de entrega es "+ t.getDireccion());
                return new EnPresupuesto(t);
            case EST_ENREP:
                System.out.println("El producto " + t.getNombre() + " cambió a estado 'en reparación'. Su dirección de entrega es " + t.getDireccion());
                return new EnReparacion(t);
            case EST_PARAENVIO:
                System.out.println("El producto " + t.getNombre() + " cambió a estado 'para envio'. Su dirección de entrega es " + t.getDireccion());
                return new ParaEnvio(t);
            case EST_FIN:
                System.out.println("El producto " + t.getNombre() + " cambió a estado 'finalizado'. Su dirección de entrega es " + t.getDireccion());
                return new Finalizado(t);
            default:
                return null;
        }
    }
}

