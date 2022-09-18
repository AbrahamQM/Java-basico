package Arrays;

public class Main {
    public static void main(String[] args) {
        //se puede declarar un tamaño[tamaño] o inicializarlo:
/********************DECLARACIÓN POR TAMAÑO***********************************************************************/
        int arrayUno[] = new int[5];//Creamos un array[tamaño] INDICANDO EL TAMAÑO.
        // puede ser int o lo que sea: char, Strings.Main, float...

        for (int i : arrayUno){
            System.out.println(i);  //esto va a imprimir 4 "0" por que aun no le hemos dado valores
        }

        //Asignamos los valores |0|1|2|3|4|
        //                       1 2 3 4 5
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;
        //Ahora lo comprobamos
        System.out.println("arrayUno:");
        for (int i : arrayUno){
            System.out.println(i);  //esto va a imprimir 4 "0" por que aun no le hemos dado valores
        }
/*********************DECLARACIÓN INICIALIZÁNDOLO**********************************************************************/
        int arrayDos[] = {6,7,8,9,10};   //Creamos un Array inicializándolo
        System.out.println("\narrayDos:");
        for (int i : arrayDos){
            System.out.println(i);
        }
        //Con Strings se podría hacer igual:
        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };
        System.out.println("Ahora con nombres: ");
        for (String i : nombres){
            System.out.println(i);
        }
        //Vamos a comprobar la longitud de los arrays

        System.out.println("Longtud del Array arrayUno:"+ arrayUno.length);
        System.out.println("Longtud del Array arrayDos:"+ arrayDos.length);
        System.out.println("Longtud del Array nombres:"+ nombres.length);
        //OJO EN UN ARRAY ES DIFERENTE QUE EN UN String
        //LINEA 46 ES DIFERENTE A:
        System.out.println("Longtud de nombres POSICIÓN [2]:"+ nombres[2].length()); // Esto mostrará la longitud del valor
        // que hay en nombres[2]

/********************************RECORREMOS LOS ARRAYS*******************************************************/


        System.out.println("\nRecorremos el array nombre con for específico para arrays:");
        //for (Variable temporal del mismo tipo : nombre del arrray)
         for (String nombre: nombres) {
            System.out.println("Nombre actual:" + nombre);
        }

        System.out.println("\nRecorremos el array nombre con un for genérico:");
        //for (Variable temporal índice int =0; condición; modificación de i)
        for (int i=0;i<nombres.length;i++){
            System.out.println("Nombre actual:"+nombres[i]+" en posición: "+i); //Muestra la posición por la que va
            // el índice "i"
        }

        System.out.println("\nAhora recorremos el array con un while:");
        //while (condición){sentencias} EJEMPLO:
        int contador=0;
        while (contador < nombres.length){
            System.out.println("Nombre actual:"+nombres[contador]+" en posición: "+contador);
            contador++;
        }

/******************************SACAMOS UN VALOR DEL ARRAY*****************************************************************/
        String ultimoNombre= "";
        for (int i=0;i<nombres.length;i++){
            if (i==(nombres.length-1)) { //Ese es solo un, ejemplo
                ultimoNombre = nombres[i];
            }
        }
        System.out.println("\nÚltimo nombre: "+ ultimoNombre);

/***************************************ARRAY BIDIMENSIONAL********************************************************/
        //se declaran igual pero poniendo [FILAS][COLUMNAS][PROFUNDIDAD]Según sus dimensiones.
        System.out.println("\nArrays bidimensionales");
        int arrayBidi[][] = new int [2][4];
        /*Eso sería 2 filas y 4 columnas
                     || || || ||
                     || || || ||
         para crear un array bidimensional inicializándolo en la misma línea, en este caso sería:
         int arrayBidi[][] = {
                { 1, 2, 3, 4}
                { 10, 15, 18, 20}
                };
        */

        //Inicializamos
        arrayBidi[0][0] = 1;  //nombre [fila][columna] = valor
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 15;
        arrayBidi[1][2] = 18;
        arrayBidi[1][3] = 20;


//Para recorrerlo hay que anidar un for dentro de otro donde nº de for es igual al nº de dimensiones:
        for (int x= 0;x < arrayBidi.length; x++){ //arrayBidi.length devuelve el tamaño de la 1º dimensión

            for (int y= 0;y < arrayBidi[x].length; y++){ //arrayBidi.length devuelve tamaño de arrayBidi[x]
                // x es dimensión actual
                System.out.println("Valor de X:" + x);
                System.out.println("Valor de Y:" + y);
                System.out.println("Valor de arrayBidi["+x+"]"+"["+y+"] es: "+ arrayBidi[x][y]);
                //En caso de haber una 3ª dimensión habría que añadir:
                // for (int z= 0;z < arrayBidi[x][y].length; z++){
                //System.out.println("Valor de arrayBidi[" +x+ "]"+"[" +y+ "]" + "["+z+"]"es: "+ arrayBidi[x][y]);
                //}
            }
        }



    }



}
