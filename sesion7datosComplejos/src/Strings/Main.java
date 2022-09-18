package Strings;

import java.util.Locale;

public class Main {
    public static void main(java.lang.String[] args) {
    //   var cadena = "Mensaje de texto"; //Al usar var, el compilador se encarga de decidir el tipo de variable
        java.lang.String cadena = "Mensaje De Texto";

        //Longitud de la cadena
        int cadenaLen = cadena.length(); //usamos nombreVariableString.lenght(); devuelve nº de caracteres
        System.out.println("La longitud de la cadena es de: "+cadenaLen);

        //Convertimos la cadena
        java.lang.String cadenaMayus = cadena.toUpperCase(); //Convertimos la cadena a mayúsculas y lo guardamos en cadenaMayus
        System.out.println("Cadena en mayúsculas: "+cadenaMayus);

        java.lang.String cadenaMin = cadena.toLowerCase(); //Convertimos cadena a minúsculas y lo guardamos en cadenaMin
        System.out.println("Cadena en minúsculas: "+cadenaMin);

        System.out.println("La cadena original es: "+cadena);

        //Comprobamos cosas de la cadena
        boolean resultado = cadena.startsWith("Men"); //comprobamos si la cadena comienza por ...
        if (resultado) {
            System.out.println("Empieza por Men");
        }else{
            System.out.println("No empieza por Men");
        }

        resultado = cadena.endsWith("asd"); //Asignamos ahora a resultado la comprobación, ¿termina con ...?
        if (resultado) {
            System.out.println("Termina con asd");
        }else{
            System.out.println("No termina con asd");
        }

        //comprobamos el caracter dentro del Strings.Main de una posición determinada
        char letra = cadena.charAt(9); //asignamos a letra, el valor que hay dentro de cadena(posición)

        System.out.println("El caracter de esa posición es: " +letra);


        //RECORRER UNA CADENA DE TEXTO

        for (int i = 0; i<cadena.length(); i++){
            System.out.println("El caracter " + (i+1) +" es: "+ cadena.charAt(i));
        }
        System.out.println("\nAhora a la inversa:");
              //Ahora a la inversa EJERCICIO PROPUESTO POR EL PROFE
        for (int i = cadena.length(); i>0; i--){
            System.out.println("El caracter " + (i) +" es: "+ cadena.charAt(i-1));
        }

    }
}
