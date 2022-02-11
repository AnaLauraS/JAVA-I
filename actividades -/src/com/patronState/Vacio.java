package com.patronState;

public class Vacio implements Estado{
    // debe estar la clase a la que hace referencia el estado
    private Carrito t;

    public Vacio(Carrito t) {
        this.t = t;
        System.out.println("Estado vacio");
    };

    @Override
    public void addProd(Producto p) {
        this.t.addProd(p);
        this.t.setEstado(new Cargando(t));
        System.out.println("pasando a estado cargando porque agregaste un producto");
    }

    @Override
    public void cancelar() {
        System.out.println("no podemos cancelar si no hiciste nada");
    }

    @Override
    public void volver() {
        System.out.println("no tenemos punto anterior al que volver");
    }

    @Override
    public void siguiente() {
        // para cambiar de estado, uso el método setEstado, y debo instanciar el nuevo estado
        this.t.setEstado(new Cargando(t));
        System.out.println("pasando a estado cargando");
    }

}
