package poo.herencias;

import poo.clases.Vehiculo; //En este caso se puso automático, pero si no lo hiciera es necesario importar las clases
// del otro paquete. SOLO SE PUEDE HEREDAR DE UNA CLASE CADA VEZ

public class Camion extends Vehiculo {

    //Atributos
    int capacidad;//Vamos declarando atributos específicos de esa clase. Son aparte de los que tenga la clase Vehiculo

    //constructor
    public Camion(){
        this.fabricante = ""; //Para poder acceder a ese atributo, hay que determinar en el atributo clase (Vehículo.fabricante)...
                              //... si es protegido "protected" o público "public"
    }

}
