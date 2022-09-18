package com.example;

/**
 * Ejercicio de la sesión 1 (Iniciación Java):
 * Crear un proyecto java desde 0
 * Crear un paquete dentro del proyecto, y dentro de este, crear una clase
 * dentro de la clase crear un método main e imprimir todos los tipos de datos estudiados
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        //Creamos las variables principales y las inicializamos
        byte bait = 5;
        short corto = 6;
        int entero = 8;
        long largo = 123456789;
        double doble = 1525.3d;
        boolean booleano = true;
        float flotante = 10.5f;
        char caracter = 'x';
        String frase = "Hola Mundo";

        //Imprimimos Las variables una a una
        System.out.println("Variable Byte: "+bait);
        System.out.println("Variable Short: "+corto);
        System.out.println("Variable int: "+entero);
        System.out.println("Variable Long: "+largo);
        System.out.println("Variable Float: "+flotante);
        System.out.println("Variable Double: "+doble);
        System.out.println("Variable boolean: "+ booleano);
        System.out.println("Variable char: "+caracter);
        System.out.println("Variable String: "+frase);


    }

}
