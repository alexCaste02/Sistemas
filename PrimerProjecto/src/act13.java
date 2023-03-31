import java.util.Scanner;

public class act13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la altura del cono: ");
        double altura = input.nextDouble();

        System.out.print("Ingrese el radio de la base del cono: ");
        double radio = input.nextDouble();

        System.out.print("Ingrese 1 si desea calcular el área o 2 si desea calcular el volumen: ");
        int opcion = input.nextInt();

        double resultado = calcularCono(radio, altura, opcion);

        if (opcion == 1) {
            System.out.println("El área del cono es: " + resultado);
        } else if (opcion == 2) {
            System.out.println("El volumen del cono es: " + resultado);
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public static double calcularCono(double radio, double altura, int opcion) {
        double resultado = 0;

        if (opcion == 1) {
            double generatriz = Math.sqrt((radio * radio) + (altura * altura));
            resultado = Math.PI * radio * generatriz;
        } else if (opcion == 2) {
            resultado = (1.0/3.0) * Math.PI * radio * radio * altura;
        }

        return resultado;
    }
}

