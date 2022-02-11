public class Clase5 {
    public static void main(String[] args) {
        UsuarioJuego nuevo = new UsuarioJuego("misami", "clavecita");
        nuevo.mostrar();
        nuevo.aumentarPuntaje();
        nuevo.subirNivel();
        nuevo.mostrar();
        nuevo.bonus(5.7);
        nuevo.mostrar();
        nuevo.setPuntaje(2.3);
        nuevo.setNivel(7);
        nuevo.mostrar();

        Perro n=new Perro();
        n.setNacimiento();
        n.getNacimiento();
        n.setRaza();
        System.out.println(n.getRaza());

    }
}
