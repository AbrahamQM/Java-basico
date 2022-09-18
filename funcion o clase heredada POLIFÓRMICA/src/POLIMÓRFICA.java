//funciones CON HERENCIAS Y POLIFÓRMICAS. Sesion 9
//Función polimórfica (la clase que hereda (Coche), puede modificar la función heredada de (Vehículo)

public class POLIMÓRFICA {


        public static void main(String[] args) {
            Coche coche = new Coche();   //Creamos un objeto coche que hereda de Vehículo

            coche.diHola();         //Función diHola de Coche

            //A continuación Pongo esta definición de objeto y función solo para comprobar qUe la otra también funciona
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.diHola();
        }
}




    class Vehiculo {        //Clase principal

        public void  diHola(){
            System.out.println("Hola sin modificar!!"); //esta no llega a ejecutarse salvo que ...
            // usemos la función Vehiculo.diHola ARRIBA LO HICE PARA COMPROBAR
        }
    }


    class Coche extends Vehiculo {         //Clase que hereda y modifica la función de vehículo.

        public void  diHola(){
            System.out.println("Respuesta modificada con polimorfismo"); //si la eliminamos, pondrá "Hola sin modificar"
        }
}

/*esto se puede hacer también creando versiones diferentes de la función se va a seleccionar
dependiendo del tipo de dato que le pasemos ej:

diHola(float a, float b);
diHola(String 1, String 2);

se usará una u otra dependiendo si la llamo coche.diHola((float)a, (float)b); Ó coche.diHola((String) 1, (String) 2);
 */