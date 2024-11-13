import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        printWelcomeMessage(); 
        operacionesConArrays();
    }

    public static void operacionesConArrays() {
        Scanner getValue = new Scanner(System.in);
        System.out.print("Operaciones de un Array: Ingrese el Tamaño: ");       
        var arraySize = getValue.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i <= array.length-1; i++) {
            System.out.printf("Ingrese el valor en la posicion [%d]: ",i);
            array[i] = getValue.nextInt();
            
        }
        System.out.println(array);
        
        getValue.close();
    }

    public static void findMaxValue() {

    }

    public static void findMinValue() {

    }

    public static void invertArray() {

    }

    public static void sortInDescendingOrder() {

    }

    public static void findAverage() {

    }

    public static void findMode() {

    }

    private static void printWelcomeMessage() {
        System.out.println("====================================");
        System.out.println("| Ejercicios Resueltos Clase 05    |");
        System.out.println("====================================");
        System.out.println();
    }
}
