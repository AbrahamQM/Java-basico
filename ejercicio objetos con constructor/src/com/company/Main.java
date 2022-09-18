package com.company;

public class Main {

    public static void main (String[] args) {
        TipoDeobjeto coche = new TipoDeobjeto();
        System.out.print("Numero de puertas: ");
        System.out.println (coche.numeroDePuertas);

        System.out.print ("Velocidad máxima del coche: ");
        System.out.println (coche.velocidadMaxima);

        System.out.print("Velocidad inicial: ");
        System.out.println(coche.velocidadActual);

        coche.acelerar();
        System.out.print("Velocidad después de acelerar: ");
        System.out.println(coche.velocidadActual);

        coche.decelerar();
        System.out.print("Velocidad despues de decelerar: ");
        System.out.println(coche.velocidadActual);


    }
}

class TipoDeobjeto {
    int numeroDePuertas;
    int velocidadMaxima;
    int velocidadActual;

    public TipoDeobjeto() {
        velocidadMaxima = 120;
        numeroDePuertas = 5;
        System.out.println ("Estoy en el constructor");
    }

    public void acelerar() {
        velocidadActual +=15;
    }
    public void decelerar() {
        velocidadActual -=5;
    }


}