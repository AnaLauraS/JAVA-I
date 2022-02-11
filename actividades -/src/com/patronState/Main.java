package com.patronState;

public class Main {
    public static void main(String[] args) {
        Carrito car = new Carrito("car");
        System.out.println(car.getEstado());
        car.siguiente();
        car.cancelar();

        car.getEstado().addProd(new Producto("li",4.6));
        System.out.println(car.getEstado());
    }
}
