import java.util.Scanner;
import java.util.ArrayList;

public class StudentListManagement {
    static Scanner request = new Scanner(System.in);
    static ArrayList<String> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        int option;

        boolean exit = false;
        do {

            System.out.println("""
                    1. Agregar Estudiantes
                    2. Emilinar Estudiantes
                    3. Mostrar Estudiantes Inscritos
                    0. Salir
                        """);
            System.out.print("Elige una Opcion: ");
            option = request.nextInt();
            switch (option) {
                case 1:
                    addStudents();
                    break;
                case 2:
                    removeStudents();
                    break;
                case 3:
                    showStudentList();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no valida, Intente de Nuevo");
                    break;
            }
        } while (!exit);
    }

    public static void addStudents() {

        System.out.print("Ingrese la cantidad de estudiantes que desea agregar: ");
        int cantidad = request.nextInt();
        request.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese estudiante #" + (i + 1) + ": ");
            String nameStudent = request.nextLine();
            estudiantes.add(nameStudent);

        }
    }

    public static void removeStudents() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para eliminar");
            return;
        }
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
        System.out.print("Ingrese el numero del estudiante que desea eliminar: ");
        var numeroEstudiante = request.nextInt();
        if (numeroEstudiante > 0 && numeroEstudiante <= estudiantes.size()) {
            String removeStudent = estudiantes.remove(numeroEstudiante - 1);
            System.out.println("Estudiante: " + removeStudent + ": Eliminado");
        } else {
            System.out.println("Numero de estudiante No valido");
        }
    }

    public static void showStudentList() {
        if (estudiantes.isEmpty()) {
            System.out.println("No estudiantes Inscritos");
        } else {
            System.out.println("Lista de estudiantes inscritos");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + "." + estudiantes.get(i));
            }
        }
    }
}
