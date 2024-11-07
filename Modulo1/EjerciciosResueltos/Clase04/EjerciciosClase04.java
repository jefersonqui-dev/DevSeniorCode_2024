import java.util.Scanner;

public class EjerciciosClase04 {
    public static void main(String[] args) {
        DrawLine();
        conversionDeTemperaturas();
        verificacionDePalindromos();
        calculoFactorial();
        numerosPrimos();
        promedioTresNumeros();
        conversionDeUnidades();
        calculoDePotencias();
        calculoDeAreas();
        calculoDeIntereses();
        generacionTablasDeMultiplicar();
        calculoIndiceDeMasaCorporal();
        conversionDeSegundos();
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

        //entrada.close();
        DrawLine();
    }

    public static void CelsiusToFahrenheit() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Celsius: ");
        var temperaturaCelsius = entrada.nextFloat();
        var F = (temperaturaCelsius * 1.8) + 32;
        System.out.printf("La temperatura en Fahrenheit es: %.2f\n", F);

        //entrada.close();

    }

    public static void FahrenheitToCelsius() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Fahrenheit: ");
        var temperaturaFahrenheit = entrada.nextFloat();
        var C = (temperaturaFahrenheit - 32) / 1.8;
        System.out.printf("La temperatura en Celsius es: %.2f\n", C);

        //entrada.close();
    }

    public static void verificacionDePalindromos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena: Verificara si es un Palindromo");
        String cadena = entrada.nextLine();
        if (esPalindromo(cadena)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
        //entrada.close();
        DrawLine();
    }

    public static boolean esPalindromo(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void calculoFactorial() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Calculo de el factorial, Ingrese un numero entero: ");
        var numeroEntero = 0;
        numeroEntero = entrada.nextInt();
        int resFactorial = 1;
        for (int i = 1; i <= numeroEntero; ++i) {
            resFactorial *= i;
        }
        System.out.printf("El factorial de %d es %d \n", numeroEntero, resFactorial);

        //entrada.close();
        DrawLine();
    }

    public static void numerosPrimos() {

        // Numero primo: es un numero entero > 1, divisible por 1 y por si mismo
        Scanner entrada = new Scanner(System.in);
        var numeroUser = 0;

        do {
            System.out.print("Por favor ingrese un numero entero > 1: ");
            numeroUser = entrada.nextInt();

        } while (!(numeroUser > 1));

        System.out.print("¡Correcto!: ");

        if (esPrimo(numeroUser)) {
            System.out.printf("El número %d es primo.%n", numeroUser);
        } else {
            System.out.printf("El número %d no es primo.%n", numeroUser);
        }

        DrawLine();
       // entrada.close();
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void promedioTresNumeros() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 3 Numeros : Calculara el promedio de los Tres");
        System.out.print("Numero 1: ");
        var numero1 = entrada.nextFloat();
        System.out.print("Numero 2: ");
        var numero2 = entrada.nextFloat();
        System.out.print("Numero 3: ");
        var numero3 = entrada.nextFloat();

        var promedio = (numero1 + numero2 + numero3) / 3;
        System.out.printf("El promedio de los tres números es: %.2f \n", promedio);
        //entrada.close();
        DrawLine();
    }

    public static void conversionDeUnidades() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversion de unidades, Elija la conversion que desee realizar:");
        System.out.print("1. metros     ->    kilometros\n2. kilometros ->    metros\n");
        System.out.print("3. gramos     ->    kilogramos\n4. kilogramos ->    gramos\n");
        System.out.print("Opcion: ");
        int option = entrada.nextInt();
        float cantidad = 0;
        switch (option) {
            case 1:
                System.out.print("Ingrese la Cantidad en metros: ");
                cantidad = entrada.nextFloat();
                metrosToKilometros(cantidad);
                break;
            case 2:
                System.out.print("Ingrese la Cantidad en Kilometros: ");
                cantidad = entrada.nextFloat();
                kilometrosToMetros(cantidad);
                break;
            case 3:
                System.out.print("Ingrese la Cantidad en gramos: ");
                cantidad = entrada.nextFloat();
                gramosToKilogramos(cantidad);
                break;
            case 4:
                System.out.print("Ingrese la Cantidad en Kilogramos: ");
                cantidad = entrada.nextFloat();
                kilogramosToGramos(cantidad);
                break;

            default:
                System.out.println("Opcion No Valida");
                break;
        }
        //entrada.close();
        DrawLine();
    }

    public static float metrosToKilometros(float cantidad) {
        var resultado = cantidad / 1000;
        System.out.printf("%.2f m Equivale a %.2f km\n", cantidad, resultado);
        return resultado;
    }

    public static float kilometrosToMetros(float cantidad) {
        var resultado = cantidad * 1000;
        System.out.printf("%.2f km Equivale a %.2f m\n", cantidad, resultado);
        return resultado;
    }

    public static float gramosToKilogramos(float cantidad) {
        var resultado = cantidad / 1000;
        System.out.printf("%.2f g Equivale a %.2f kg\n", cantidad, resultado);
        return resultado;
    }

    public static float kilogramosToGramos(float cantidad) {
        var resultado = cantidad * 1000;
        System.out.printf("%.2f kg Equivale a %.2f g\n", cantidad, resultado);
        return resultado;
    }

    public static void calculoDePotencias() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese base y exponente: ");
        System.out.print("base: ");
        var base = entrada.nextDouble();
        System.out.print("exponente: ");
        var exponente = entrada.nextDouble();

        var resultado = potencia(base, exponente);
        System.out.printf("El numero %.2f^%.2f es igual a: %.2f\n", base, exponente, resultado);
        //entrada.close();
        DrawLine();
    }

    public static double potencia(double base, double exponente) {
        var pot = Math.pow(base, exponente);
        return pot;
    }

    public static void calculoDeAreas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione el area de la figura que desea calcular: ");
        System.out.printf("1. Area del Circulo\n2. Area del Cuadrado\n3. Area del Triangulo\n");
        System.out.print("Opcion: ");
        int option = entrada.nextInt();

        switch (option) {
            case 1:
                System.out.print("Ingrese el radio del circulo: ");
                var radio = entrada.nextFloat();
                areaCirculo(radio);
                break;
            case 2:
                System.out.print("Ingrese la longitud del lado del cuadrado: ");
                var lado = entrada.nextFloat();
                areaCuadrado(lado);
                break;
            case 3:
                System.out.println("Ingrese la base y la altura del triangulo: ");
                System.out.print("base:");
                var base = entrada.nextFloat();
                System.out.print("altura:");
                var altura = entrada.nextFloat();
                areaTriangulo(base, altura);
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        DrawLine();
        //entrada.close();

    }

    public static void areaCirculo(float radio) {
        var pot = potencia(radio, 2);
        var area = Math.PI * pot;
        System.out.printf("El area del circulo es %.2f\n", area);
    }

    public static void areaCuadrado(float lado) {
        var area = lado * lado;
        System.out.printf("El area del Cuadrado es %.2f\n", area);
    }

    public static void areaTriangulo(float base, float altura) {
        var area = (base * altura) / 2;
        System.out.printf("El area del triangulo es %.2f\n", area);
    }

    public static void calculoDeIntereses() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para Calculo de Interes Simple Y compuesto");
        // algunos datos interes Simple
        System.out.print("Ingrese el Capital Inicial: ");
        var capitalInicial = entrada.nextFloat();
        System.out.print("Ingrese la tasa de Interes Anual(en porcentaje): ");
        var interesAnual = entrada.nextFloat();
        System.out.print("Ingrese el tiempo en años: ");
        var tiempoAnos = entrada.nextFloat();
        // datos extra interes Compuesto
        System.out.print("Ingrese el numero de veces que se aplica el interes por año: ");
        var n = entrada.nextInt();

        // Mostrar en consola
        var interesSimple = interesSimple(capitalInicial, interesAnual, tiempoAnos);
        System.out.printf("El interes Simple es: %.2f\n", interesSimple);

        var interesCompuesto = interesCompuesto(capitalInicial, interesAnual, tiempoAnos, n);
        System.out.printf("El interes Compuesto es: %.2f\n", interesCompuesto);

        //entrada.close();
        DrawLine();

    }

    public static float interesSimple(float p, float r, float t) {
        float I = 0;
        I = p * r * t;
        return I;
    }

    public static double interesCompuesto(float p, float r, float t, float n) {
        var base = r / n;
        var exponente = n * t;
        var pot = potencia(base, exponente);
        var interesCompuesto = p * pot;
        return interesCompuesto;

    }

    public static void generacionTablasDeMultiplicar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Genere la tabla de multiplicar del numero que Ingrese: ");
        System.out.print("la tabla del: ");
        var numero = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
        //entrada.close();
        DrawLine();
    }

    public static void calculoIndiceDeMasaCorporal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su peso(kg) y su altura(m)");
        System.out.print("Peso: ");
        var peso_kg = entrada.nextFloat();
        System.out.print("Altura: ");
        var altura_m = entrada.nextFloat();

        double imc = ((peso_kg / potencia(altura_m, 2)));
        categoriasIMC(imc);

        //entrada.close();
        DrawLine();
    }

    public static void categoriasIMC(double imc) {
        if (imc < 18.5) {
            System.out.println("Categoria: Bajo peso");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Categoria: Peso normal");
        } else if (imc > 25 && imc < 29.9) {
            System.out.println("Categoria: Sobrepeso");
        } else if (imc > 30 && imc < 34.9) {
            System.out.println("Categoria: Grado 1 de Obesidad");
        } else if (imc > 35 && imc < 39.9) {
            System.out.println("Categoria: Grado 2 de Obesidad");
        } else if (imc >= 40.1) {
            System.out.println("Categoria: Grado 3 de Obesidad");
        } else {
            System.out.println("No valido");
        }
    }

    public static void conversionDeSegundos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Convertir de segundos a dia, horas y minutos");
        System.out.print("Ingrese el tiempo en segundos: ");
        var segundos = entrada.nextFloat();
        float dias = segundos / (3600 * 24);
        float horas = segundos * (1 / 3600f);
        float minutos = segundos / 60;

        System.out.printf("Dias: %.2f\nHoras: %.2f\nMinutos: %.2f\nSegundos: %.2f\n", dias, horas, minutos, segundos);

        entrada.close();
        DrawLine();
    }

  

    public static void DrawLine() {
        System.out.println("==================================================================================");
    }
}
