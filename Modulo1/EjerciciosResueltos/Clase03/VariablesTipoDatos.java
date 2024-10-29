import java.util.Scanner;
public class VariablesTipoDatos {
public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Ingrese un Valor: "); 
    var text = scanner.nextLine();
    System.out.printf("El valor ingresado fue: %s%n", text);
    scanner.close();

    
    boolean active;
    byte numbreByte;
    short numberShort;
    int numberInt;
    long numberLong;
}
    
}