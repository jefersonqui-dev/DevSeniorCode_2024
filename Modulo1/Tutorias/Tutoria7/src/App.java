public class App {
    public static void main(String[] args) throws Exception {
        Ejemplo1();
    }

    // contexto para el uso de arreglos, comoutilizar ciclo for y ciclos
    // La empresa quiere ver el promedio de ventas de uno de sus productos en una
    // semana.
    //cada dia generará un numero de ventas. lunes = 30, martes = 45;
    public static void Ejemplo1() {
        //int[] ventasDiarias = new int[7];
        int[] ventasDiarias = {200,150,220,230,170,229,345};
        //calcular el valor del promedio de ventas
        int suma = 0;
        //ultima posicion = length - 1 (0,1,2,3,4,5,6,7,8)  -> length = 9;
        for(int i = 0; i <= ventasDiarias.length - 1; i++){
            System.out.printf("Posicion [%d] : %d\n",i,ventasDiarias[i]); 
            suma += ventasDiarias[i];
        }
        System.out.println(suma);
    }
}
