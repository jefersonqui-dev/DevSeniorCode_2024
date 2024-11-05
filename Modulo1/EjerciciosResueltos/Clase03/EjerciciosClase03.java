import java.util.Random;
import java.util.Scanner;

public class EjerciciosClase03 {
    public static void main(String[] args) throws Exception {

        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
        Ejercicio5();
        Ejercicio6();
        Ejercicio7();
        Ejercicio8();
        Ejercicio9();
        Ejercicio10();
        Ejercicio11();
        Ejercicio12();
        Ejercicio13();
        Ejercicio14();
        Ejercicio15();
        Ejercicio16();
        Ejercicio17();
        Ejercicio18();
        Ejercicio19();
        Ejercicio20();
        Ejercicio21();
        Ejercicio22();
        Ejercicio23();
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
        // entrada.close();
        DrawLine();

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

        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un Numero: Verificara si es Par o Impar: ");

        System.out.print("Numero: ");
        var numero = entrada.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero es: " + resultado);

        // entrada.close();
        DrawLine();
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
        DrawLine();
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

        // entrada.close();
        DrawLine();
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
        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio7() {
        // Basandome en la Desigualdad Triangular
        // Debemos cumplir tres condiciones
        // 1. a + b > c
        // 2. a + c > b
        // 3. b + c > a
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tres longitudes: Determinaras sin con ellas se puede formar un triangulo");
        System.out.print("Longitud 1: ");
        var long1 = entrada.nextFloat();
        System.out.print("Longitud 2: ");
        var long2 = entrada.nextFloat();
        System.out.print("Longitud 3: ");
        var long3 = entrada.nextFloat();

        if ((long1 + long2 > long3) && (long1 + long3 > long3) && (long2 + long3 < long1)) {
            System.out.println("Los numeros pueden formar un triangulo");
        } else {
            System.out.println("Los numeros no pueden formar un triangulo");
        }
        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio8() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: Determinara La Etapa en que se encuentra");
        System.out.print("Edad: ");
        var edad = entrada.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("Usted esta en La Etapa de la Primera Infancia");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Usted esta en la Etapa de la Infancia");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Usted esta en la Etapa de la Adolecencia");
        } else if (edad >= 19 && edad <= 26) {
            System.out.println("Usted esta en la Etapa de la Juventud");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("Usted esta en la Etapa de la Adultez");
        } else if (edad >= 59) {
            System.out.println("Usted es una persona Mayor");
        } else {
            System.out.println("Usted morirá pronto");
        }
        // entrada.close();
        DrawLine();

    }

    public static void Ejercicio9() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su La cantidad de Camisetas: Obtendra el precio segun los descuentos");
        System.out.print("Cantidad de Camisetas: ");
        var cantidadCamisetas = entrada.nextInt();
        var precioTotal = 0;

        if (cantidadCamisetas >= 1 && cantidadCamisetas <= 50) {
            precioTotal = cantidadCamisetas * 50000;
            System.out.println("Precio Total: " + precioTotal);
        } else if (cantidadCamisetas >= 50 && cantidadCamisetas <= 100) {
            precioTotal = cantidadCamisetas * 45000;
            System.out.println("Precio Total: " + precioTotal);
        } else if (cantidadCamisetas >= 100 && cantidadCamisetas <= 150) {
            precioTotal = cantidadCamisetas * 40000;
            System.out.println("Precio Total: " + precioTotal);
        } else if (cantidadCamisetas >= 150 && cantidadCamisetas <= 200) {
            precioTotal = cantidadCamisetas * 35000;
            System.out.println("Precio Total: " + precioTotal);
        } else if (cantidadCamisetas > 200) {
            precioTotal = cantidadCamisetas * 25000;
            System.out.println("Precio Total: " + precioTotal);
        } else {
            System.out.println("No eligio la cantidad");
        }
        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio10() {
        Scanner entrada = new Scanner(System.in);
        System.out
                .println("Ingrese un numero del 1 al 12( meses del año): Obtendra el numero de dias correspondientes");
        System.out.print("Numero del mes: ");
        var mes = entrada.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 10 || mes == 12) {
            System.out.println("El numero de dias es: 31");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El numero de dias es: 30");
        } else if (mes == 2) {
            System.out.println("El numero de dias es: 28");
        } else {
            System.out.println("Numero no valido");
        }

        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio11() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 3 Numeros enteros y diferentes: Los visualizara en orden ascendente:");
        System.out.print("Numero 1: ");
        var numero1 = entrada.nextInt();
        System.out.print("Numero 2: ");
        var numero2 = entrada.nextInt();
        System.out.print("Numero 3: ");
        var numero3 = entrada.nextInt();
        var mayor = (numero1 > numero2) ? (numero1 > numero3 ? numero1 : numero3)
                : (numero2 > numero3 ? numero2 : numero3);

        var menor = (numero1 < numero2) ? (numero1 < numero3 ? numero1 : numero3)
                : (numero2 < numero3 ? numero2 : numero3);

        var medio = (numero1 != mayor && numero1 != menor) ? numero1
                : ((numero2 != mayor && numero2 != menor) ? numero2 : numero3);

        System.out.println("En orden ascendente: " + menor + medio + mayor);
        // entrada.close();
        DrawLine();

    }

    public static void Ejercicio12() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la Sandia: Determinara si puede dividirla en pares");
        System.out.print("Peso: ");
        var peso = entrada.nextInt();

        String resultado = (peso % 2 == 0) ? "SI" : "NO";
        System.out.println(resultado);

        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio13() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los números de los hermanos que llegaron a tiempo (separados por un espacio): ");
        int hermano1 = entrada.nextInt();
        int hermano2 = entrada.nextInt();
        int hermanoTarde = 6 - (hermano1 + hermano2);
        System.out.println("El hermano que llega tarde es: " + hermanoTarde);
        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio14() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: Determinara el cubo de este: Digite un numero negativo Para finalizar");

        float numero;
        do {
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();
            if (numero >= 0) {
                float cubo = numero * numero * numero;
                System.out.println("Cubo: " + cubo);
            }
        }

        while (numero >= 0);
        System.out.println("Ha Finalizado.");
        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio15() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: Determinara si es Positivo o negativo: Ingrese 0 para salir");

        float numero;
        do {
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextFloat();
            if (numero > 0) {
                System.out.println("El numero es positivo");
            } else if (numero < 0) {
                System.out.println("El numero es negativo");
            } else {
                System.out.println("Ha Finalizado.");
            }
        }

        while (numero > 0 || numero < 0);

        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio16() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero negativo: Digite uno positivo para finalizar ");

        float numero;
        int contadorNegativos = 0;
        do {
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextFloat();
            if (numero < 0) {
                contadorNegativos++;
            } else {
                System.out.println("Ha Finalizado");
            }
        } while (numero < 0);
        System.out.println("Cantidad de numeros negativos Ingresados: " + contadorNegativos);

        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio17() {
        System.out.println("Se visualizan los numeros del 1 al 100 de 5 en 5: ");
        int i = 1;
        while (i <= 100) {
            if (i % 5 == 0 || i == 1) {
                System.out.println(i);
            }
            i++;
        }
        DrawLine();
    }

    public static void Ejercicio18() {
        Random rand = new Random();
        int[] numeros = new int[120];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cuentaPositivos = 0;
        int cuentaNegativos = 0;
        int cuentaCeros = 0;

        for (int i = 0; i < 120; i++) {
            numeros[i] = rand.nextInt(201) - 100;
            System.out.println(i + ". " + numeros[i] + "");
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cuentaPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }
        double mediaPositivos = cuentaPositivos == 0 ? 0 : (double) sumaPositivos / cuentaPositivos;
        double mediaNegativos = cuentaNegativos == 0 ? 0 : (double) sumaNegativos / cuentaNegativos;
        System.out.println("Suma de valores Positivos: " + sumaPositivos);
        System.out.println("Suma de valores Negativos: " + sumaNegativos);
        System.out.printf("Media de numeros positivos: %.2f %n", mediaPositivos);
        System.out.printf("Media de numeros Negativos: %.2f %n", mediaNegativos);
        System.out.println("Cantidad de ceros: " + cuentaCeros);

        DrawLine();
    }

    public static void Ejercicio19() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros de Finbonacci que desee: ");
        int N = entrada.nextInt();
        int num1 = 0, num2 = 1, num3 = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println(num1 + "");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio20() {
        int tamano = 8;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("| B ");
                } else {
                    System.out.print("| N ");
                }
            }
            System.out.println("|");
        }
        DrawLine();
    }

    public static void Ejercicio21() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Seleccione la Opcion que desee: %n 1. Millas a Kilometros. %n 2. Kilometros a Millas.%n");

        int opcion = entrada.nextInt();
        double valor, resultado;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la Cantidad que desea convertir: ");
                valor = entrada.nextDouble();
                resultado = (valor) * (1 / 0.621371);
                System.out.printf("%.2f Millas -> %.2f Kilometros %n", valor, resultado);
                break;
            case 2:
                System.out.print("Ingrese la Cantidad que desea convertir: ");
                valor = entrada.nextDouble();
                resultado = (valor) * (1 / 1.60934);
                System.out.printf("%.2f Kilometros -> %.2f Millas%n", valor, resultado);
                break;
            default:
                System.out.println("No valido");
                break;
        }
        // entrada.close();
        DrawLine();

    }

    public static void Ejercicio22() {
        Scanner entrada = new Scanner(System.in);
        boolean jugarDeNuevo = true;
        System.out.println("Binvenido a ¡Piedra, Papel o Tijera!");
        System.out.println("Ingresa El nombre de cada jugador:");
        System.out.print("Jugador 1: ");
        String jugador1 = entrada.nextLine();
        System.out.print("Jugador 2: ");
        String jugador2 = entrada.nextLine();

        while (jugarDeNuevo) {
            System.out.println("Ronda 1: Ingresa P(Piedara), L(Papel) y T(Tijera) ");
            System.out.print(jugador1 + ": ");
            String jug1 = entrada.nextLine().toUpperCase();
            System.out.print(jugador2 + ": ");
            String jug2 = entrada.nextLine().toUpperCase();

            // Determinar el ganador
            if (jug1.equals(jug2)) {
                System.out.println("Empate");
            } else if ((jug1.equals("P") && jug2.equals("T")) ||
                    (jug1.equals("T") && jug2.equals("L")) ||
                    (jug1.equals("L") && jug2.equals("P"))) {
                System.out.println("¡" + jugador1 + " Gana la ronda!");
            } else {
                System.out.println("¡" + jugador2 + " Gana la ronda!");
            }
            System.out.println("¿Desean jugar de nuevo (S/N): ");
            String respuesta = entrada.nextLine().toUpperCase();
            jugarDeNuevo = respuesta.equals("S");
        }
        System.out.println("¡Gracias por Jugar!");
        // entrada.close();
        DrawLine();
    }

    public static void Ejercicio23() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número impar positivo para el tamaño del diamante: ");
        int tamano = entrada.nextInt();
        do {

            if (tamano % 2 == 0 || tamano <= 0) {
                System.out.println("Por favor, ingrese un número impar positivo.");
                tamano = entrada.nextInt();
            }
        } while (tamano % 2 == 0 || tamano <= 0);
        int n = tamano / 2;

        // Parte superior del diamante
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        } // Parte inferior del diamante
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        entrada.close();
        DrawLine();
    }

    public static void DrawLine() {
        System.out.println("________________________________________________________________");
    }
}
