package TryCatchFinally;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 2 números: ");
/*
        int valor1 = scanner.nextInt(); //Si alguno de los valores no es int, daría error en tiempo de ejecución
        int valor2 = scanner.nextInt();

        int resultado = valor1 / valor2; //Si alguno fuera 0, daría un error

        System.out.println("El resultado es: "+resultado);
*/
        try {
            int valor1 = scanner.nextInt();
            int valor2 = scanner.nextInt();

            int resultado = valor1 / valor2;

            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e){ //Aquí capturaríamos esa excepción en concreto: InputMismatchException
            System.out.println("Boom!!, Tipo de dato erróneo: "+ e.getClass());

        } catch (Exception e) { //Exception es una clase donde están todos los errores, si quisiéramos capturar una ....
            // excepción en concreto, habría que sustituirlo por la excepción concreta ej:InputMismatchException
            // se usa 'e' para capturar los errores por convención
            System.out.println("Booom!!, Excepción diferente a tipo de dato erróneo: " + e.getClass());//Esto muestra el tipo de error capturado

        } finally { /*****Esto se EJECUTARÁ SIEMPRE***********/
            System.out.println("Finally");
        }




    }
}

