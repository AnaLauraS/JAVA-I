public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje=0.0;
    private int nivel=0;

    public UsuarioJuego (String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public void aumentarPuntaje () {
        this.puntaje+=1;
    }
    public void subirNivel () {
        this.nivel+=1;
    }
    public void bonus (Double cant) {
        this.puntaje+=cant;
    }
    public void mostrar () {
        System.out.println(this.nombre+", clave: "+this.clave+", puntaje: "+this.puntaje+", nivel: "+this.nivel);
    }
    public void setPuntaje (Double valor) {
        this.puntaje=valor;
    }
    public void setNivel (int valor) {
        this.nivel=valor;
    }


}
