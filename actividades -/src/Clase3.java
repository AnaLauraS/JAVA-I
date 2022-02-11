import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {

        cualGana();
    }
    public static int cualGana () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos al piedra, papel o tijera. Ingresá el nombre del primer participante");
        String nombre1 = scanner.nextLine();
        System.out.println("Ahora el nombre del segundo participante");
        String nombre2 = scanner.nextLine();

        int punto1 = 0;
        int punto2 = 0;
        System.out.println("Elegí piedra, papel o tijera");
        String jugada = scanner.nextLine();
        while (!jugada.equals("piedra") && !jugada.equals("papel") && !jugada.equals("tijera") && !jugada.equals("*")) {
            System.out.println("Ingresá algo válido");
            jugada = scanner.nextLine();
        }
        if (jugada == "*") {
            System.out.println("Juego finalizado");
        } else {
            System.out.println(nombre2 + " ingresá tu jugada");
            String jugada2 = scanner.nextLine();

            switch (jugada) {
                case "piedra" : switch (jugada2) {
                    case "piedra":
                        System.out.println("empataron");
                        break;
                    case "tijera":
                        punto1++;
                        break;
                    case "papel":
                        punto2++;
                        break;
                } case "papel" : switch (jugada2) {
                    case "papel":
                        System.out.println("empataron");
                        break;
                    case "piedra":
                        punto1++;
                        break;
                    case "tijera":
                        punto2++;
                        break;
                } case "tijera" : switch (jugada2) {
                    case "tijera":
                        System.out.println("empataron");
                        break;
                    case "papel":
                        punto1++;
                        break;
                    case "piedra":
                        punto2++;
                        break;
                }
            }
        }return punto1;
    }
}
