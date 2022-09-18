package Vectores;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Vector; //Hay que importar la clase java....Vector

//Los vectores se ajustan automáticamente a los datos que tenemos
//Cuando aumentamos los elementos del vector por encima de su capacidad, aumenta asi:
// Los vectores crecen así: CapacidadVectorAumentada = CapacidadVector * 2
// salvo que le indiquemos otro aumento diferente Lin 46
public class Main {
    public static void main(String[] args) {
       Vector<Integer> vector = new Vector();//declaramos un vector
/****************************Asignarle valores al vector**************************************************************/
//OJO, NO SE PUEDE HACER COMO EN LOS ARRAYS nombreVector[0] = 25; >>>>>>ESTA MAL<<<<<<<
//Se haría así: nombreVector.add(valor del mismo tipo de dato que el vector);
        vector.add(5);
        vector.add(8);
        vector.add(0);
        System.out.println("Datos del vector: "+ vector);
/*****************************ELIMINAR DATOS EN EL VECTOR************************************************************/
//para eliminar usaríamos nombreVector.remove(puntero hacia el valor que queremos eliminar);
        vector.remove(2); //OJO COMO SIEMPRE SE EMPIEZA POR 0 EL ÍNDICE
        System.out.println("Datos del vector: "+ vector);

/***********************************TAMAÑO Y CAPACIDAD DEL VECTOR***************************************************/
       vector.add(0); //Hacemos esto solo para que vuelva a tener 3 elementos con los que jugar
//COMPROBAMOS EL TAMAÑO Y LA CAPACIDAD DEL VECTOR con size y capacity
        System.out.println("Recuperamos los elementos del vector para hacer mas ejercicios.\nDatos del vector: "+ vector);
        System.out.println("\nVector de tamaño: " +vector.size()); //Cantidad de elementos asignados
        System.out.println("Vector con capacidad: " +vector.capacity()); //tamaño del array subyacente son 10, 20, 40,80..
//añadimos varios elementos más para comprobar la capacidad y el tamaño
        vector.add(18);
        vector.add(18);
        vector.add(20);
        vector.add(20);
        vector.add(20);
        vector.add(5);
        vector.add(5);
        vector.add(5);
        vector.add(5);

        System.out.println("\nVector de tamaño: " +vector.size());
        System.out.println("Vector con capacidad: " +vector.capacity());
/***************************************CREAMOS UN VECTOR INDICANDO LA CAPACIDAD INICIAL*****************************/
        Vector<Integer> vector2 = new Vector(2, 15);//(capacidad inicial, capacidad de aumento);
        System.out.println("\nVector 2 de tamaño: " +vector2.size());
        System.out.println("Vector 2 con capacidad: " +vector2.capacity());
        //ahora rellenamos el vector para ver como aumenta la capacidad, en relación a lo que le hemos indicado. (15)
        vector2.add(2);
        vector2.add(8);
        vector2.add(5);
        System.out.println("\nAñadimos más elementos al para comprobar como aumenta su capacidad" +
                " añadiendo a la que ya había lo que le hemos indicado ente ().\nVector 2 de tamaño: " +vector2.size());
        System.out.println("Vector 2 con capacidad: " +vector2.capacity());

/*********************************************COMPARAR VECTORES****************************************************/
        boolean resultado = vector.equals(vector2); //asignamos a resultado la respuesta vectorA.equals(vectorB);
        System.out.println("¿son iguales vector y vector2?\n"+resultado);
        //ahora creamos otro vector igual para comprobar si lo es
        Vector<Integer> vector3 = new Vector(3);
        vector3.add(2);
        vector3.add(8);
        vector3.add(5);
        resultado = vector2.equals(vector3);
        System.out.println("¿son iguales vector2 y vector3?\n"+resultado);

/********************************RECORRER UN VECTOR**************************************************************/
        System.out.println("----------------------------------for (int i : vector2):-------------------------");
        for (int i : vector2){
            System.out.println("Valor actual en el vector: " + i);
        }
        System.out.println("----------------------------------for (int i = 0; i<vector2.size(); i++):-----------------");
        for (int i = 0; i<vector2.size(); i++){
            System.out.println("Valor actual en el vector: "+vector2.get(i));
        }
/******************************HACER QUE UN VECTOR DECREZCA O AJUSTARLO********************************************/
        System.out.println("\nAntes de trimToSize()");
        System.out.println("Vector 2 de tamaño: " +vector2.size());
        System.out.println("Vector 2 con capacidad: " +vector2.capacity());
//ahora vamos a usar la función trimToSize(); para ajustar la capacidad del vector hasta EL TAMAÑO DE SUS ELEMENTOS
        vector2.trimToSize();
        System.out.println("\nDespués de trimToSize()");
        System.out.println("Vector 2 de tamaño: " +vector2.size());
        System.out.println("Vector 2 con capacidad: " +vector2.capacity());

    }
}
