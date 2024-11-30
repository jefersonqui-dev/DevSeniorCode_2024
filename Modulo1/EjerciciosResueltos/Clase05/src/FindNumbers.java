import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindNumbers {
    static Scanner requests = new Scanner(System.in);

    public static void main(String[] args) {
        addNumbers();
    }

    public static void addNumbers() {
        var numbers = new ArrayList<Integer>();
        System.out.println("Ingrese los numeros (escriba 'fin' para terminar): ");
        while (true) {
            System.out.print("Numero: ");
            String input = requests.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        finUniqueNumbers(numbers);
    }

    private static void finUniqueNumbers(ArrayList<Integer> numbers) {
        var frecuencyMap = new HashMap<Integer, Integer>();

        for (int number : numbers) {
            frecuencyMap.put(number, frecuencyMap.getOrDefault(numbers, 0) + 1);
        }
        var uniqueNumbers = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : frecuencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }
        System.out.println("Numeros unicos: " + uniqueNumbers);
    }
}
