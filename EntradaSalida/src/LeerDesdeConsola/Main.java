package LeerDesdeConsola;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




            boolean ok = false;

            while (ok == false) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mete dos números: ");

                try {
                    int a; //Creamos las variables dentro del try, para que si no se introducen bien los números, desaparezcan
                    int b; //Y vuelva a comenzar desde 0. si pusiéramos las variables fuera, en caso de error scanner.nextInt()
                    //no volvería a esperar por los números (guardados en la primera iteración) y se produciría un bucle infinito
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    ok = true;
                    System.out.println("Los números son: " +a+" y: "+b);
                } catch (InputMismatchException e) {
                    System.out.println("números inválidos");

                }

            }


    }
}
