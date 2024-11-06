import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        showMenu(entrada);
        entrada.close();
    }

    private static void showMenu(Scanner keyboard) {
        int option;

        do {

            System.out.println("=====================");
            System.out.println(" Menu Clase 05");
            System.out.println("----------------------");
            System.out.println("1. Prueba del Ciclo While");
            System.out.println("2. Prueba del do While");
            System.out.println("3. Prueba del ciclo for");
            System.out.println("0. Salir de la aplicacion");
            System.out.println("Ingrese su opcion: ");
            option = keyboard.nextInt();
            keyboard.nextLine(); // limpiar el buffer == Gastar enter
            switch (option) {
                case 1:
                    whileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                    System.out.println("Hasta Luego: ");
                    break;
                default:
                    System.err.println("Ingrese una opcion valida");
                    break;
            }
            if (option != 0) {
                pressEnter(keyboard);
            }

        } while (option != 0);
    }

    public static void whileTest() {
        var counter = 0;
        while (counter <= 10) {
            System.out.println(counter++);
        }
    }

    public static void doWhileTest() {
        var counter = 0;
        do{
            System.out.println(counter++);
        }while (counter <= 10);        
    }

    public static void forTest() {
        var counter = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(counter++);
        }
    }

    private static void pressEnter(Scanner key) {
        System.out.println("Presione ENTER para continuar");
        key.nextLine();
    }
}