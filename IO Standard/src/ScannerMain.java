
/* Conceptos java Sesión 12 IO standard "Leer e imprimir de datos en terminal"
https://vimeo.com/623335031/159193e510
Vamos a ver los métodos de la clase System
 */


import java.util.Scanner; //Se importa la librería automáticamente al llamar al método Scanner

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creamos el objeto scanner(entrada al sistema)
        System.out.println("Introduce un nombre:"); //Pedimos un nombre
        String nombre = scanner.nextLine(); //El programa se queda esperando a que lo introduzcamos y
        // lo asigna a la variable nombre

        System.out.println("Introduce un número:"); //Lo mismo que en lineas 15 y 16 pero con un número
        int numero = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre); //  Imprime una nueva línea con el siguiente texto
        System.out.println("El número introducido es: " + numero);
    }

}
//también se podría leer archivos y escribir datos en archivos