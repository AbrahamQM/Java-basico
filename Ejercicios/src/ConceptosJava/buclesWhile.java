package ConceptosJava;

public class buclesWhile {
    public static void main(String[] args) {

        int count = 0;      //variable de contador para usarla en la condición

        while (count < 10){

            System.out.println("Impresión " + (count + 1) + "º vez.");
            count++;//condición que va a hacer que cambie la condición y se pueda terminar el bucle


        }

        System.out.println("fin");
    }
}
