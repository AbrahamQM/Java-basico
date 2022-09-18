package SinInterfaces;

//Esta es una clase que trabaja con los objetos Empleado


//Vamos a simular una bbdd que almacene empleados
//CRUD =  (Create, Read, Update, Delete) Crear, leer, actualizar y borrar.

//Importamos estas clases para poder usar un Arraylist

import java.util.ArrayList;
import java.util.List;

public class EmpleadosCRUDv1 {

    //Creamos una estructura de datos (arraylist) se crea como cualquier objeto:
    //se usa <> que significa genérico, permite crear una lista con un tipo de dato diferente cada vez

    private static List<Empleado> empleados = new ArrayList<>(); //La creamos como private, para "Encpsular" el código y asi
    // protegerlo, para que no se pueda acceder a la lista empleados o modificarlos desde fuera de la clase

    //Operaciones CRUD:

    //Create. Método que permita guardar un empleado
    public static void save(Empleado empleado) {

        empleados.add(empleado); //Esto nos permite añadir un objeto empleado
    }

    //Read. A continuación Leemos los empleados

    public List<Empleado> findAll(){

        return empleados;

    }
}
