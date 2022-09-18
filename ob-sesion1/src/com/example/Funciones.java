package com.example;

import java.util.Scanner;

import static com.example.Funciones2.suma; //Esta es la linea que se genera automáticamente al llamar a una función
// que se encuentra en otra clase.
//Se creó en la línea 38 al invocar suma (mostraba error y nos daba la opción de:
// "import static method com.example.Funciones2.suma"

public class Funciones {
    public static void main(String[] args) {

        //Creamos una función (Siempre fuera del main)

        //Opción1 Función sin parámetros ni retorno
        showMenu();
        //showMenu(); Invocamos a la función tantas veces como queramos.

        //Opción 2 Función que devuelve un resultado
        System.out.println(getMenu()); //invocamos la función desde un sout para imprimir el resultado

        String resultado = getMenu();   //Esto sería lo mismo que la anterior pero creamos una variable (resultado)
        System.out.println(resultado);  //y le asignamos lo que nos devuelve la función para después imprimirlo

        //Otro ejemplo de función que devuelve un resultado
        double price = getPrice();
        System.out.println("Precio devuelto por getPrice: " + price +'€');

        //Opción 3 Función con parámetros y SIN retorno
        imprimirSaludo("Abraham");

        //Opción 4 Función con parámetros y retorno
        String nombre = "Ana María";
        String apellidos = "Medina Santana";
        String saludo = obtenerSaludo(nombre, apellidos);
        System.out.println(saludo);

        //Otro ejemplo de Función con parámetros y retorno pero lo vamos a colocar en otra clase llamada Funciones2.java
        int resultadoSuma = suma(50, 200);
        System.out.println("El resultado de la funcion suma es: " + resultadoSuma);
    }


    static String obtenerSaludo(String nombre, String apellido) {   //Dentro de la función, los parámetros se podrían
        // llamar de cualquier manera AUNQUE NO COINCIDA CON EL NOMBRE DE LAS VARIABLES QUE LE PASAMOS en línea 30
        //Ejemplo: static String obtenerSaludo(String name, String surname){sentencias de la función}
        System.out.println("\nEstamos dentro de la función obtenerSaludo");
        return "Buenas tardes " + nombre + " " + apellido;

    }

    static void imprimirSaludo(String nombre) {
         System.out.println("\nEstamos dentro de imprimirSaludo\n Hola " + nombre);
    }

    static double getPrice() {
        System.out.println("\nEstamos dentro de getPrice");
        return 100.99;
    }

    //La funcion tiene que ser static porque está dentro de otra función static
    static void showMenu(){     //Función que muestra un menú
        System.out.println("\nEstamos dentro de showMenu.");
        System.out.println("Menú de E-Comerce Zapatillas");
        System.out.println("1. Ver zaparillas");
        System.out.println("2. Comprar zapatillas");
        System.out.println("3. Salir");
    }
    static String getMenu(){      //Función que obtiene la elección

        System.out.println("\nEstamos dentro de getMenu.");
        return ("Esto es lo que devuelve la función getMenu.");
    }

}
