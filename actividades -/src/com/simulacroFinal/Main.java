package com.simulacroFinal;

public class Main {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("Colegio");

        // "siempre mantener los objetos de la manera más general posible". Creo con fábrica y con los setters le pongo los atributos
        OfertaAcademica curso1 = Factory.getInstance().crearOferta(Factory.OF_C);
        curso1.setNombre("Front End");
        ((Curso)curso1).setCantHorasMes(16);
        ((Curso)curso1).setCantMeses(2);
        ((Curso)curso1).setValorHora(1000);

        OfertaAcademica curso2 = Factory.getInstance().crearOferta(Factory.OF_C);
        curso2.setNombre("Back End");
        ((Curso)curso2).setCantHorasMes(20);
        ((Curso)curso2).setCantMeses(2);
        ((Curso)curso2).setValorHora(900);

        OfertaAcademica curso3 = Factory.getInstance().crearOferta(Factory.OF_P);
        curso3.setNombre("Full Stack");
        ((Programa)curso3).setPorcentaje(0.2);
        ((Programa)curso3).addCurso(curso1);
        ((Programa)curso3).addCurso(curso2);

        // agrego los cursos y genero el informe
        instituto.addOfertas(curso1);
        instituto.addOfertas(curso2);
        instituto.addOfertas(curso3);
        instituto.generarInforme();
    }
}
