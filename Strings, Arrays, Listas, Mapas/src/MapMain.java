//Vamos por Concepros 10.4 Mapas
//https://vimeo.com/623336151/d6acd64c7b

import java.util.HashMap;
import java.util.Map;


public class MapMain {

    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();     //Creamos un mapa: Map<TipoDeIdentificador, TipoDeDatoValor> ...
        // nombre del mapa = new ClaseDeInterfaz (Siempre terminan en MAP) HashMap es uno de los + usados

        //Nos va a permitir un mapa de: identificador (1º String) + Valor (2º String) "solo un identificador y un valor o clase
        //NO PERMITE pasarle 2 valores o más
        personas.put("12345678A", "nombre apellido 1");  //El método put nos permite especificar una clave "única"(1º String)
        personas.put("12345678B", "nombre apellido 2");  // y un paso por Valor (2º String)
        personas.put("12345678C", "nombre apellido 3");
//TAMBIÉN PODRÍAMOS PASAR POR VALOR UNA CLASE EJEMPLO: personas.put("12345678A", new Coche());
// Siempre que al declarar el mapa lo hiciéramos así: Map<String, Coche>...


        //Imprimimos el mapa de personas
        System.out.println("Imprimimos el mapa personas:\n" + personas);
        //no se porque, pero no me los muestra en el orden que le puse

        //Iteramos sobre el mapa:

        //Vamos a imprimir las claves o identificadores (clave o identificador son sinónimos)
        for(String key : personas.keySet()) { //key se refiere al identificador o clave
            System.out.println(key); /*Podemos ver la clave de cada elemento del mapa devuelve:
            12345678B tampoco muestra en el mismo orden
            12345678C
            12345678A*/
        }
        //Vamos a imprimir los valores de cada elemento
        for(String Value : personas.values()){
            System.out.println(Value);  //Tampoco los muestra en el mismo orden
        }

        //Ahora vamos a sacar el par de claves-valor juntos, para eso se usa Entry
        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println("Identificador: " + pair.getKey() + "---Valor: " + pair.getValue());
        }

    }
}
//Preguntamos a @vroman por que ocurre:
//Pte de respuesta