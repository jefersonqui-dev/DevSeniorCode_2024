public class Ejercicio2 {
    public static void main(String[] args) {
        var kg = 1000;
        var precioPernilIberic = 5.95;
        var precioGramoPernil = precioPernilIberic / 100;
        var precioCorrectoPernilKilo = precioGramoPernil * kg;
        System.out.printf("El precio Correcto del Pernil es: %f", precioCorrectoPernilKilo);
    }
}
