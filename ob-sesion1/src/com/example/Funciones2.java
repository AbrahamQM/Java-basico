package com.example;

public class Funciones2 {
    public static int main(String[] args) {
        int resultado1 = suma(50, 100);
        return resultado1;
    }
    static int suma(int num1, int num2) {
        System.out.println("\nEstamos dentro de la función suma, que se encuentra en otra clase llamada Funciones2");
        return num1+num2;
    }

}
