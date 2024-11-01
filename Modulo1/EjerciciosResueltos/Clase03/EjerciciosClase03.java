import java.util.Scanner;

public class EjerciciosClase03 {
    public static void main(String[] args) throws Exception {
        DrawLine();
        Ejercicio1();
        DrawLine();
        Ejercicio2();
        DrawLine();
        Ejercicio3();
        DrawLine();
        Ejercicio4();
        DrawLine();
        Ejercicio5();
        DrawLine();
        Ejercicio6();
        DrawLine();
        Ejercicio7();
        DrawLine();
    }

    public static void Ejercicio1() {
        System.out.println("Ingrese un Numero Real:  Verificara si es posivivo, negativo o cero:");
        Scanner entrada = new Scanner(System.in);
        System.out.print("numero: ");

        var numero = entrada.nextFloat();
        if (numero < 0) {
            System.out.println("El numero ingresado es Negativo");
        } else if (numero > 0) {
            System.out.println("El numero ingresado es positivo");
        } else if (numero == 0) {
            System.out.println("El numero ingresado es cero");
        } else {
            System.out.println("Expresion no valida");
        }
        //entrada.close();

    }

    public static void Ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa Tres Numeros: Se determinara Cual de los tres es Mayor: ");

        System.out.printf("Numero 1: ");
        var numero1 = entrada.nextDouble();
        System.out.printf("Numero 2: ");
        var numero2 = entrada.nextDouble();
        System.out.printf("Numero 3: ");
        var numero3 = entrada.nextDouble();
        // Operadores Ternarios -> condicion ? valor_si_verdadero : valor_si_falso
        var mayor = (numero1 > numero2) ? (numero1 > numero3 ? numero1 : numero3)
                : (numero2 > numero3 ? numero2 : numero3);

        System.out.println("El mayor es: " + mayor);

        //entrada.close();
    }

    public static void Ejercicio3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un Numero: Verificara si es Par o Impar: ");

        System.out.print("Numero: ");
        var numero = entrada.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero es: " + resultado);

        //entrada.close();
    }

    public static void Ejercicio4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una Letra: Determinara si es Mayuscula o Minuscula ");
        System.out.print("Letra:  ");
        char letra = entrada.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra ingresada es mayuscula. ");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra ingresada es minuscula.");
        } else {
            System.out.println("La entrada no es una letra.");
        }
       // entrada.close();
    }

    public static void Ejercicio5() {
        System.out.println("Ingrese una Letra: Verificara si es vocal o Consonante");
        Scanner entrada = new Scanner(System.in);
        char letra = entrada.next().charAt(0);
        System.out.print("Letra: ");

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La Letra es una vocal");
        } else if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("La Letra es una vocal");
        } else {
            System.out.println("La Letra es una consonante");
        }

        //entrada.close();
    }

    public static void Ejercicio6() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: Verificara si es divisible por 2 y 7");
        var numero = entrada.nextInt();
        System.out.print("numero: ");
        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.println("El numero es divisible por 2 y 7");
        } else {
            System.out.println("El numero no es divisible por 2 y 7");
        }
      //  entrada.close();
    }

    public static void Ejercicio7() {
        // Basandome en la Desigualdad Triangular
        //Debemos cumplir tres condiciones
        // 1. a + b > c
        // 2. a + c > b
        // 3. b + c > a



    }
    public static void DrawLine() {
        System.out.println("________________________________________________________________");
    }
}
