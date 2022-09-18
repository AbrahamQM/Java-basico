package Repetición;
/**Ejercicio Sesión 3

 En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

 Tened en cuenta que los textos pueden venir de un array de tipo String.

 Por ejemplo: String[] nombres = {"", "", "", ""}*/

public class Ejercicio3Concatenar {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Pepe", "Abraham", "Lucas", "Sofía"};
        String concatenados = ""; //inicializamos en null

        //Ejercicio con for
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
            concatenados += nombres[i];
        }
        System.out.println("\nEl bucle for da el siguiente resultado:\n" + concatenados);
        concatenados = ""; //Inicializamos de nuevo para que no siga sumando en el siguiente ejercicio

        //Ejercicio forEach
        for (String concat : nombres) {
            concatenados += concat;
        }
        System.out.println("\nEl bucle forEach da el siguiente resultado:\n" + concatenados);
        concatenados = ""; //Inicializamos de nuevo para que no siga sumando en el siguiente ejercicio


        //Ejercicio while
        int n = 0; //Iniciamos la variable que usaremos como interruptor
        while (n < nombres.length) {

            concatenados += nombres[n];
            n++;
        }
        System.out.println("\nEl bucle while da el siguiente resultado:\n" + concatenados);
        concatenados = ""; //Inicializamos de nuevo para que no siga sumando en el siguiente ejercicio


        //Ejercicio doWhile
        n = 0; //Reiniciamos la variable que usaremos como interruptor
        do {

            concatenados += nombres[n];
            n++;
        } while (n < nombres.length);
        System.out.println("\nEl bucle Do-While da el siguiente resultado:\n" + concatenados);
        concatenados = ""; //Inicializamos de nuevo para que no siga sumando en el siguiente ejercicio
    }
}
