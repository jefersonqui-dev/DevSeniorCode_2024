import java.util.Scanner;

public class App {
    // Elmentos Necesarios para la mayoria de las acciones
    static Scanner scanner = new Scanner(System.in);
    static String[] planetas = { "Marte", "Jupiter", "Saturno" };
    static String[] naves = { "Exploradora", "Carga pesada", "Velocidad Maxima" };
    static double[] distancias = { 78.0, 628.0, 1256.0 };
    static double[] velocidades = { 20000.0, 15000.0, 30000.0 };

    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    seleccionarPlaneta();
                    break;
                case 2:
                    seleccionarNave();
                    break;

                default:
                    break;
            }

        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.println("\n---Menú Principal----");
        System.out.println("1. Seleccionar un planeta de Destino");
        System.out.println("2. Seleccionar una nave espacial");
        System.out.println("3. Iniciar el vuelo");
        System.out.println("Por favor Elige una opción: ");

    }

    public static void seleccionarNave() {

    }

    public static void seleccionarPlaneta() {

    }

    public static void calcularRecursos() {

    }

}
