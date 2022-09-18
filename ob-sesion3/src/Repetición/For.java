package Repetición;

public class For {
    public static void main(String[] args) {

        for (int i = 0 ; i < 10; i++){ //para (declaramos e iniciamos variable; condición de finalización; modificación){}
            //usamos i+=2 es i=i+2, i*=3 es i=i*3 y así
            System.out.println("Ahora i es: " + i);
        }

        String[] nombres = {"Abraham", "Ana", "Pepe", "Juan"};     //Creamos e inicializamos LOS ARRAY SE INICIALIZAN CON {}
        // un array de Strings con nombres para usar otro for

        for (int i=0; i<nombres.length; i++){       //En lugar de usar 4, obtenemos la cantidad de String en el array
            System.out.println("El "+ (i+1)+"º nombre es:\n" + nombres[i]);
        }

        //otro ejemplo con array de números
        int suma = 0;
        int[] numeros = {1957, 2500, 3600, 55, 10000}; //OjO: Creamos e inicializamos LOS ARRAY SE INICIALIZAN CON {}
        for (int i = 0; i < numeros.length ; i++){
            System.out.println("El "+ (i+1)+"º número es:\n" + numeros[i]);
            suma += numeros[i]; //Es lo mismo que poner suma = suma + numeros[i];
            System.out.println("El sumatorio es: " + suma);
        }
        System.out.println("\nLa suma total es: " + suma);

    }
}
