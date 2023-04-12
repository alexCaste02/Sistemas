package examen6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class VaLoPe {
    public static void main(String[] args) {
        //pruebas

    }

    //funcione
    public static String desordenar (String texto){
        StringBuilder txtDesordenado= new StringBuilder();

        for(int i=0; i<=texto.length();i++) {
            int numAle = ThreadLocalRandom.current().nextInt(i,texto.length());

            txtDesordenado.insert(numAle,texto.charAt(i));
        }

        return txtDesordenado.toString();
    }

    public static int elMenuDelMundial(){
        Scanner entrada= new Scanner(System.in);
        int numero;

        do{
            System.out.printf("El mundial"+
                                "%n1. Ghana"+
                                "%n2. Portugal"+
                                "%n3. Brasil"+
                                "%n4. España"+
                                "%n5. Otro"+
                                "%nElige tu ganador del mundial: ");
            numero= entrada.nextInt();

            if(numero<1 || numero>5) {
                System.out.println("La opción introducida no es válida");
            }
            else
                return numero;

        }while(numero<1 && numero>6);
return 1;
    }


}
