/**
 * Sobrecarga permite duplicar una función siempre y cuando cambiemos el nº o tipo de parámetros
 * Sobrecarga es cuando invocamos una función pero cambiando el los parámetros
 */

package com.example;

public class Sobrecarga {
    public static void main(String[] args) {


    }

   //Esto sería la función suma con dos variantes que tienen distintos parámetros

    static int suma(int num1, int num2) {
        System.out.println("\nEstamos dentro de la función suma, que se encuentra en otra clase llamada Funciones2");
        return num1 + num2;
    }
    static int suma(int num1, int num2, int num3) {     //En esta modificamos el nº de parámetros
        System.out.println("\nEstamos dentro de la función suma, que se encuentra en otra clase llamada Funciones2");
        return num1 + num2 + num3;
    }
    static double suma(double num1, double num2) {     //En esta modificamos el tipo de parámetros
        System.out.println("\nEstamos dentro de la función suma, que se encuentra en otra clase llamada Funciones2");
        return num1 + num2;
    }
}
