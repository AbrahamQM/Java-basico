package SinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosCRUDv2 {

    private static List<Empleado> empleados= new ArrayList<>();
    public static void save(Empleado empleado) {

        empleados.add(empleado); //Esto nos permite añadir un objeto empleado
    }

    public static List<Empleado> recuperarEmpleados(){
        //Suponemos que el siguiente código, conecta con una bbdd aunque vamos a trabajar con un ArrayList
       // List<Empleado> empleados = new ArrayList<Empleado>();
        return empleados;

    }




}
