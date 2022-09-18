//Vamos por Conceptos 10.2 ARRAYS
//https://vimeo.com/623336746/67a398ff84

//SE PUEDEN CREAR ARRAYS CON CUALQUIER TIPO DE DATOS(int, char, double,float,...) O CLASE COMO (Coche.java)

public class ArraysMain {
    public static void main(String[] args) {

        String nombre1 = "Ana María";
        String nombre2 = "Abraham";
        String nombre3 = "Suki";
        String nombre4 = "Nombre 4º";
        //para trabajar con estas 4 String, podemos crear una estructura de datos incluyéndolas

        //Creamos un array
        String[] nombres = new String[4]; //Creamos un array de String con 3 variables string
        //La diferencia con una variable está en los corchetes, para identificar que es un array

        //Se pueden hacer ARRAYS de cualquier tipo de datos ej:
        int[] numeros = new int[5]; // un array que contiene 5 variables de tipo int

        //Incluso se pueden hacer ARRAYS de una clase ej: clase Coche.java
        Coche[] coches = new Coche[2];

        //vamos a trabajar con los ARRAYS asignándole valor uno a uno. Diferente de línea 49
        // Donde  ya le asignamos los valores en la misma declaración.
        nombres[0] = nombre1; // recuerda que se comienza a apuntar a la variable o clase con el "0"
        nombres[1] = nombre2; // siempre apuntamos a (nº de variable que queremos referirnos) - 1
        nombres[2] = nombre3;
        nombres[3] = nombre4;//y terminamos de apuntar en (nº de variables total) - 1
        //si pusiéramos nombre[4] mostraría este error:

   /*   Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at ArraysMain.main(ArraysMain.java:28) */



        //para imprimirlos todos juntos:
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        /* Eso sería como hacer sout de nombre1, nombre2 y nombre3 así:
        System.out.println(nombres[0]); o: System.out.println(nombre1);
        System.out.println(nombres[1]); o: System.out.println(nombre2);
        System.out.println(nombres[2]); o: System.out.println(nombre3); */



        //Otra manera de declarar un array TipoVariable[] nombreVariable = new TipoVariable[] { nombre1, nombre2, ...}
        String[] nombres2 = new String[]{ nombre1, nombre2, nombre3, nombre4}; /* Es una forma similar a:
         int[] numeros = new int[5];
         Pero de esta forma, le estamos pasando todos los nombres al declararlo y, así detecta cuantos hay
         y asigna esa longitud*/

    }
}
