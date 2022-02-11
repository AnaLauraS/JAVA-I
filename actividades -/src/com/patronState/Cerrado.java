package com.patronState;

public class Cerrado implements Estado{
    private Carrito t;

    public Cerrado (Carrito t) {
        this.t = t;
        System.out.println("Estado cerrado");
    };

    @Override
    public void addProd(Producto p) {
        System.out.println("no podes agregar más productos");
    }

    @Override
    public void cancelar() {
        System.out.println("no podes cancelar, ya es tarde");
    }

    @Override
    public void volver() {
        System.out.println("no podes volver, ya es tarde");
    }

    @Override
    public void siguiente() {
        this.t.setEstado(new Vacio(t));
        System.out.println("pasando a estado vacio");
    }
}
