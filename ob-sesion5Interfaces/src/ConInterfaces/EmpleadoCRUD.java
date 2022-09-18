package ConInterfaces;
//Las interfaces SOLO DECLARAN MÉTODOS, NO LOS IMPLEMENTAN

import SinInterfaces.Empleado; //Importamos la clase empleado que hemos creado antes en el otro paquete(SinInterfaces.

import java.util.List;

/**
 * Actua como un contrato que dice lo que hay que hacer pero no lo hace.
 * Proporciona o dicta, una manera común de hacer las cosas entre todas las clases que implementen esta interfaz
 */
public interface EmpleadoCRUD {
    //Se declaran los métodos, que vamos a implementar las clases

    void save(Empleado empleado); //Declaramos el 1º método

    List<Empleado> findAll();//2º método

    void delete(Empleado empleado);//3º método


}
