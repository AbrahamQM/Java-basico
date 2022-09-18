package LeerDesdeFichero;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
/***Vamos a leer TODO el fichero con readAllBytes() pero no puede ser algo muy grande o llenaremos la memoria lin 14 */
        System.out.println("Vamos a leer todo el archivo con fichero.readAllBytes(): ");
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Abraham\\IdeaProjects\\FicheroPruebasAcceso.txt");
            //FileInputStream(Fichero) es para decirle desde que fichero trabajar
            try{
                byte[] datos = fichero.readAllBytes(); //readAllBytes() lee TODO el contenido del fichero y devuelve bytes
                for (byte dato : datos){
                    System.out.print((char) dato); //obligamos a que imprima los bytes como char
                }
            }catch (java.io.IOException e){
                System.out.println("No puedo leer el fichero: " +e.getMessage());
            }
        }catch (java.io.FileNotFoundException e){
            System.out.println("Error de archivo: " +e.getMessage());
        }

/******************* Ahora vamos a leer el fichero caracter a caracter con read() lin 33************************************/
//se usa read() cuando se trata de archivos que sean muy grandes para no sobrecargar la memoria
        System.out.println("\n\nVamos a leer caracter a caracter el archivo con fichero.read(): ");
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Abraham\\IdeaProjects\\FicheroPruebasAcceso.txt");
            //FileInputStream(Fichero) es para decirle desde que fichero trabajar
            try{
                int dato = fichero.read(); //fichero.read() lee cada caracter
                while (dato != -1){ //No permite usar for con enteros así que usamos un while: mientras dato no sea -1...
                    //Cuando el fichero se termina, devuelve -1 "EOF" End Of File
                    System.out.print((char) dato); //obligamos a que imprima los bytes como char convirtiéndolo a caracter
                    dato = fichero.read(); //Actualizamos dato para que vaya avanzando
                }
            }catch (java.io.IOException e){
                System.out.println("No puedo leer el fichero: " +e.getMessage());
            }
        }catch (java.io.FileNotFoundException e){
            System.out.println("Error de archivo: " +e.getMessage());
        }

/*****************************************Ahora vamos a leer el fichero de X bytes en X bytes ****************/
        System.out.println("\n\nVamos a leer de 5 en 5 caracteres el archivo con fichero.read(array[5]): ");
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Abraham\\IdeaProjects\\FicheroPruebasAcceso.txt");
            //FileInputStream(Fichero) es para decirle desde que fichero trabajar
            try{
                byte datos[] = new byte[5]; //Aqui creamos el array de bytes de 5 elementos
                int dato = fichero.read(datos); //fichero.read() ahora los guarda en datos de 5 en 5
                while (dato != -1){
                    System.out.print(datos); //obligamos a que imprima los int como char convirtiéndolo a caracter
                    dato = fichero.read(datos); //Actualizamos dato para que vaya avanzando
                }
            }catch (java.io.IOException e){
                System.out.println("No puedo leer el fichero: " +e.getMessage());
            }
        }catch (java.io.FileNotFoundException e){
            System.out.println("Error de archivo: " +e.getMessage());
        }
        System.out.println("\nPodemos ignorar este método, por ahora mal explicado");
/**^^^^Êso devuelve números enteros-MAL GESTIONADO EL DATO---pero el profesor no explicó bien como solucionarlo^^^^^^^^^^**/


/*********************Ahora vamos a trabajar con un buffer BufferedInputStream para cargar los datos*************************/

        System.out.println("\n\nVamos a leer todo el archivo  al buffer con BufferedInputStream : ");
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Abraham\\IdeaProjects\\FicheroPruebasAcceso.txt");
            //FileInputStream(Fichero) es para decirle desde que fichero trabajar
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero); //Carga el fichero en el buffer
            //"Por debajo" eso leerá trozos grandes del archivo y devolverá trozos pequeños
            try{
                int dato = ficheroBuffer.read(); //read() lee el contenido del fichero y devuelve bytes
                while (dato != -1){
                    System.out.print((char) dato); //obligamos a que imprima los bytes como char
                    dato = ficheroBuffer.read();
                }
            }catch (java.io.IOException e){
                System.out.println("No puedo leer el fichero: " +e.getMessage());
            }
        }catch (java.io.FileNotFoundException e){
            System.out.println("Error de archivo: " +e.getMessage());
        }
    }

}


