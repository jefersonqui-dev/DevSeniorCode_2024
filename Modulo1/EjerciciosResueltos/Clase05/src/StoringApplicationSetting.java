import java.util.Scanner;

public class StoringApplicationSetting {

    static String[] settingName = new String[10];
    static String[] settingValue = new String[10];
    static int contador = 0;
    static Scanner request = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n---  Menu Configuraciones ---");
            System.out.println("1. Agregar o actualizar configuración");
            System.out.println("2. Mostrar todas las configuraciones");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            int opcion = request.nextInt();

            request.nextLine();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el nombre de la configuración: ");
                    String name = request.nextLine();

                    System.out.print("Ingrese el valor de la configuración: ");
                    String value = request.nextLine();

                    addSetting(name, value);

                    break;

                case 2:

                    showSettings();
                    break;

                case 3:

                    System.out.println("Saliendo del programa...");
                    request.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void addSetting(String name, String value) {
        if (contador < settingName.length) {
            settingName[contador] = name;
            settingValue[contador] = value;
            contador++;
            System.out.println("Configuracion " + name + " agregada");
        } else {
            System.out.println("No hay espacio para mas configuraciones");
        }
    }

    public static void uptadeSetting(String name, String value) {
        for (int i = 0; i < contador; i++) {
            if (settingName[i].equals(name)) {
                settingValue[i] = value;
                System.out.println("Configuracion" + name + " Actualizada");
                return;
            }
        }
        System.out.println("La configuracion " + name + "No existe. Agregue la configuracion primero");
    }

    public static void addOrUpdateSettings(String name, String value) {

        for (int i = 0; i < contador; i++) {
            if (settingName[i].equals(name)) {
                uptadeSetting(name, value);
                return;

            }
        }
        addSetting(name, value);

    }

    public static void showSettings() {

        if (contador == 0) {

            System.out.println("No hay configuraciones almacenadas.");

        } else {

            System.out.println("Configuraciones actuales:");

            for (int i = 0; i < contador; i++) {
                System.out.println(settingName[i] + ": " + settingValue[i]);
            }

        }

    }

}