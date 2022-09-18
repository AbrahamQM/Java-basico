package Repetición;

public class ForEach {
    public static void main(String[] args) {

        /**
         * Vamos a hacer un forEach aunque no se escribe así, se usa for (declaración de variable del mismo tipo
         * que el array : nombre del array){}
         * eso va a ir pasando POR CADA UNA de las posiciones del array y almacena en la variable declarada el valor
         * de cada posición.
         */

        String[] nombres = {"Abraham", "Ana", "Pepe", "Juan"};     //Creamos e inicializamos LOS ARRAY SE INICIALIZAN CON {}
        // un array de Strings con nombres para usar con forEach

        for (String nomb : nombres) {      //Se declaran creando una variable del mismo tipo que el array
            // e indicando una condición
            System.out.println("\nnombre actual: " + nomb);
            System.out.println(nombres);        //Esto muestra el puntero a memoria. lo puse por probar
        }

        //Hacemos otro array de números para ver otro ejemplo
        int[] numeros = {1957, 2500, 3600, 55, 10000}; //OjO:LOS ARRAY SE INICIALIZAN CON {}
        int suma = 0; //Creamos una variable para comprobar la secuencia


        for(int num: numeros){      //Se declaran creando una variable e indicando una condición
            System.out.println("\nnúmero actual: "+num);
            suma+=num;
            System.out.println("Sumatorio = "+suma);
        }
    }
}
