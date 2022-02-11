import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private List<Habilidad> habilidadList;

    // constructor
    public Personaje (String nombre) {
        this.nombre = nombre;
        this.habilidadList = new ArrayList<>();
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // agrego ofertas
    public void addHab (Habilidad e) {
        this.habilidadList.add(e);
    }

    // metodo especifico que pide la consigna
    public void susHabilidades () {
        for (Habilidad e : habilidadList) {
            if (e instanceof Simple) {
                System.out.println("Habilidad simple: " + e.getNombre() + ", que tiene un puntaje de " + e.calcularPuntaje());
            } else {
                System.out.println("Habilidad combinada: " + e.getNombre() + ", con factor multiplicador de " + ((Combinada)e).getFactorMultiplicador() + " y con " + ((Combinada)e).cantHab() + " habilidades, tiene un puntaje de " + e.calcularPuntaje());
            }
        }
    }
}
