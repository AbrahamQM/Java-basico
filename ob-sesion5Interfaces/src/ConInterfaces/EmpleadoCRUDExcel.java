package ConInterfaces;
//Esta sería una clase que suponemos trabajaría sobre un excel con los objetos Empleado
import SinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDExcel implements EmpleadoCRUD{/*Si solo pusiéramos esta línea, daria un error porque no hemos
Implementado lo que pone en la interface EmpleadoCRUD. (no estaríamos cumpliendo el contrato)
 Para implementar lo que dice la interfaz, podemos poner el ratón sobre el error y darle a Implement Methods
*/
    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
