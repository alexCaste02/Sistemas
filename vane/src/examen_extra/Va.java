package examen_extra;

import java.util.concurrent.ThreadLocalRandom;

public class Va {
    public static void main(String[] args) {

        System.out.println(damePin4());

        System.out.println("-------------");

//        System.out.println(esPalindromo("Atonal trazo Mozart la nota"));
//        System.out.println(esPalindromo("Esta cadena no es palindroma"));

        System.out.println("-------------");

        System.out.println(sustituir("plaza",4,'y'));
        System.out.println(sustituir("plaza",7,'y'));

        System.out.println("-------------");

        System.out.println(doblarNumeros(9119));
        System.out.println(doblarNumeros(1234));
    }

    //funciones
    public static int damePin4(){
        int numAle2 = ThreadLocalRandom.current().nextInt(0,9+1);
        StringBuilder numGuardado= new StringBuilder();
        int comprobar=numAle2;


        do{
            int numAle = ThreadLocalRandom.current().nextInt(0,9+1);
            if(numAle!=comprobar) {
                comprobar = numAle;
                numGuardado.append(numAle);
            }
        }while(numGuardado.length()!=4);

        return Integer.parseInt(numGuardado.toString());
    }

    public static boolean esPalindromo (String txt){
        for (int i=0;i<txt.length();i++){
            int fin=txt.charAt(txt.length());

            if(txt.charAt(i) == fin){
                fin--;
                return true;
            }
        }
        return false;
    }

    public static String sustituir(String txt, int num, char caracter){
        String cambio=txt;
        for (int i=0; i<txt.length();i++) {
            if(i==num)
                //preguntar si no entiende que hace 'replace' o 'charAt'
               cambio= txt.replace(txt.charAt(i),caracter);
        }
        return cambio;
    }

    public static int doblarNumeros (int num){
        StringBuilder numGuardado= new StringBuilder(num);

        double nuevo;
        for (int i = 0; i<numGuardado.length(); i++){
            nuevo= Math.pow(numGuardado.charAt(i),2);
        }
        return (int) nuevo;
    }


}
