//Sesion 10
//Invocación con paso de parámetros
package ConceptosJava;

public class invocacionConParametros {



        public static void main(String[] args) {
            Coche coche = new Coche();
            coche.Acelerar(50);
            coche.Frenar(10);

            var resultado = suma (2,5);     //Esta es la invocación con parámetros
            System.out.println (resultado);
        }

        public static int suma(int operandoA, int operandoB) {
            return operandoA + operandoB;
        }



}

interface Vehiculo {             //Se usan para crear clases que tengan funciones ya predefinidas

    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {           //Esta es la función que debe seguir los parámetros de la interfaz
    public void Acelerar(int cuantaVelocidad){

    }

    public void Frenar(int cuantaVelocidad){

    }
}


