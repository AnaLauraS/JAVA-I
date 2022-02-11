package com.universidad;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("misami", "kamizami", "DS34");
        Examen final1 = new ExamenFinal("hola", "algo", 5, 6.7, "tema");
        Examen final2 = new ExamenFinal("hola", "algo", 8, 9.7, "tema");

        System.out.println(((ExamenFinal)final1).compareTo(final2));
    }
}
