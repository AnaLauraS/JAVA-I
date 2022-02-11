import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner toma=new Scanner(System.in);
        System.out.println("Escriba número para saber si es primo");
        int toma1= toma.nextInt();
        System.out.println(esDivisible(toma1));

        System.out.println("¿Qué numero es mayor? Escriba el primer número");
        Integer toma2= toma.nextInt();
        System.out.println("¿Qué numero es mayor? Escriba el segundo número");
        Integer toma3= toma.nextInt();
        System.out.println("¿Qué numero es mayor? Escriba el tercer número");
        Integer toma4= toma.nextInt();
        toma.nextLine();
        System.out.println(maximoEntreTresNumeros(toma2,toma3,toma4));

        System.out.println("Ahora vamos a comparar cadenas de textos. Ingresá el primer texto");
        String toma5=toma.nextLine();
        System.out.println("Y ahora ingresá el segundo texto");
        String toma6=toma.nextLine();
        System.out.println(cadenasDeTextoDistintas(toma5, toma6));
    }

    public static boolean esDivisible (int a){
        int prueba=a;
        boolean rta;
        for (int i=1;i<a;i++){
            if(a%i==0){
                prueba=i;
            }
        } if (prueba==1){
            rta=true;
        }else{
            rta=false;
        }
        return rta;
    };
    public static Integer maximoEntreTresNumeros (Integer num1, Integer num2, Integer num3){
        Integer resultado;
        if (num1.compareTo(num2)==1){
            resultado=num1;
        }else {
            resultado=num2;
        } if (resultado.compareTo(num3)==-1){
            resultado=num3;
        }
        return resultado;
    };
    public static boolean cadenasDeTextoDistintas (String tex1, String tex2){
        boolean resp;
        if (tex1.compareTo(tex2)==0){
            resp=false;
        }else {
            resp=true;
        }
        return resp;
    };

}
