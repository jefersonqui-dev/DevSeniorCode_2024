public class tutoria5 {
    public static void main(String[] args) throws Exception {
        int resultadoDeLaSuma = SumarEnteros(5, 6);
        System.out.println("El resultado de la suma es: " + resultadoDeLaSuma);

        int resultadoDeLaDivision = DividirDosEnteros(10,2);
        System.out.println("El resultado de la division: " + resultadoDeLaDivision);
    }

    public static int SumarEnteros(int a, int b){
        int resultado = a + b;

        return resultado;
    }
    public static int DividirDosEnteros(int a, int b){
        System.out.println("Ejecutando medoto division: ");
        int resultado = a / b;
        return resultado;
    }
}
