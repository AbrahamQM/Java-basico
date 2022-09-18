/* Sesión 11.2 throw throws
https://player.vimeo.com/video/623335295?h=c5589adfaf
En este caso, el profe @alansastre tiene varias clases creadas que intento copiar en la medida de lo posible.
pero falta una clase llamada StringMain que nunca la llega a mostrar.

LO IMPORTANTE ES LEER LAS EXPLICACIONES DE throw y throws entre barras"//"

Usaremos Throw y throws para captar diferentes tipos excepciones y, llamar a métodos específicos
creados en clases hijas, para ejecutarse (dependiendo del tipo de excepción un método u otro)
manipulando el error o solicitando el dato nuevamente para resolverlo y poder seguir ejecutando el programa
*/


import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {


        try {       //Aqui capturamos y gestionamos los posibles errores
            leerNombres();
        }catch (NameFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que lee los nombres de consola y verifica que tegan longitud >= que 8 caracteres
     * @throws NameFormatException
     */

    private static void leerNombres() throws NameFormatException { //throws "con S" es la asignatura del método
        // para indicar que lanza una excepción
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.lenght() < 8){
                teclado.close();
                throw new NameFormatException("El nombre debe contener 8 caracteres mínimo");
                //La palabra throw "Sin S" se usa para crear la excepción y lanzarla
                // creando un objeto en este caso NameFormatException

            }
        }
        teclado.close();
    }
}
