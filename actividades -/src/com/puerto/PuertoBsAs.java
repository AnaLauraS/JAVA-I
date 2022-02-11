package com.puerto;

import java.util.ArrayList;
import java.util.List;

public class PuertoBsAs {
    private String nombre;
    //pongo list (o tipo de colección), entre ganchitos la clase, y luego el nombre del conjunto.
    private List<Contenedor> contenedores;

    //Lo instancio como arraylist en el constructor, que crea una lista vacía
    public PuertoBsAs(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }

    public void addCont(Contenedor contenedor) {
        this.contenedores.add(contenedor); 
    }

    public void mostrar() {
        //puedo usar cualquiera de los dos siguientes, dan el mismo resultado
        //this.contenedores.sort(Contenedor::compareTo);
        contenedores.sort(null);
        for (Contenedor contenedor: this.contenedores) {
            System.out.println(contenedor.getId() + " del pais " + contenedor.getPais());
        }
    }

    public int cantPel() {
        List<Contenedor> peligrosos = new ArrayList<>();
        for (Contenedor contenedor: this.contenedores) {
            if (contenedor.getPais()=="Desconocido" && contenedor.isMatPel()){
                peligrosos.add(contenedor);
            }
        }
        return peligrosos.size();

        // tambien lo puedo hacer con un simple contador:
        /*int cantidad=0;
        for (Contenedor contenedor: this.contenedores) {
            if (contenedor.getPais()=="Desconocido" && contenedor.isMatPel()){
                cantidad++;
            }
        }
        return cantidad;*/
    }
}
