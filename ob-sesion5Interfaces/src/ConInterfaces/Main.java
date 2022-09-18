package ConInterfaces;

import SinInterfaces.Empleado; //Usamos esa clase en línea 29 y demás que usen algún objeto del tipo Empleado

/**
 * Java básico Sesión 5 min33
 *Explicación de como trabajar con interfaces
 * que son como un contrato que especifica las cosas que hay que hacer. El Main va a usar todo el contenido
 * de la interfaz(atributos, métodos), pero en la interfaz sólo se especifica que funcionesvan a haber y,
 * después en las clases vamos a implementar esos métodos de diferentes formas. De manera que se puedan crear
 * diferentes clases, con diferentes modos de ejecutar(diferentes Implementaciones) lo que dicta la interfaz.
 * Y podamos cambiar de clase (o sea de forma de implementarlo) sin tener que tocar el código en el Main
 */


public class Main {

/*    Creamos un atributo de tipo EmpleadoCRUD
    EmpleadoCRUD empleadoCRUD;
pero después al usarlo da un error y nos obliga a crearlo como static de la siguiente manera: */

    //static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL(); SIMPLEMENTE SELECCIONANDO UNA CLASE U OTRA, CAMBIARÍAMOS
    // POR COMPLETO LA FORMA DE TRABAJAR
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel(); //Lin30
    //Creamos un atributo de tipo EmpleadoCRUD


    public static void main(String[] args) {

        empleadoCRUD.findAll(); //Al usar el atributo LIN 19, nos pide que empleadoCRUD sea static
        empleadoCRUD.save(new Empleado()); //Hay que importar la Clase Empleado

    }
}
