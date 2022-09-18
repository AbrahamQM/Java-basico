package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Imprimible> objetos = new ArrayList<Imprimible>();

        Animal caballo = new Animal();
        Edificio guggenhaim = new Edificio();
        Vehiculo x5 = new Vehiculo();

        //OJO HAT QUE AÑADIR AL ARRAY objetos, CADA UNO DE LOS OBJETOS QUE HEMOS CREADO.
        objetos.add(caballo);
        objetos.add(guggenhaim);
        objetos.add(x5);

        for (Imprimible objeto : objetos){  //Para cada uno de los elementos "objetos" de (variable temporal de tipo
            // Imprimible objeto) hacer{}
            objeto.imprimir();

        }

    }
}
