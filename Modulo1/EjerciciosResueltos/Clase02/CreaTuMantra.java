import java.util.Scanner;

public class CreaTuMantra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una palabra Inspiradora ej: ");
        System.out.println(" Innovacion\n Inspiracion \n Curiosidad\n Pasion\n Energia\n");
        String palabra = entrada.nextLine();

        System.out.println("Escribe una Accion que te motive ej: ");
        System.out.println(" Explorar\n Crear\n Aprender\n Desarrollar\n Programar\n");
        String accion= entrada.nextLine();

        System.out.println("Escribe un Objetivo o meta ej: ");
        System.out.println(" exito\n Futuro\n Conocimiento\n Talento\n Comunidad");
        String objetivo = entrada.nextLine();

        System.out.println("Tu Mantra es: ");
        System.out.println("Con " + palabra + ", soy capaz de " + accion + " y perfeccionar mi " + objetivo + " Hasta alcanzar la excelencia" );
        entrada.close();
    }
}
