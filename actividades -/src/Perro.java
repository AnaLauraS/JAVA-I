import java.util.Calendar;
import java.util.Scanner;

public class Perro {
    private boolean enAdopcion;
    private String raza;
    private int nacimiento;
    private float peso;
    private boolean chip;
    private boolean lastimado;
    private String nombre;

    public Perro (String nombre) {
        this.nombre=nombre;
    };
    public Perro () {};

    Calendar cal = Calendar.getInstance();
    int anio=cal.get(Calendar.YEAR);

    public void edad () {
        System.out.println("el perro llamado "+this.nombre+" tiene "+ (anio-this.nacimiento) +" años.");
    }
    public void perdible () {
        if (this.chip) {
            System.out.println("tu perro tiene garantía ante pérdidas");
        } else {
            System.out.println("tu perro se puede perder :( ponele chip!");
        }
    }
    public void adoptable () {
        if (this.peso>5 && !this.lastimado){
            this.enAdopcion=true;
            System.out.println("tu perro se puede poner en adopción");
        }else {
            this.enAdopcion=false;
            System.out.println("tu perro NO se puede poner en adopción: curalo y hacelo subir de peso");
        }
    }

    public int getNacimiento () {
        return this.nacimiento;
    }
    public String getRaza () {
        return this.raza;
    }
    public float getPeso () {
        return this.peso;
    }
    public boolean getLastimado () {
        return this.lastimado;
    }
    public String getNombre () {
        return this.nombre;
    }

    Scanner scanner = new Scanner(System.in);

    public void setRaza () {
        System.out.println("ingresa la raza de tu perro");
        String raza=scanner.nextLine();
        this.raza=raza;
    }
    public void setNacimiento () {
        System.out.println("ingresa el año apoximado de nacimiento de tu perro");
        int nac=scanner.nextInt();
        this.nacimiento=nac;
    }
    public void setPeso () {
        System.out.println("ingresa el peso de tu perro");
        float peso=scanner.nextFloat();
        this.peso=peso;
    }
    public void setChip (boolean c) {
        System.out.println("¿Tu perro tiene chip?");
        String cd=scanner.nextLine();
        if (cd=="si"){
            this.chip=true;
        }else {
            this.chip=false;
        }
    }
    public void setLastimado (boolean last) {
        System.out.println("¿Tu perro está lastimado?");
        String cd=scanner.nextLine();
        if (cd=="si"){
            this.lastimado=true;
        }else {
            this.lastimado=false;
        }
    }
    public void setNombre () {
        System.out.println("ingresa el nombre de tu perro");
        String nom=scanner.nextLine();
        this.nombre=nom;
    }
}