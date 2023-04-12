package examen4_5;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sexo;
        double contadorM=0, contadorF=0, contadorG=0, altura, alturaF=0, alturaM=0;

        do {

            System.out.println("Dime el sexo del alumno M si es masculino y F si es femenino o introduce salir");
            sexo = entrada.next();
            if (sexo.equalsIgnoreCase("m")){
                contadorM++;
                contadorG++;

                System.out.println("Dime la altura de del alumno");
                altura = entrada.nextDouble();

                alturaM=alturaM+altura;
            }
            else if (sexo.equalsIgnoreCase("f")){
                contadorF++;
                contadorG++;

                System.out.println("Dime la altura de del alumno");
                altura = entrada.nextDouble();

                alturaF=alturaF+altura;
            }
            else if (sexo.equalsIgnoreCase("salir"))
                break;

            else
                System.out.println("el sexo introducido no es correcto");


//            if(!sexo.equalsIgnoreCase("salir")) {
//                System.out.println("Dime la altura de del alumno");
//                double altura = entrada.nextInt();
//            }

        } while (!sexo.equalsIgnoreCase("salir"));

        System.out.println("media chicas = "+ (alturaF/contadorF));
        System.out.println("media chicos = "+ (alturaM/contadorM));
        System.out.printf("media general = %.2f", ((alturaF+alturaM)/contadorG));
    }
}
