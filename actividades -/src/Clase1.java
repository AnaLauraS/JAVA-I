public class Clase1 {
    public static void main(String[] args) {
        String[] animales = {"perro", "pez", "gato","tortuga","pajaro"};
        String [] nombre={"Manchitas", "Nemo", "Silvestre", "Manuelita", "Gardel"};
        int[] edad={2,1,3,12,1};
        double[] come={1.5,0.14,0.5,0.3,0.35};
        String[] sonido={"guau guau", "glu glu", "miau", "pehuajo", "pio pio"};

        for (Integer i=0; i<5; i++){
            System.out.println("El animal "+animales[i]+", llamado "+nombre[i]+" tiene "+edad[i]+" años, come "+come[i]+" kilo(s) de comida por dia y hace "+sonido[i]);
        }

    }
}
