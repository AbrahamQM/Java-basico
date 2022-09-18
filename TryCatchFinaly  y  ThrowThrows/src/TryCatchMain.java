//Mecanismos de gestión de excepciones
//Conceptos Sesión 11.1    IMPORTANTE VER LA SESIÓN PARA ENTENDERLO BIEN!!
//https://vimeo.com/623335862/889590b5fb

//try{} catch{} se usa para evitar que el programa se detenga si hay un error por ejemplo dividir 5 entre 0.
// ... Capturando la excepción PARA QUE EL PROGRAMA NO SE DETENGA
//finally{} Se puede poner al final para que se ejecute un código independientemente de si ha habido errores o no



public class TryCatchMain {

    public static void main(String[] args) {

/*      int result = 5 / 0;  Al ejecutarse esto nos mostrará el error en la consola,
      en este caso muestra: "java.lang.ArithmeticException: / by zero" Lo que implica un error Aritmético.
      Lo usaremos para el catch linea 19
*/

        try {       //EN EL try PONEMOS LA/S INSTRUCCIÓN/ES QUE PUEDAN SER PROBLEMÁTICAS
            int result = 5 / 0; //aquí ponemos un ejemplo de excepción o error
            //El error mostraría en la consola si lo ponemos fuera el try y se detendría el programa

        } catch (ArithmeticException e){     //EN EL catch PONEMOS QUE QUEREMOS HACER CON EL ERROR O EXCEPCIÓN
            e.printStackTrace();    //Imprimimos el error por la salida standard
            System.out.println("Error: " + e); //O lo imprimimos de la forma tradicional
        } finally{      //Se ejecutará siempre se suele usar para cerrar recursos: conexiones, borrar archivos, ...
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin");  //Esto no se imprimiría si no hubiéramos capturado el error
    }
}
//En definitiva se usa try catch y finally para capturar los errores y gestionarlos nosotros