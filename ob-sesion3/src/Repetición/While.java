package Repetición;

public class While {
    public static void main(String[] args) {


        int contador = 0;
        while (contador < 18) {       //Mientras contador sea menor que 18 hacer{}
            contador++;

            if (contador == 15) {     //Vamos a poner otro interruptor, pero es por probar cosas.
                //    break;            //Si lo ponemos llegará hasta 14, el 15 cortaría el bucle
                continue; // al poner esto, salta a la siguiente iteración del bucle por lo que no imprime la línea del 15
            }

            System.out.println("Sigue dentro del while, contador va por: " + contador);
        }

        System.out.println("Ha salido del while");

        contador = 0; //inicializamos de nuevo el contador

        System.out.println("\nAhora un do while\n");

        do {       // Hacer{}
            contador++;

            if (contador == 5) {     //Vamos a poner otro interruptor, pero es por probar cosas.
                //    break;            //Si lo ponemos llegará hasta 14, el 15 cortaría el bucle
                continue; // al poner esto, salta a la siguiente iteración del bucle por lo que no imprime la línea del 5
            }

            System.out.println("Sigue dentro del doWhile, contador va por: " + contador);
        }while (contador < 10) ; //a diferencia del while, el doWhile comprueba la condición
        // al final del contenido del bucle.  Incluye el 10 porque se suma1 e imprime antes de comprobarlo
    }
}
