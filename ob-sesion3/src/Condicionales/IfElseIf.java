package Condicionales;

public class IfElseIf {
    public static void main(String[] args) {
        String dia = "Martes";
        //ejemplos de comparación
        boolean resultadoCompararNum = 5==5; //Para comparar datos no String ==
        boolean resultado = dia.equals("Martes"); //Con los datos String == no es recomendable
                                                  // es mejor usar equals o notequals.


        //if else if

        if(dia.equals ("Lunes")){   //Primera comprobación
            System.out.println("Hoy es lunes");

        } else if(dia.equals ("Martes")) {  //Segunda y sucesivas comparaciones
            System.out.println("Hoy es Martes");

        }else if(dia.equals ("Miércoles")) {
            System.out.println("Hoy es Miércoles");

        }else if(dia.equals ("Jueves")) {
            System.out.println("Hoy es Jueves");

        }else if(dia.equals ("Viernes")) {
            System.out.println("Hoy es Viernes!!");

        }else if(dia.equals ("Sábado")) {
            System.out.println("Hoy es Sábado");

        }else if(dia.equals ("Domingo")) {
            System.out.println("Hoy es Domingo");

        } else {        // Ponemos solo else para cuando queremos hacer lo que sea,
            // pero que no cumple ninguna cierta ninguna de las comprobaciones anteriores.
            System.out.println("Dia no válido");
        }
    }

}
