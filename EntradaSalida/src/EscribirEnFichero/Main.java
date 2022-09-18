package EscribirEnFichero;

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args)  {
/*******************vamos a usar PrintStream que es la clase de la que deriva el "sout"*****************/
//Siempre hay que hacerle un tryCatch o dará error
        try {
            PrintStream info = new PrintStream("ORIGINAL.txt");    //Eso crea un archivo ORIGINAL.txt
            info.println("Vamos a introducir este texto en ORIGINAL.txt"); //Esto escribe en el archivo ORIGINAL.txt

        } catch(FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            }
        //COPIAR UN FICHERO EN OTRO
        try {
            InputStream in = new FileInputStream("ORIGINAL.txt"); //Eso accede a ORIGINAL.txt i se lo asigna a in

            PrintStream out = new PrintStream("Copia.txt"); //Esto crea el fichero copia.txt de clase PrintStream
            byte[] datos = in.readAllBytes();   //Esto lee todos los datos de ORIGINAL.txt
            in.close(); //Ponemos esto para cerrar el fichero ORIGINAL.txt
            out.write(datos);   //Esto escribe en copia el contenido de datos
            out.close();//Ponemos esto para cerrar el fichero Copia.txt

        }catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
