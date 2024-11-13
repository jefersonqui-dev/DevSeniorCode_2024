import java.util.Scanner;

public class Ejercicio7 {
    // ingresar dos numeros
    // suma resta multiplicacion, division
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        var num1 = entrada.nextInt();

        System.out.println("Ingrese otro numero: ");
        var num2 = entrada.nextInt();

        var suma = num1 + num2;
        var resta = num1 - num2;
        var multiplicacion = num1 * num2;
        var division = num1 / num2;
        System.out.println("El resultado de las operaciones se muestra de la siguiente manera:");
        System.out.printf("La suma de:           %d + %d es: %d %n", num1, num2, suma);
        System.out.printf("La Resta de:          %d - %d es: %d %n", num1, num2, resta);
        System.out.printf("La Multiplicacion de: %d x %d es: %d %n", num1, num2, multiplicacion);
        System.out.printf("La Division de:       %d / %d es: %d %n", num1, num2, division);
        entrada.close();

    }
}
