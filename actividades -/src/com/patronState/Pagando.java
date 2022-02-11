package com.patronState;

public class Pagando implements Estado{
    private Carrito t;

    public Pagando (Carrito t) {
        this.t = t;
        System.out.println("Estado pagando");
    };

    @Override
    public void addProd(Producto p) {
        System.out.println("no podes agregar más productos");
    }

    @Override
    public void cancelar() {
        this.t.setEstado(new Vacio(t));
        System.out.println("pasando a estado vacio");
    }

    @Override
    public void volver() {
        this.t.setEstado(new Cargando(t));
        System.out.println("pasando a estado cargando");
    }

    @Override
    public void siguiente() {
        this.t.setEstado(new Cerrado(t));
        System.out.println("pasando a estado cerrado");
    }
}
