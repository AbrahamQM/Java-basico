public class Main {

    public static void main (String[] args) {
        TipoDeobjeto coche = new TipoDeobjeto();  //PRIMER COCHE
        System.out.print("Numero de puertas: ");
        System.out.println (coche.numeroDePuertas);

        System.out.print ("Velocidad máxima del coche: ");
        System.out.println (coche.velocidadMaxima);

        System.out.print ("Velocidad actual del coche: ");
        System.out.println(coche.velocidadActual);


        System.out.println ("\nSegundo choche\n"); //ESPACIAMOS

        TipoDeobjeto coche2 = new TipoDeobjeto(2, 90); //SEGUNDOCHOCHE
        System.out.print("Numero de puertas: ");
        System.out.println (coche2.numeroDePuertas);

        System.out.print ("Velocidad máxima del coche: ");
        System.out.println (coche2.velocidadMaxima);

        System.out.print ("Velocidad actual del coche: ");
        System.out.println(coche2.velocidadActual);
    }
}

class TipoDeobjeto {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public TipoDeobjeto() {
        velocidadMaxima = 120;
        numeroDePuertas = 5;
        System.out.println ("Estoy en el constructor SIN NADA");
    }

    public TipoDeobjeto(int puertas, int velocidad) {
        velocidadMaxima = velocidad;
        numeroDePuertas = puertas;
        System.out.println ("Estoy en el constructor CON PARÁMETROS");
    }


}