import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicateEmailCheck {
    static Scanner request = new Scanner(System.in);

    public static void main(String[] args) {
        Drawine();
        var emails = new ArrayList<String>();

        System.out.print("Ingrese la catidad de correos electronicos: ");
        int cantidad = request.nextInt();
        request.nextLine();

        System.out.println("Ingresa los correos electronicos: ");
        for (int i = 0; i < cantidad; i++) {

            System.out.printf("email %d", i);
            System.out.print(": ");
            String email = request.nextLine();

            emails.add(email);

        }
        duplicateCheck(emails);
        request.close();
    }

    public static void duplicateCheck(List<String> emails) {
        var unicos = new HashSet<String>();
        var duplicados = new HashSet<String>();
        for (String email : emails) {
            if (!unicos.add(email)) { // Si no se puede Agregar es un duplicado y se almacena en duplicados
                duplicados.add(email);
            }
        }
        if (duplicados.isEmpty()) {
            System.out.println("No se encontrarn correos Duplicados");
        } else {
            System.out.println("Se encontrarn correos Duplicados");
            for (String email : duplicados) {
                System.out.println(email);
            }
        }
    }

    public static void Drawine() {
        System.out.println("===========================================================");
    }
}
