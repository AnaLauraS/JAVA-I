package com.patronFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory=Factory.getInstance();

        Almacen almacen=new Almacen("AD3");

        almacen.addProducto(factory.crearProd(Factory.PROD_CAJA));
        almacen.addProducto(factory.crearProd(Factory.PROD_CAJA));
        almacen.addProducto(factory.crearProd(Factory.PROD_PELOTA));

        System.out.println(almacen.calcularEspacioNecesario());
    }
}
