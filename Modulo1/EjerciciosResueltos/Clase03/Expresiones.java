
public class Expresiones {
    public static void main(String[] args) {
        var num1 = 10;
        var num2 = -5;
        var num3 = num1 + num2; // 10 + (-5) = 5
        var num4 = 40 - num3; 
        System.out.println(num3);
        var num5 = 10*25 - 30 / 8;
        
        var num6 = 157 / 11;
        var num7 = 157 % 11;
        System.out.printf("La division entre 7 y 2 es: %d y su residuo es: %d%n",num6,num7);

        //Tener en cuenta la jerarquia de operaciones:
        //Operaciones postfijos
        //Operadores Unarios:
        //Multiplicacion y Division
        // Suma y Resta
        //Asignacion 
        //Operadores ++ y -- Prefijos
        num8 = 26;
        num9 = 18;
        var num10 = num8++ - --num9;  //  26    -  17
        var num10 = ++num8 - num9--;  //  27    -  18
                
        num6++; // num6 = num6 + 1; Uso el numero y luego incremento  --> 26
        num6--; // num6 = num6 - 1; Uso el numero y luego decremento
        ++num6; // num6 = num6 + 1 Decremento y Luego uso el numero
        --num6; // num6 = num6 - 1 Incremento y Luego uso el numero

        
    }
}
