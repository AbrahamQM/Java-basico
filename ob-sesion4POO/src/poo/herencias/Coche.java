package poo.herencias;

import poo.clases.Vehiculo; //En este caso se puso automático, pero si no lo hiciera es necesario importar las clases
// del otro paquete. SOLO SE PUEDE HEREDAR DE UNA CLASE CADA VEZ

public class Coche extends Vehiculo {

    int numPuertas;  //Vamos declarando atributos específicos de esa clase. Son aparte de los que tenga la clase Vehiculo
}
