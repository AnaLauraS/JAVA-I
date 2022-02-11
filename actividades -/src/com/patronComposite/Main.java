package com.patronComposite;

public class Main {
    public static void main(String[] args) {
        Circulo circ1 = new Circulo(2);
        Cuadrado cua1 = new Cuadrado(2,1);
        Triangulo tri1 = new Triangulo(1,2);
        Triangulo tri2 = new Triangulo(1,2);

        Combo combo1 = new Combo("combo1");
        combo1.addFig(circ1);
        combo1.addFig(cua1);

        Combo combo2 = new Combo("combo2");
        combo2.addFig(tri1);
        combo2.addFig(tri2);

        combo1.addFig(combo2);

        System.out.println(circ1.area());
        System.out.println(cua1.area());
        System.out.println(tri1.area());
        System.out.println(combo2.area());
        System.out.println(combo1.area());
    }
}
