import java.util.ArrayList;
import java.util.Scanner;

public class funcionesArray {
    static Scanner request = new Scanner(System.in);
    private static ArrayList<String> tasks = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        operacionesConArrays();
        matrizDeRotacion();

    }

    public static int[] operacionesConArrays() {

        System.out.print("Operaciones de un Array: Ingrese el Tamaño: ");
        var arraySize = request.nextInt();
        int[] array = new int[arraySize];// [0,0,0,0,0]
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.printf("Ingrese el valor en la posicion [%d]: ", i);
            array[i] = request.nextInt();
        }
        // Imprimir el array Original
        printArray(array);

        // Operaciones con el array
        addArray(array);
        findMaxValue(array);
        findMinValue(array);
        invertArray(array);
        findAverage(array);
        findMode(array);
        sortInDescendingOrder(array);
        printArray(array);
        request.close();
        DrawLine();
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

    public static int[] invertArray(int[] array) {
        int[] arrayInvert = new int[array.length];
        int pos = array.length - 1;
        for (int i = 0; i <= array.length - 1; i++) {
            arrayInvert[i] = array[pos];
            pos--;
        }
        printArray(arrayInvert);

        return arrayInvert;

    }

    public static void sortInDescendingOrder(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void findAverage(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double promedio = suma / array.length;
        System.out.println("El promedio es: " + promedio);
    }

    public static void findMode(int[] array) {
        int mode = array[0];
        int maxFrecuency = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int frecuency = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < currentNumber) {
                    frecuency++;
                }
            }
            if (frecuency > maxFrecuency) {
                maxFrecuency = frecuency;
                mode = currentNumber;
            }
        }
        System.out.println("Moda: " + mode);
    }

    public static void matrizDeRotacion() {
        System.out.print("Ingrese la dimension de la matriz: ");
        int arraySize = request.nextInt();
        int[][] array = new int[arraySize][arraySize];
        int[][] rotatedMatrix = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("Ingrese el valor en la posicion [%d][%d] ", i, j);
                array[i][j] = request.nextInt();
            }
        }
        // Mostrar Matriz

        for (int k = 0; k < array.length; k++) {
            for (int l = 0; l < array.length; l++) {
                System.out.print(array[k][l]);
                System.out.print(" ");
            }
            System.out.println();
        }

        // Rotar la matriz
        for (int m = 0; m < array.length; m++) {
            for (int n = 0; n < array.length; n++) {
                rotatedMatrix[n][array.length - 1 - m] = array[m][n];
            }
        }
        // Imprimir matriz rotada
        System.out.println("\nMatrix rotada \n");
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix.length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void DrawLine() {
        System.out.println();
        System.out.println("========================================================================");
    }
}
