package com.patronState;

public class Cargando implements Estado{
    private Carrito t;

    public Cargando (Carrito t) {
        this.t = t;
        System.out.println("Estado cargando");
    };

    @Override
    public void addProd(Producto p) {
        this.t.addProd(p);
        System.out.println("un producto agregado");
    }

    @Override
    public void cancelar() {
        this.t.setEstado(new Vacio(t));
        System.out.println("pasando a estado vacio");
    }

    @Override
    public void volver() {
        this.t.setEstado(new Vacio(t));
        System.out.println("pasando a estado vacio");
    }

    @Override
    public void siguiente() {
        this.t.setEstado(new Pagando(t));
        System.out.println("pasando a estado pagando");
    }
}
