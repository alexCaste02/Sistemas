package examen4_5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ruleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dinero=100000, apostar=1;

        System.out.println("Elije un color para postar (rojo/negro)?");
        String color= entrada.next();

        for(int i=0; i<1000;i++) {
            int numAle = ThreadLocalRandom.current().nextInt(0, 36 + 1);

            if (numAle == 0){
                dinero=dinero-apostar;

            }

            else if(numAle % 2 == 0) {
                //es par y por tanto es negro
                if(color.equalsIgnoreCase("negro")) {
                    dinero = dinero - apostar;
                    dinero = dinero + (apostar * 2);
                }
                else
                    dinero=dinero-apostar;
            }

            else{
                //es rojo es impar
                if(color.equalsIgnoreCase("rojo")) {
                    dinero = dinero - apostar;
                    dinero = dinero + (apostar * 2);
                }
                else
                    dinero=dinero-apostar;
            }

            apostar++;
        }

        System.out.println("despues de 1000 tiradas tenemos "+ dinero);


    }
}
