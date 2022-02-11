import java.util.ArrayList;
import java.util.List;

public class Combinada extends Habilidad{
    private int factorMultiplicador;
    // considero que Combinada puede tener una lista de habilidades simples e incluso de otras combinadas --> patron composite
    private List<Habilidad> habilidades;

    // constructor vacio para ser usado en la fábrica
    public Combinada () {
        this.habilidades = new ArrayList<>();
    };

    // getters and setters
    public int getFactorMultiplicador() {
        return factorMultiplicador;
    }
    // set del Factor Multiplicador con una excepcion
    public void setFactorMultiplicador(int factorMultiplicador) throws Exception {
        if (factorMultiplicador < 1) {
            throw new Exception("El factor multiplicador debe ser como mínimo 1");
        } else {
            this.factorMultiplicador = factorMultiplicador;
        }
    }
    public void addHabilidad (Habilidad e){
        this.habilidades.add(e);
    }

    // metodo para completar los datos del personaje y decir cuantas habilidades comprenden una habilidad combinada
    public int cantHab () {
        return this.habilidades.size();
    }

    // implemento método de la clase abstracta
    @Override
    public double calcularPuntaje() {
        double suma=0;
        for (Habilidad e: habilidades) {
            suma+=e.calcularPuntaje();
        }
        return suma*(this.getFactorMultiplicador());
    }
}
