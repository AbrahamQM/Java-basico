package poo.herencias;

import poo.clases.Motor;
import poo.clases.Vehiculo; //En este caso se puso automático, pero si no lo hiciera es necesario importar las clases
// del otro paquete. SOLO SE PUEDE HEREDAR DE UNA CLASE CADA VEZ

public class Motocicleta extends Vehiculo {

    public boolean baul;//Vamos declarando atributos específicos de esa clase. Son aparte de los que tenga la clase Vehiculo
    //Especificamos public para que pueda ser accesible desde el main sin el método "super" lina 19

    //Constructor vacío
    public Motocicleta() {
    }

    //Constructor con todos los parámetros
    public Motocicleta(String modelo, String fabricante, double cc, int year, boolean sport,
                       int velocidad, Motor motor, boolean baul) {
        super(modelo, fabricante, cc, year, sport, velocidad, motor); //super se generó automáticamente al generar el ...
        this.baul = baul; // constructor con clickDcho-Generate-Constructor cuando estamos dentro de una clase heredada de otra.
        //permite elegir: cuál constructor de la clase superior queremos usar y, pone el método Super Class Constructor.
        //Lo que hace es permitir a la clase Hija, crear un objeto de la clase superior con todos los atributos y métodos.
    }

}
