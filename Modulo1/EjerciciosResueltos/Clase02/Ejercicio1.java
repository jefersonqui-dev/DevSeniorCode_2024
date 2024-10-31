public class Ejercicio1 {
    public static void main(String[] args) {
        byte operacionMatematica = 6 / 2 * (1 + 2);
        System.out.printf("El Resultado es: %d", operacionMatematica);

        // El resultado que se mostrara en Consola es 9, este es el valor correcto
        //teniendo en cuenta la prioridad de los operadores, en este caso
        // hay operadores de igual prioridad, pero por regla general se toma
        // de izquierda a derecha.

        //El caso particular que el resultado sea 1, esta relacionada como
        // la calculadora puede manejar los operadores de manera diferente
        // que para este caso seria el uso implícito del parentesis por lo
        // que podriamos escribir (6/2)*(1+2) para obtener el mismo valor.
   
    }
}
