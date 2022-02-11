package com.digitalProject;

public class Main {
    public static void main(String[] args) {
        ProjectManager pm1= new ProjectManager("ana","laura", 35159510,"AS35");
        Proyecto proy1 = new ProyectoAgil("20/05/21","30/07/21","20/05/21","30/07/21", 5,"algo");
        Proyecto proy2 = new ProyectoTradicional("20/05/21","30/07/21","20/05/21","01/08/21", "Diseño");
        Proyecto proy3 = new ProyectoAgil("20/05/21","30/07/21","20/05/21","30/07/21", 10,"algo");

        // comparo proy1 con el proy3. El primero es más chico, por lo que deberia devolver -1
        System.out.println(((ProyectoAgil)proy1).compareTo((ProyectoAgil)proy3));
        // veo si el proy2 terminó en fecha
        System.out.println(proy2.terminoEnFecha());
        // compruebo si está en fase de diseño
        System.out.println(((ProyectoTradicional)proy2).estaEnDiseño());
    }
}
