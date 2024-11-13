import java.util.Random;
import java.util.Scanner;

public class tutoria5 {
    public static void main(String[] args) throws Exception {
        int resultadoDeLaSuma = SumarEnteros(5, 6);
        System.out.println("El resultado de la suma es: " + resultadoDeLaSuma);

        int resultadoDeLaDivision = DividirDosEnteros(10, 2);
        System.out.println("El resultado de la division: " + resultadoDeLaDivision);
    }

    public static int SumarEnteros(int a, int b) {
        int resultado = a + b;

        return resultado;
    }

    public static int DividirDosEnteros(int a, int b) {
        System.out.println("Ejecutando medoto division: ");
        int resultado = a / b;
        return resultado;
    }

    public static void ejemploMath() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        System.out.print("num1:");
        var num1 = entrada.nextInt();
        System.out.print("num2:");
        var num2 = entrada.nextInt();
        var verificar_max = Math.max(num1, num2);
        var verificar__min = Math.min(num1, num2);
        System.out.printf("el mayor es: %f\n el menor es: %f\n", verificar_max, verificar__min);
        int valorAbsoluto = Math.abs(-10);
        System.out.println("Valor absoluto: " + valorAbsoluto);

        // Potencia
        double potencia = Math.pow(2, 3);
        System.out.println("2 elevado a 3: " + potencia);

        // Raíz cuadrada
        double raizCuadrada = Math.sqrt(16);
        System.out.println("Raíz cuadrada de 16: " + raizCuadrada);

        // Seno de 45 grados
        double seno = Math.sin(Math.toRadians(45));
        System.out.println("Seno de 45 grados: " + seno);

        // Número aleatorio
        double aleatorio = Math.random();
        System.out.println("Número aleatorio: " + aleatorio);

        entrada.close();
    }

    public static void EjemploRandom() {

        Random random = new Random();

        // Generar un número entero aleatorio entre 0 y 99
        int numeroEntero = random.nextInt(100);
        System.out.println("Número entero: " + numeroEntero);

        // Generar un número de punto flotante aleatorio entre 0.0 y 1.0
        double numeroDouble = random.nextDouble();
        System.out.println("Número double: " + numeroDouble);

        // Generar un valor booleano aleatorio
        boolean valorBooleano = random.nextBoolean();
        System.out.println("Valor booleano: " + valorBooleano);
    }

    public static void EjemploScanner() {
        Scanner sc = new Scanner(System.in);

        // Leer un entero
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        System.out.println("Número introducido: " + numero);

        // Leer una cadena
        System.out.print("Introduce una cadena: ");
        sc.nextLine(); // Consumir el salto de línea pendiente
        String cadena = sc.nextLine();
        System.out.println("Cadena introducida: " + cadena);

        // Leer un valor double
        System.out.print("Introduce un número decimal: ");
        double decimal = sc.nextDouble();
        System.out.println("Número decimal introducido: " + decimal);

        sc.close();
    }

    public static void EjemploString() {
        String cadena = "Hola Mundo";

        // Longitud de la cadena
        int longitud = cadena.length();
        System.out.println("Longitud: " + longitud);

        // Carácter en la posición 0
        char primerCaracter = cadena.charAt(0);//devuelve H
        System.out.println("Primer carácter: " + primerCaracter);

        // Subcadena
        String subcadena = cadena.substring(0, 4);
        System.out.println("Subcadena: " + subcadena); //Devuelve "Hola"

        // Convertir a mayúsculas
        String mayusculas = cadena.toUpperCase(); //toLowerCase() -> minusculas
        System.out.println("Mayúsculas: " + mayusculas);

        //texto con espacios
        String textoConEspacios = cadena.trim();
        System.out.println("Texto con espacios: " + textoConEspacios);

        //equalsIgnoreCase
        String cadena2 = "hola mundo";
        //Comparar cadenas ignorando mayusculas y minusculas
        boolean sonIguales = cadena.equalsIgnoreCase(cadena2);
        System.out.println("sonIguales: " + sonIguales); //devuelve true

        // Comparar cadenas
        boolean esIgual = cadena.equals("Hola Mundo");
        System.out.println("Es igual: " + esIgual);

        // Índice de "Mundo"
        int indice = cadena.indexOf("Mundo");
        System.out.println("Índice de 'Mundo': " + indice);

        // Reemplazar caracteres
        String nuevaCadena = cadena.replace('o', 'a');
        System.out.println("Nueva cadena: " + nuevaCadena);
    }

}
