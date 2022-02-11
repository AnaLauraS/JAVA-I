package com.puerto;

public class Main {
    public static void main(String[] args) {
        PuertoBsAs p = new PuertoBsAs("nn");
        Contenedor a=new Contenedor(23, "Desconocido", true);
        Contenedor b=new Contenedor(24, "Rusia", true);
        Contenedor d=new Contenedor(78, "España", false);
        Contenedor e=new Contenedor(8, "Desconocido", false);
        Contenedor f=new Contenedor(3, "Desconocido", true);
        Contenedor g=new Contenedor(923, "Rusia", true);

        p.addCont(a); p.addCont(b);
        p.addCont(e); p.addCont(d);
        p.addCont(f); p.addCont(g);

        p.mostrar();
        System.out.println(p.cantPel());
    }
}
