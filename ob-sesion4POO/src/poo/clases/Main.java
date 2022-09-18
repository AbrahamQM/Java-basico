package poo.clases;

import poo.herencias.Camion;
import poo.herencias.Coche;
import poo.herencias.Motocicleta;

public class Main {
    public static void main(String[] args) {

        //Creamos un objeto Vehiculo con el siguiente formato Clase identificador = new clase();

        //Creamos un objeto con el constructor sin parámetros
        Vehiculo toyotaPrius = new Vehiculo();   //Si nos colocamos entre() y presionamos Ctrl+P, nos muestra las ...
        // posibilidades de parámetros según los constructores que hayamos creado en las clases


        //Creamos otro objeto con el constructor con parámetros
        Motor motorGTI= new Motor(190, 150.32, 8, "ModeloMotor: H54p"); //Creamos un objeto de la clase heredada de vehículo Motor para poder crear el forMondeo
        Vehiculo fordMondeo = new Vehiculo("Mondeo", "Ford", 2.1, 2010, false, 0, motorGTI);

        //Vamos a ir accediendo a las variables del objeto poniendo nombreObjeto.atributo
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.motor.caballos);  //Así accedemos a un atributo de la clase motor del fordMondeo

        System.out.println("Velocidad actual(Ants de acelerar): "+fordMondeo.velocidad);

        //Vamos a acceder a un método de la clase Vehículo
        fordMondeo.acelerar(50);
        System.out.println("Velocidad después de acelerar: "+fordMondeo.velocidad);


        //ESTO QUE CONTINÚA,  ESTÁ RELACIONADO CON herencias !!!!!!!!

        //Creamos objeto Motocicleta suzukiGSR
        Motocicleta suzukiGSR = new Motocicleta();
        suzukiGSR.fabricante = "Suzuki";
        suzukiGSR.velocidad = 225;
        suzukiGSR.cc = 599.6;
        suzukiGSR.baul = false;
        suzukiGSR.modelo = "GSR 600";




        // PARA USAR UN OBJETO Motocicleta pasándoles todos los parámetros, también un objeto Motor.
        //Creamos un motor H2R para la kawasakiNinja que crearemos a continuación
        Motor motorH2R = new Motor(225, 208.69, 4, "H2R Turbo");
        //Creamos la kawasakiNinja
        Motocicleta kawasakiNinja = new Motocicleta("Ninja", "Kawasaki", 1000,
                2020, true, 0, motorH2R, false);
        kawasakiNinja.fabricante = "Kawasaki"; //Así se accede al fabricante de la motocicleta que está en la ...
        // clase padre Vehiculo, le vamos a modificar el fabricante, aunque le pongamos uno igual al de antes.

        //Ejemplo de como acceder a los atributos dentro de un objeto (Motocicleta)que hereda de (Vehículo)"Clase padre
        // que a su vez tiene un objeto Motor
        System.out.println("La "+ kawasakiNinja.fabricante + " " +kawasakiNinja.modelo+ " tiene: "
                + kawasakiNinja.motor.caballos+" caballos");

        //POLIMORFISMO
        //Crear un objeto que pueda tener múltiples formas
        Vehiculo vehiculo; //Declaramos un objeto vehículo, sin inicializarlo

        //Hacemos que el vehículo sea de las 3 clases a la vez (Moto, Coche, Camión) y usamos un método (acelerar)
        vehiculo = new Motocicleta();   //inicializamos un objeto vehículo creándolo con la clase Motocicleta
        vehiculo.acelerar(50);

        vehiculo = new Camion();   //inicializamos un objeto vehículo creándolo con la clase Motocicleta
        vehiculo.acelerar(50);

        vehiculo = new Coche();   //inicializamos un objeto vehículo creándolo con la clase Motocicleta
        vehiculo.acelerar(50);

        //CONCEPTO: clases abstractas:
        //CLASES ABSTRACTAS NO SE PUEDEN INSTANCIAR. SOLO SE INSTANCIAN LAS CLASES HIJAS.
        //por ej: si Vehiculo se hubiera declarado abstracto: public abstract class Vehiculo {} (Vehículo.java linea 4)
        //De esta forma, solo se podían instanciar clases hijas, líneas 49 en adelante.
        //La línea 19 es de la clase padre y daría error.

        //CONCEPTO: Programación genérica:
        //Consiste en crear clases y funciones que permitan trabajar con varios tipos de datos a la vez, es una especie
        //sobrecarga que permita instanciar un objeto pasándole diferentes tipos de datos cada vez

    }
}
