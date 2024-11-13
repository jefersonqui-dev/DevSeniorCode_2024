public class Ejercicio2 {
    public static void main(String[] args) {
        short cantidadGramos = 1000;
        var precioPernilIberic = 5.95f;
        var precioGramoPernil = (precioPernilIberic / 100);
        var precioCorrectoPernilKilo = precioGramoPernil * cantidadGramos;
        System.out.printf("El precio Correcto del Pernil es: %f", precioCorrectoPernilKilo);
    }
}
