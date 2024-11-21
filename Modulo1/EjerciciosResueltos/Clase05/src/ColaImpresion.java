import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaImpresion {
    static Scanner request = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<String> queuePrint = new LinkedList<String>();
        int opcion;
        do {
            DrawLine();
            System.out.println("\n ---Menu Cola de Impresion---");
            System.out.println("1. Agregar Documento a la Cola");
            System.out.println("2. Eliminar Documento Actual (imprimiendo)");
            System.out.println("3. Mostrar Documentos de la Cola");
            System.out.println("4. Salir");
            System.out.print("Seleccione Una Opcion: ");

            opcion = request.nextInt();
            request.nextLine(); // Limpiar Buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del Documento: ");
                    String document = request.nextLine();
                    queuePrint.add(document);
                    System.out.println("Documento \"" + document + "\" agregado a la cola");
                    break;
                case 2:
                    if (!queuePrint.isEmpty()) {
                        String remove = queuePrint.poll();
                        System.out.println("Documento \"" + remove + "\" Eliminado");
                    } else {
                        System.out.println("La Cola esta vacia, no hay documentos para Imprimir...");
                    }
                    break;
                case 3:
                    if (!queuePrint.isEmpty()) {
                        System.out.println("Documentos en la Cola");
                        for (String documents : queuePrint) {
                            System.out.println("- " + documents);
                        }
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    request.close();
                    return;

                default:
                    System.out.println("Opcion No valida. Intenta de Nuevo");
                    break;
            }

        } while (opcion != 5);
    }

    public static void addDocumentQueue() {

    }

    public static void DrawLine() {
        System.out.println("===========================================");
    }
}
