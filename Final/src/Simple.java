public class Simple extends Habilidad{
    private double puntaje;

    // constructor vacio para ser usado en la fábrica
    public Simple () {};

    // getters and setters
    public double getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    // implemento método de la clase abstracta
    @Override
    public double calcularPuntaje() {
        if (this.getNombre()=="Disparar"){
            return this.getPuntaje()*1.1;
        } else {
            return this.getPuntaje();
        }
    }
}
