package examen4_5__correccion;

import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numAlumnosM = 0;
        double numAlumnosF = 0;

        double sumaAlturasM = 0;
        double sumaAlturasF = 0;

        System.out.print("Introduce el sexo del alumno/a (M/F/salir)");
        String sexo = input.next();

        while (!sexo.equals("salir")) {

            System.out.print("Introduce la altura del alumno/a");
            double altura = input.nextDouble();


            if (sexo.equals("M")) {

                sumaAlturasM += altura;
                numAlumnosM++;

            } else if (sexo.equals("F")) {

                sumaAlturasF += altura;
                numAlumnosF++;

            } else {
                System.out.println("El sexo introducido no es correcto");
            }

            System.out.print("Introduce el sexo del alumno/a (M/F/salir)");
            sexo = input.next();
        }

        System.out.printf("La altura media de las alumnas es %.2f y de los alumnos es %.2f \n",
                (sumaAlturasF)/(numAlumnosF),(sumaAlturasM)/(numAlumnosM));
        System.out.printf("La altura media de la clase es %.2f",
                (sumaAlturasF+sumaAlturasM)/(numAlumnosF+numAlumnosM));

    }
}
