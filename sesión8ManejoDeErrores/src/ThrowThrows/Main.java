package ThrowThrows;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            divide(4, 0);
        }catch (Exception e){
            System.out.println("Error "+e);
        }

    }


    public static int divide(int a, int b) throws ArithmeticException, InputMismatchException, IOException { //Le indicamos que arroje excepciones
        int resultado = 0;
        try {
            resultado = a / b;
        } catch(ArithmeticException e) {
            throw new ArithmeticException (); //Esto genera una excepción al encontrar el error, que puede ser del
            // tipo que queramos

        } catch (InputMismatchException e) {//En este caso con un error de dato inesperado vamos a lanzar una
            // excepción del tipo IOException
            throw new IOException();//se puede probar poniendo un dato que no sea entero
        }
        return resultado;
    }
}
