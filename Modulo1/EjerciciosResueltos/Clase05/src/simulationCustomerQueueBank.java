import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class simulationCustomerQueueBank {

    private static Queue<String> cola = new LinkedList<>();

    public static void agregarCliente(String cliente) {
        cola.add(cliente);
        System.out.println("Cliente " + cliente + " ha llegado. Estado actual de la cola: \n" + cola);
    }

    public static void atenderCliente() {
        if (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Cliente " + cliente + " ha sido atendido. Estado actual de la cola: " + cola);
        } else {
            System.out.println("No hay clientes en la cola para atender.");
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Atender cliente");
        System.out.println("3. Salir");
        System.out.print("Elija una opción: ");
    }

    public static void main(String[] args) {
        Scanner request = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = request.nextInt();
            request.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = request.nextLine();
                    agregarCliente(cliente);
                    break;
                case 2:
                    atenderCliente();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        request.close();
    }
}
