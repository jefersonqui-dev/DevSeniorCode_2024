import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoringApplicationSetting {

    private static Map<String, String> configuraciones = new HashMap<>();
    static Scanner request = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            showMenu();
            int option = request.nextInt();
            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion No valida. Intente nuevamente.");
            }

        }
        request.close();
    }

    public static void showMenu() {
        System.out.println("""
                ---------Menu---------
                1. Agregar configuracion
                2. Actualizar Configuracion
                3. Mostrar Configuraciones
                4. Salir
                """);
        System.out.println("Elija una opción");
    }

    public static void mostrarConfiguraciones() {

    }

    public static void addconfiguration(String clave, String valor) {

    }

    public static void actualizarConfiguracion(String clave, String valor) {

    }

}
