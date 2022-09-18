package Mapas;

import java.util.HashMap;
import java.util.Map;

//Constituye algo parecido a un diccionario con una clave y un valor para esa clave
//El valor, puede ser otro mapa, o un string, o un array, ...
//Las claves no pueden estar duplicadas
public class Main {
    public static void main(String[] args) {


        HashMap<String, Integer> mapa = new HashMap<>(); //HashMap es solo un tipo de mapa, hay más como
        //TreeMap y varios más, pero cada uno sirve para una cosa

        mapa.put("Abraham", 34); // se parecen a los arrays bidimensionales, pero del que no sabemos cuantas filas hay
        mapa.put("Ana", 35); //pero si que siempre hay una sola columna
        mapa.put("Alberto", 154);

        System.out.println(mapa); //imprimimos todo el mapa

        System.out.println(mapa.get("Ana")); //Esto imprime un valor del mapa

/*************Sobreescribimos**********************************************************/
        mapa.put("Alberto", 25); //sobreescribimos un valor machacándolo
        System.out.println("Alberto ahora tiene: "+ mapa.get("Alberto"));

        mapa.replace("Pepe", 90); //Esto comprueba si existe la clave, y si no existe, la ignora
        System.out.println("Intentamos reemplazar una clave inexistente. Resultado: "+mapa);

        mapa.replace("Ana", 23);
        System.out.println("Ahora reemplazamos lo que tiene Ana" + mapa);

/********************Eliminamos una clave y su valor******************************************/
        mapa.remove("Alberto");
        System.out.println("Ahora hemos eliminado Alberto, Resultado: "+ mapa);

/************************Recorremos un mapa***************************************************/
        for (Map.Entry elemento : mapa.entrySet()) {  //mapa.entrySet nos devuelve cada uno de los elementos 1 a 1
            //Map.Entry es un tipo de dato compuesto
            System.out.println("La clave del elemento es: " + elemento.getKey());
            System.out.println("El valor del elemento es: " + elemento.getValue());
        }

    }
}
