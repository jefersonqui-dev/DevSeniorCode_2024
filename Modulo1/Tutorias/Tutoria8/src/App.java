import java.util.Scanner;

public class App {
    // Elmentos Necesarios para la mayoria de las acciones
    static Scanner scanner = new Scanner(System.in);
    static String[] planetas = { "Mercurio", "Venus", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno", "Venus" };
    static String[] naves = { "Solaris-Explorer", "Aegis-Protector", "Orion-Supply", "Artemis-Fixer" };
    static double[] distancias = { 77000.0, 41000.0, 225000.0, 628000000.0, 1275000000.0, 2725000000.0, 4351000000.0 };
    static double[] velocidades = { 150000.0, 200000.0, 120000.0, 140000 };

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
