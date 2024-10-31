import java.util.Scanner;
public class Ejercicio10_ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para calcular la media aritmetica de tres numeros: ");
        System.out.print("Ingrese numero 1: ");
        var num1 = entrada.nextInt();

        System.out.print("Ingrese numero 2: ");
        var num2 = entrada.nextInt();

        System.out.print("Ingrese numero 3: ");
        var num3 = entrada.nextInt();

        var mediaAritmetica = (num1 + num2 + num3) / 3;
        System.out.printf("La media aritmetica es: %d", mediaAritmetica);

        entrada.close();

    }
}
