//(he copiado las clases que había en C:\Users\Abraham\IdeaProjects\Ejercicios
//para poder trabajar sin modificar los ejercicios anteriores)

package ConceptosJava.Interfaces.Ordenar;

import ConceptosJava.Interfaces.CrearClases;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService servicio1 = new CocheServiceClassicImpl();
        CocheService servicio2 = new CocheServiceSportImpl();

        CrearClases coche1 = servicio1.CrearCocheDemo();


        CrearClases coche2 = servicio2.CrearCocheDemo();

        servicio1.destruirCoche(coche1);
        servicio2.destruirCoche(coche2);
    }
}
