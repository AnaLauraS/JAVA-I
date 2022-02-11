package com.patronesConsolidados;

public class Main {
    public static void main(String[] args) {
        Reparación batidora = new Reparación("batidora","direccion 1");
        StateFactory factory = StateFactory.getInstance();

        batidora.darValorPresupuesto(20.7);
        //batidora.siguientePaso();
        batidora.siguientePaso(factory.fabricarEstado(StateFactory.EST_ENREP, batidora));
        batidora.agregarRepuestos(100);
        //batidora.siguientePaso();
        batidora.siguientePaso(factory.fabricarEstado(StateFactory.EST_PARAENVIO, batidora));
        batidora.cambiarDireccion("otra calle");
        //batidora.siguientePaso();
        batidora.siguientePaso(factory.fabricarEstado(StateFactory.EST_FIN, batidora));
        batidora.cambiarDireccion("otro");
    }
}
