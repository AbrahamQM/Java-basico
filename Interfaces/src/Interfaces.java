//Interfaces Sesión 9
//Interfaces No implementan función, sino que nos dice que es lo que tenemos que implementar
//son como clases abstractas, pero no tienen propiedades ni nos da nada hecho.

public class Interfaces {   //ojo, interfaces es el nombre de la función!



        public static void main(String[] args) {


        }
}


    interface Vehiculo {     //ESTA ES LA INTERFAZ QUE DECLARAMOS
                            // Se usan para crear clases que tengan funciones ya predefinidas

        void Acelerar(int cuantaVelocidad);
        void Frenar(int cuantaVelocidad);
    }

    class Coche implements Vehiculo {           //Esta es la función que debe seguir los parámetros de la interfaz
        public void Acelerar(int cuantaVelocidad){
            //FUNCION Velocidad += cuantaVelocidad;
            //pintln(this.Velocidad);
        }

        public void Frenar(int cuantaVelocidad){
            //FUNCION Velocidad -= cuantaVelocidad;
            //pintln(this.Velocidad);
        }
    }

//Esta en concreto no hace nada pero muestra como funcionaría FALTA LA VARIABLE VELOCIDAD!


