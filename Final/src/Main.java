public class Main {
    public static void main(String[] args) throws Exception {
        Personaje pers = new Personaje("Anika");

        // creo habilidades
        Habilidad hab1 = Factory.getInstance().crearHabilidad(Factory.HAB_S);
        hab1.setNombre("Saltar");
        ((Simple)hab1).setPuntaje(7.5);

        Habilidad hab2 = Factory.getInstance().crearHabilidad(Factory.HAB_S);
        hab2.setNombre("Disparar");
        ((Simple)hab2).setPuntaje(10);

        Habilidad hab3 = Factory.getInstance().crearHabilidad(Factory.HAB_C);
        hab3.setNombre("Disparo-al-saltar");
        ((Combinada)hab3).setFactorMultiplicador(3);
        ((Combinada)hab3).addHabilidad(hab1);
        ((Combinada)hab3).addHabilidad(hab2);

        // agrego las habilidades e implemento el método
        pers.addHab(hab1);
        pers.addHab(hab2);
        pers.addHab(hab3);
        pers.susHabilidades();

        // prueba del factor Multiplicador
        Habilidad hab4 = Factory.getInstance().crearHabilidad(Factory.HAB_C);
        hab4.setNombre("Otro");
        ((Combinada)hab4).setFactorMultiplicador(-2);
    }
}
