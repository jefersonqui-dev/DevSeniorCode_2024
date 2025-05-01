import java.util.Scanner;

public class contenido {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("1: Frase 1: ");
        System.out.println("2) Frase 2:");
        System.out.println("3) Frase 3:");

        String nombreHeroe = lector.nextLine();
        System.out.println("Elije el valor del poder");
        System.out.println("1) 50000");
        System.out.println("2) 100000");
        int nivelDePoder = lector.nextInt();

        System.out.println("Soy"  + nombreHeroe + "!");
        System.out.println(" Y tengo el poder de " + "Mi nivel de poder es" + nivelDePoder);



        

    }
}
