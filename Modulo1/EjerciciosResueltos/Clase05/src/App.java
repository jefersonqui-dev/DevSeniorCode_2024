import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        printWelcomeMessage();
        operacionesConArrays();

    }

    public static int[] operacionesConArrays() {
        Scanner getValue = new Scanner(System.in);
        System.out.print("Operaciones de un Array: Ingrese el Tamaño: ");
        var arraySize = getValue.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.printf("Ingrese el valor en la posicion [%d]: ", i);
            array[i] = getValue.nextInt();
        }
        printArray(array);
        addArray(array);
        findMaxValue(array);
        findMinValue(array);
        invertArray(array);

        getValue.close();

        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int j = 0; j <= array.length - 1; j++) {
            System.out.printf(array[j] + " ");
        }
        System.out.println("]");
    }

    public static void addArray(int[] array) {
        int suma = 0;
        for (int j = 0; j <= array.length - 1; j++) {
            suma += array[j];
        }
        System.out.printf("\nLa suma es: %d\n", suma);

    }

    public static void findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.printf("El valor maximo es: %d\n", maxValue);

    }

    public static void findMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.printf("El valor minimo es: %d\n", minValue);
    }

    public static void invertArray(int[] array) {
        int[] arrayInvert = new int[array.length];
        int pos = array.length - 1;
        for (int i = 0; i <= array.length - 1; i++) {
            arrayInvert[i] = array[pos];
            pos--;
        }
        printArray(arrayInvert);
        DrawLine();
    }

    public static void sortInDescendingOrder() {

    }

    public static void findAverage() {

    }

    public static void findMode() {

    }

    private static void printWelcomeMessage() {
        System.out.println("========================================================================");
        System.out.println("|                      Ejercicios Resueltos Clase 05                   |");
        System.out.println("========================================================================");
        System.out.println();
    }

    private static void DrawLine() {
        System.out.println();
        System.out.println("========================================================================");
    }
}
