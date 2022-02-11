public class Factory {
    // lo hacemos singleton
    private static Factory instance;
    // es una buena practica poner las constantes para que cuando usen el constructor de la fábrica, sepan cuáles tienen disponibles
    public static final String HAB_S = "HABILIDAD SIMPLE";
    public static final String HAB_C = "HABILIDAD COMBINADA";

    // armo los constructores privados. solo accesible por la instancia
    private Factory(){};
    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    };

    // creo el método de la fábrica
    public Habilidad crearHabilidad(String codigo){
        switch(codigo){
            case HAB_S:
                System.out.println("Creando habilidad simple");
                return new Simple();
            case HAB_C:
                System.out.println("Creando habilidad combinada");
                return new Combinada();
            default:
                return null;
        }
    }
}
