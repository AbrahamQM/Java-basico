//Sesión Conceptos 10.3 Listas https://vimeo.com/623336300/19f1d3deb6


import java.util.ArrayList;
import java.util.List; //Hay que elegir si nos pregunta el que viene del paquete java.util

//List es una interfaz que nos ofrece una serie de métodos como size (determinar el tamaño de una lista), isEmpty,
// contains (para determinar si existe un elemento en la lista), toArray (Para convertir en un array estático)
//Especialmente add() y remove() que nos permite agregar y borrar elementos

public class ListasMain {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>(); //Con esto creamos una lista dinámica de Strings

        //Agregar elementos con el método add

        //a diferencia de un Array, que tiene tamaño fijo, las listas se pueden ampliar y reducir

        nombres.add("nombre 1");
        nombres.add("nombre 2");
        nombres.add("nombre 3");
        nombres.add("nombre 4");

        //Se pueden imprimir todos de una vez así:
        System.out.println(nombres);

        //tambien se puede iterar con un bucle
        for (String nombre : nombres) {    //(Tipo de datos-identificador : nombre de la estructura de datos o arraylist){}
// (String nombre) va a ser una variable temporal que solo existe dentro del bucle y, que va a tomar el valor
// de dada uno de los valores de la lista
            System.out.println(nombre);
        }

        //Vamos a crear un arrays de objetos o clases Coche.java
        List<Coche> coches = new ArrayList<>();

        //Ahora introducimos objetos coche y definimos la variable nombre "name en Coche.java"

        coches.add(new Coche("Skoda Octavia"));
        coches.add(new Coche("BMW X5"));
        coches.add(new Coche("Skoda fabia"));

  //    System.out.println(coches);     Esto SIN HABER CREADO EL MÉTODO toString en Coches.java ...
  //imprime la referencia en memoria de esos coches. Se puede probar poniéndole /*  */ al método toString en Coche.java

        //Para imprimir el valor name de cada coche generamos un método toString en la clase Coche.java
        System.out.println(coches);

        //Igual que en línea 26, podemos crear un bucle para imprimirlos 1 a 1
        for (Coche coche : coches){
            System.out.println(coche);
        }

    }
}
