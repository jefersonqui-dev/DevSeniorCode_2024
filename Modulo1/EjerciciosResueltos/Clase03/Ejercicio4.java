public class Ejercicio4 {
    public static void main(String[] args) {
        var capitalCarmen = 23;
        var descuentoCine = 0.7;
        var montoDisponible = 12.75;
        var totalGastos = (capitalCarmen - montoDisponible);
        System.out.printf("Carmen se ha gastado: %f %n", totalGastos);
        var precioEntrada = totalGastos / (1- descuentoCine); 
        System.out.printf("El valor original de la entrada es de: %f", precioEntrada);

    }
}
