import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrecuency {
    static Scanner request = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingresa el texto: ");
        String texto = request.nextLine();

        texto = texto.toLowerCase(); // Convierte a minusculas
        // texto = removeTildes(texto);
        texto = texto.replaceAll("[^a-záéíóúñ ]", "");

        // Dividir el texto en palabras
        String[] palabras = texto.split(" ");

        // Aqui contamos la frecuencia de las palabras
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);

            }
        }

        // Mostramos la frecuencia de las palabras
        System.out.println("Frecuencia de la palabras");
        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        request.close();

    }

    // public static String removeTildes(String texto) {
    // texto = texto.replace("á", "a");
    // texto = texto.replace("é", "e");
    // texto = texto.replace("í", "i");
    // texto = texto.replace("ó", "o");
    // texto = texto.replace("ú", "u");
    // texto = texto.replace("Á", "A");
    // texto = texto.replace("É", "E");
    // texto = texto.replace("Í", "I");
    // texto = texto.replace("Ó", "O");
    // texto = texto.replace("Ú", "U");
    // texto = texto.replace("ü", "u");
    // texto = texto.replace("Ü", "U");
    // return texto;
    // }
}
