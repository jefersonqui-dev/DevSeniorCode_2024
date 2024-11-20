import java.util.ArrayList;
import java.util.Scanner;

public class GestionDeTareas {
    static Scanner request = new Scanner(System.in);

    public static void main(String[] args) {
        DrawLine();

        // Desarrolla un programa que gestione una lista de tareas pendientes.
        // El programa debe permitir agregar nuevas tareas, eliminar tareas completadas
        // y mostrar todas las
        // tareas pendientes en el orden en que fueron agregadas. Además, debe permitir
        // acceder a una tarea
        // específica por su posición en la lista.
        menuTask();
        DrawLine();
    }

    public static void menuTask() {
        ArrayList<String> listaTareas = new ArrayList<>();
        int opcion;
        do {
            DrawLine();
            System.out.println("Gestion de Tareas Pendientes:");
            System.out.println("1. Agregar tareas");
            System.out.println("2. Eliminar Tarea");
            System.out.println("3. Mostrar Tareas");
            System.out.println("4. Acceder a Tarea por Posicion");
            System.out.println("5. Salir");
            System.out.print("Seleccione Una Opcion: ");
            opcion = request.nextInt();
            request.nextLine(); // Limpiar Buffer
            switch (opcion) {
                case 1:
                    addTask(listaTareas, request);
                    break;
                case 2:
                    removeTask(listaTareas, request);
                    break;
                case 3:
                    showTask(listaTareas);
                    break;
                case 4:
                    accessTask(listaTareas, request);
                    break;
                case 5:
                    System.out.println("¡Adios!");
                    break;

                default:
                    break;
            }

        } while (opcion != 5);
    }

    public static void addTask(ArrayList<String> lista, Scanner request) {
        System.out.print("Ingrese La Descripcion de la Tarea: ");
        String task = request.nextLine();
        lista.add(task);
        System.out.println("\nTarea Agregada: \"" + task + "\"");
    }

    public static void removeTask(ArrayList<String> lista, Scanner request) {
        if (lista.isEmpty()) {
            System.out.println("No hay Tareas para Eliminar");
        }
        showTask(lista);
        System.out.print("Ingrese la posicion de la tarea que desea eliminar: ");
        int posicion = request.nextInt();
        if (posicion >= 0 && posicion < lista.size()) {
            String taskRemove = lista.remove(posicion);
            System.out.println("Tarea Eliminada: \"" + taskRemove + "\" ");
        } else {
            System.out.println("Posicion Invalida");
        }
    }

    public static void showTask(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("\nNo hay tareas Pendientes.\n");
        } else {
            System.out.println("\nTareas Pendientes:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + ": " + lista.get(i));
            }
        }
    }

    public static void accessTask(ArrayList<String> lista, Scanner request) {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas por acceder");
            return;
        }
        showTask(lista);
        boolean isValida;
        int posicion;
        do {
            System.out.print("Ingresa la posicion de la tarea: ");
            posicion = request.nextInt();
            isValida = (posicion >= 0 && posicion < lista.size());
            if (!isValida) {
                System.out.println("Posicion invalida: Intenta de Nuevo:");
            }
        } while (!isValida); // Repite hasta que se ingrese una posicion valida
        System.out.println("\nTarea en posicion: " + posicion + " \"" + lista.get(posicion) + "\"");

    }

    public static void DrawLine() {
        System.out.println("===========================================");
    }
}
