import java.util.Scanner;

public class EjerciciosClase04 {
    public static void main(String[] args) {

       // conversionDeTemperaturas();
       // verificacionDePalindromos();
        calculoFactorial();
        // Ejercicio4();
        // Ejercicio5();
        // Ejercicio6();
        // Ejercicio7();
        // Ejercicio8();
        // Ejercicio9();
        // Ejercicio10();
        // Ejercicio11();
        // Ejercicio12();
    }

    public static void conversionDeTemperaturas() {
        // Conversion de Temperaturas
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la Opcion que deseea: ");
        System.out.printf("1. Celsius a Fahrenheit %n2. Fahrenheit a Celsius %n");

        int option = entrada.nextInt();
        switch (option) {
            case 1:
                CelsiusToFahrenheit();
                break;
            case 2:
                FahrenheitToCelsius();
                break;
            default:
                System.out.println("Incorrect option");
                break;
        }

         entrada.close();
    }

    public static void CelsiusToFahrenheit() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Celsius: ");
        var temperaturaCelsius = entrada.nextFloat();
        var F = (temperaturaCelsius * 1.8) + 32;
        System.out.printf("La temperatura en Fahrenheit es: %.2f", F);

        entrada.close();

    }

    public static void FahrenheitToCelsius() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Fahrenheit: ");
        var temperaturaFahrenheit = entrada.nextFloat();
        var C = (temperaturaFahrenheit - 32)/1.8;
        System.out.printf("La temperatura en Celsius es: %.2f", C);

        entrada.close();
    }

    public static void verificacionDePalindromos() {
        //radar
        //anilina
        //A man, a plan, a canal, Panama
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un Texto o palabra: Verificara si es un palindromo ");
        String cadena = entrada.nextLine();



        entrada.close();

    }

    public static void calculoFactorial() {
        Scanner entrada = new Scanner(System.in);
        var numeroEntero = entrada.nextInt();

        for (int i = 0; i <= numeroEntero; i--){
            System.out.println(i);
        }
        entrada.close();
    }

    public static void Ejercicio4() {

    }

    public static void Ejercicio5() {

    }

    public static void Ejercicio6() {

    }

    public static void Ejercicio7() {

    }

    public static void Ejercicio8() {

    }

    public static void Ejercicio9() {

    }

    public static void Ejercicio10() {

    }

    public static void Ejercicio11() {

    }

    public static void Ejercicio12() {

    }
}
