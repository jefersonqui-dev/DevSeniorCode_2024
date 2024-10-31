import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Ingrese un Numero Real: ");
        Scanner entrada = new Scanner(System.in);

        var numero = entrada.nextFloat();
        System.out.println("El numero ingresado es Real: " + numero);
        entrada.close();
    }
}
