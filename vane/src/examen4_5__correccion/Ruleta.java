package examen4_5__correccion;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ruleta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Elije el color para apostar (rojo/negro)? ");
        String colorElegido = input.next();

        int dinero = 100000;

        for (int apostado = 1; apostado <= 1000; apostado++) {

            //que color ha salido
            int numAleatorioRuleta = ThreadLocalRandom.current().nextInt(0,36+1);
            String colorResultadoRuleta;

            if(numAleatorioRuleta==0){
                //0 - 0
                colorResultadoRuleta="verde";

            } else if(numAleatorioRuleta%2==0){
                //par -- negro
                colorResultadoRuleta="negro";

            } else {
                //impar -- rojo
                colorResultadoRuleta="rojo";
            }

            dinero -= apostado;

            if(colorElegido.equals(colorResultadoRuleta)){
                dinero += apostado*2;
            }

        }

        System.out.printf("Despues de 1000 tiradas tenemos %d",
                dinero);


    }
}
