import java.util.Locale;
//Vamos por Conceptos 10.1 Métodos de la clase String
//https://vimeo.com/623336940/72c7bee123
public class StringMain {
    public static void main(String[] args) {
        
        // La Clase String
        
        /* OPERACIONES:
        length()
        starsWith("")
        endsWith("")
        indexOf("")
        subString(1,5)
        trim()
        equals()
        compareTo()
         */
        String mensaje = "  Hola mundo  ";

        System.out.println("El String es:\n" + mensaje );

        //FUNCIONES O MÉTODOS DE STRING.
        // Podemos ver cada función, en este caso poniendo "mensaje." aparecerá un listado de las funciones
        //Si seleccionamos una de las funciones o métodos y ponemos el ratón encima, nos explicará que hace cada función.
        System.out.println("El String tiene: " + mensaje.length() + " Caracteres");


        String mensajeMAY = mensaje.toUpperCase();  //Creamos variable mensajeMay que va a recibir el
        // String convertido a mayúsculas.
        System.out.println("Función String en mayúsculas: " + mensajeMAY);

        System.out.println("Eliminando los espacios al principio y final con trim:\n" + mensajeMAY.trim());
        //Esta función elimina los espacios vacíos al principio y final del String. Muestra el resultado porque
        //es lo que le ordenamos con el sout, pero no lo modifica en mensajeMAY

        mensajeMAY = mensajeMAY.trim(); //Esta SI modifica el String en mensajeMAY

        System.out.println("Ahora el string tiene: " + mensajeMAY.length() + "caracteres");

        //Creamos otro String para compararlos
        String mensaje2 = "HOLA MUNDO";

        if (mensajeMAY.equals(mensaje2)){
            System.out.println("mensajeMAY("+mensajeMAY+") es igual a mensaje2("+mensaje2+")");
        } else  {
            System.out.println("mensajeMAY y mensaje2 no son iguales");
        }

        if (mensaje.equals(mensaje2)){
            System.out.println("mensaje y mensaje2 Son iguales");
        }else{
            System.out.println("mensaje("+mensaje+") y mensaje2("+ mensaje2 +") No son iguales");
        }


    }
}
