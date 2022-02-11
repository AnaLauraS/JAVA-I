package com.patronState;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private Estado estado;
    private List<Producto> productos;
    private String nombre;

    // constructor
    public Carrito(String nombre) {
        // siempre hay un estado inicial, y este es un new de la interfaz.
        this.estado = new Vacio(this);
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    // getters and setters
    public Estado getEstado() {
        // para que se lea lindo esto, hay que hacer un toString
        return estado;
    };
    public void setEstado(Estado estado) {
        this.estado = estado;
    };
    public String getNombre() {
        return nombre;
    };
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addProd (Producto p){
        this.productos.add(p);
    }

    // delego las acciones a los estados:
    public void cancelar(){
        estado.cancelar();
    };
    public void volver(){
        estado.volver();
    };
    public void siguiente(){
        estado.siguiente();
    }
}
