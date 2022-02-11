package com.patronFactory;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private String nombre;
    private List<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addProducto(Producto prod) {
        this.productos.add(prod);
    }

    public double calcularEspacioNecesario() {
        //calcular volumen total de tdos los productos
        double total = 0.;
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i) instanceof Caja) {
                total += ((Caja) this.productos.get(i)).calcularEspacio();
            } else {
                total += ((Pelota) this.productos.get(i)).calcularEspacio();
            }
        }return total;
    }
}
