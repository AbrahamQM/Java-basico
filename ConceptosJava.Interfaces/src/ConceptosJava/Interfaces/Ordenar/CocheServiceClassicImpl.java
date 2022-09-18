//(he copiado las clases que había en C:\Users\Abraham\IdeaProjects\Ejercicios
//para poder trabajar sin modificar los ejercicios anteriores)
package ConceptosJava.Interfaces.Ordenar;

import ConceptosJava.Interfaces.ClaseHeredadaDeCrearClases;
import ConceptosJava.Interfaces.CrearClases;
import ConceptosJava.Interfaces.Ordenar.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public CrearClases CrearCocheDemo() {
        System.out.println("Creando Coche Clásico");
        return new ClaseHeredadaDeCrearClases();
    }

    @Override
    public void destruirCoche(CrearClases coche) {
        System.out.println("Destruyendo coche Clásico");    //Aqui podríamos hacer cualquier tipo de operación con
        // los coches de cada clase que hemos creado en InterfacesMain
    }


}
