import java.util.Scanner;

public class EjerciciosClase03 {
    public static void main(String[] args) throws Exception {
        // DrawLine();
        // Ejercicio1();
        // DrawLine();
        // Ejercicio2();
        // DrawLine();
        // Ejercicio3();
        // DrawLine();
        // Ejercicio4();
        // DrawLine();
        // Ejercicio5();
        // DrawLine();
        // Ejercicio6();
        // DrawLine();
        // Ejercicio7();
        // DrawLine();
        // Ejercicio8();
        // DrawLine();
        // Ejercicio9();
        // DrawLine();
        // Ejercicio10();
        // DrawLine();
        // Ejercicio11();
        // DrawLine();
        // Ejercicio12();
        // DrawLine();
        // Ejercicio13();
        // DrawLine();
        // Ejercicio14();
        // DrawLine();
        // Ejercicio15();
        DrawLine();
        Ejercicio16();
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
        // entrada.close();

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
    }

    public static void Ejercicio3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un Numero: Verificara si es Par o Impar: ");

        System.out.print("Numero: ");
        var numero = entrada.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero es: " + resultado);

        // entrada.close();
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

        // entrada.close();
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

    }

    public static void Ejercicio12() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la Sandia: Determinara si puede dividirla en pares");
        System.out.print("Peso: ");
        var peso = entrada.nextInt();

        String resultado = (peso % 2 == 0) ? "SI" : "NO";
        System.out.println(resultado);

        // entrada.close();
    }

    public static void Ejercicio13() {

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
        }
        while (numero < 0);
        System.out.println("Cantidad de numeros negativos Ingresados: " + contadorNegativos);

        // entrada.close();
    }

    public static void Ejercicio17() {

    }

    public static void Ejercicio18() {

    }

    public static void Ejercicio19() {

    }

    public static void Ejercicio20() {

    }

    public static void Ejercicio21() {

    }

    public static void DrawLine() {
        System.out.println("________________________________________________________________");
    }
}
