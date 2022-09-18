package BigDecimal;

import java.math.BigDecimal;
//BigDecimal se usa pra hacer cálculos de gran precisión
//Hay que mirarlo mejor, por que devuelve valores que tampoco son exactos

public class Main {
    public static void main(String[] args) {
        //Los dator tipo float y double dan problemas como este:
        System.out.println("Suma de floats: "+ (0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f));
        //esto devuelve:1.0000001 en lugar de 1.0
        //para evitar esos fallos usaremos la clase BigDecimal:

        BigDecimal valorA = new BigDecimal(3f); //para usarlo hay que usar los métodos propios que solo trabajan
        // con datos del mismo tipo. vamos a multiplicar valorA * valorB
        BigDecimal valorB = new BigDecimal(36.005f);

        BigDecimal resultado =  valorA.add(valorB);

        System.out.println(resultado);


    }
}
