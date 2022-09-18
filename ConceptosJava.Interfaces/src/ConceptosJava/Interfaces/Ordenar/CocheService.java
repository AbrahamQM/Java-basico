//(he copiado las clases que había en C:\Users\Abraham\IdeaProjects\Ejercicios
//para poder trabajar sin modificar los ejercicios anteriores)
package ConceptosJava.Interfaces.Ordenar;

import ConceptosJava.Interfaces.CrearClases;

public interface CocheService {
    // Vamos a definir o declarar métodos que una clase normal va a tener que implementar.
    //La interfaz define QUE ES LO QUE HAY QUE HACER
    //y una clase que implemente esa interfaz quien va a definir COMO LO VA A HACER.
    //A partir de una Interfaz, podemos tener múltiples implementaciones de la misma

    public CrearClases CrearCocheDemo(); //A diferencia de los métodos normales, los métodos de interfaz
    //no tienen cuerpo (lo que iría entre las llaves{})

    public void destruirCoche(CrearClases coche);
    //AL DEFINIR CUALQUIER MÉTODO AQUÍ COMO LOS ANTERIORES destruirCoche o CrearCocheDemo, obligamos a las clases que
    //implementan esta interfaz a tener implementados esos métodos o funciones.


}
