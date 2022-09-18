package ConceptosJava;

public class ifElse {

    public static void main(String[] args) {
//        boolean check = 5 < 10;
        int number1 = 5;    //cambiando cualquiera de estas variables para que no se
        int number2 = 20;   //cumpla la condición, podemos comprobar si funciona o no el else
        int number3 = 5;

        if (number1 < number2 && number2 < number3) {
            System.out.println("IF: Verdadero pasando variables");

        } else if(number1 > number2){       //Esto sería para probar otras condiones
            System.out.println("Esto es el 1º else if");

        } else{
            System.out.println("No se cumplen las condiciones");
        }
        System.out.println("fin");



    }
}
