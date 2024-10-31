public class Ejercicio6 {
    public static void main(String[] args) {
        short precioPantalonesConDescuento = 34;
        var descuentoPantalones = 0.15f;
        var precioOriginal = precioPantalonesConDescuento / (1 - descuentoPantalones);
        System.out.printf("El precio original de los pantalones es: %f", precioOriginal);
    }
}
