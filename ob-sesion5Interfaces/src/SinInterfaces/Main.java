package SinInterfaces;
/**
 * Java básico Sesión 5
 * En este paquete ponemos un ejemplo de cómo sería la funcion, clases, ... sin interfaces, para ver las
 * diferencias con el paquete ConInterfaces
 */

//Una interfaz es un tipo especial que sirve para proveer de abstracción,
//hace que un código que depende de otro, no esté acoplado.

import java.util.List; //para la línea 33

public class Main {

    public static void main(String[] args) {

/*     Lo comentamos para usar EmpleadosCRUDv2 suponiendo que es una versión mejorada de EmpleadosCRUDv1
        //Usando V1:
        //Creamos un objeto de la clase empleadosCRUD

        EmpleadosCRUDv1 empleadoCRUD = new EmpleadosCRUDv1();

        //Creamos objetos de clase Empleado con sus atributos
        Empleado juanito = new Empleado("Juan Hernández", 34, 35000, true);
        Empleado patricia = new Empleado("Patricia Gutierrez", 38, 55000, true);
        Empleado roberto = new Empleado("Roberto Montes", 26, 25000, false);

        //Luego insertamos los empleados en el array: Lo guardamos usando el método "save" creado en EmpleadosCRUDv1
        EmpleadosCRUDv1.save(juanito);
        EmpleadosCRUDv1.save(patricia);
        EmpleadosCRUDv1.save(roberto);


        //consultar empleados y meterlos en un arraylist
        List<Empleado> empleados = empleadoCRUD.findAll(); //Creamos un Arraylist que se va a llamar empleados
        //Empleados es una variable que va a cargar todos los empleados que hemos creado.
        //Se puede comprobar depurándolo, veremos dos listas de empleados una creada en EmpleadosCRUDv1 y otra aquí en Main
        //que no va a modificar la lista privada que creamos en EmpleadosCRUDv1 Lin 19.
        System.out.println(empleados);
*/
        //Usando V2

        EmpleadosCRUDv2 empleadoCRUDv2 = new EmpleadosCRUDv2();

        //Creamos objetos de clase Empleado con sus atributos
        Empleado juanito = new Empleado("Juan Hernández", 34, 35000, true);
        Empleado patricia = new Empleado("Patricia Gutierrez", 38, 55000, true);
        Empleado roberto = new Empleado("Roberto Montes", 26, 25000, false);

       EmpleadosCRUDv2.save (juanito);
       EmpleadosCRUDv2.save (patricia);
       EmpleadosCRUDv2.save (roberto);

        //consultar empleados y meterlos en un arraylist
        List<Empleado> empleados = EmpleadosCRUDv2.recuperarEmpleados(); //Creamos un Arraylist que se va a llamar empleados
        //Empleados es una variable que va a cargar todos los empleados que hemos creado.
        //Se puede comprobar depurándolo, veremos dos listas de empleados una creada en EmpleadosCRUDv1 y otra aquí en Main
        //que no va a modificar la lista privada que creamos en EmpleadosCRUDv1 Lin 19.
        System.out.println(empleados);
    }
}
