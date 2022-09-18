package ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

//Son una lista de Arrays, a diferencia de un vector no le podemos dar una capacidad xq es automática
// Los arraylist crecen así: AumentarCapacidadArraylist = CapacidadArraylist + (CapacidadArraylist / 2)
public class Main {
    public static void main(String[] args) {
/*************************CREACIÓN E INICIALIZACIÓN ARRAYLIST*************************************************/
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");
        System.out.println("Contenido: "+lista);

/********************************ELIMINAMOS UN ELEMENTO DEL ARRAYLIST*****************************************/
        lista.remove("Elemento B");
        System.out.println("Contenido después de eliminar ElementoB: "+lista);
        lista.add("Elemento D"); //Añadimos un nuevo elemento para seguir probando cosas
/*******************************RECORREMOS EL ARRAYLIST*******************************************************/
        System.out.println("----------------------------------for (int i : lista):-------------------------");
        for (String i : lista){
            System.out.println("Valor actual en el ArrayList: " + i);
        }
        System.out.println("----------------------------------for (int i = 0; i<lista.size(); i++):-----------------");
        for (int i = 0; i<lista.size(); i++){
            System.out.println("Valor actual en el ArrayList: "+lista.get(i));
        }
/********************************CONVERTIMOS lista EN UN ARRAY**************************************************/
        System.out.println("\nConvertimos el ArrayList a un array:");

        String array[] = new String[lista.size()]; //Creamos un array[nº elementos del ArrayList]
        for (int i = 0; i<lista.size(); i++){
            array[i] = lista.get(i); //A los arrays accedemos mediante índice, pero con ArrayList accedemos con su método
            System.out.println("Añadimos a array: "+array[i]);
        }


    }

}
