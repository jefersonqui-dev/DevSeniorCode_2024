import java.util.Scanner;

public class AnalysisOfStudentGrades {
    static Scanner request = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void showMenu() {
        boolean showMenu = true;
        do {
            System.out.println("""
                    \n----------------Análisis de Calificaciones de Estudiantes----------------
                    1. Mostrar Registro de Calificaciones
                    2. Calcular Promedio de Calificaciones
                    3. Contar Estudiantes por Materia
                    4. Filtrar Calificaciones Mayores a un valor Especifico
                    5. Obtener la Materia con el Promedio mas Alto
                    0. Salir
                    """);
            System.out.print("Elija una Opción: ");
            if (request.hasNextInt()) {
                int option = request.nextInt();
                request.nextLine();
                switch (option) {
                    case 1:
                        showRecord();
                        break;
                    case 2:
                        // Calcular el promedio de calificaicones por estudiante
                        calculateAverageGradesPerStudent();
                        break;
                    case 3:
                        // contar estudiantes por materia
                        countStudentsBySubject();
                        break;

                    case 4:
                        // Filtrar Calificaciones mayores a un valor especificado
                        filterRatingsToSpecificValue();
                        break;

                    case 5:
                        // Obtener la materia con el promedio mas alto
                        getHighestAverageSubject();

                        break;

                    case 0:
                        showMenu = false;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("\n Opción Invalida. Intente de Nuevo");
                }
            } else {
                System.out.println("\n Entrada Invalida. Intente de Nuevo");
                request.nextLine();
            }
        } while (showMenu);
        request.close();
    }

    private static void showRecord() {

    }

    private static void getHighestAverageSubject() {

    }

    private static void filterRatingsToSpecificValue() {

    }

    private static void countStudentsBySubject() {

    }

    private static void calculateAverageGradesPerStudent() {

    }

}
