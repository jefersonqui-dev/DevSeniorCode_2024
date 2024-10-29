import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Area y Perimetro de un rectangulo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa me permite calcular el area y Perimetro de un Rectangulo:");

        System.out.print("Ingrese el Largo o Longitud del Rectangulo: ");
        var longitud = entrada.nextInt();

        System.out.print("Ingrese el Ancho del Rectangulo: ");
        var ancho = entrada.nextInt();

        var perimetroRectangulo = (2 * longitud) + (2 * ancho);
        var areaRectangulo = longitud * ancho;

        System.out.printf("El area del Rectangulo es: %d %n", areaRectangulo);
        System.out.printf("El perimetro del Rectangulo es: %d %n", perimetroRectangulo);
        entrada.close();
    }
}
