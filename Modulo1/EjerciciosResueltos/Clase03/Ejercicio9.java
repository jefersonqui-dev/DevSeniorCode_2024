import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversion de Temperatura: °C -> F, K");
        System.out.print("Ingrese la Temperatura en °C: ");
        var temperaturaCelsius = entrada.nextInt();

        var gradosFahrenheit = temperaturaCelsius * 9 / 5 + 32;
        var gradosKelvin = temperaturaCelsius + 273.15;

        System.out.printf("Fahrenheit: %d %nKelvin: %f %n", gradosFahrenheit, gradosKelvin);
        entrada.close();
    }
}
