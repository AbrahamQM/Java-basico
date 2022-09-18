package interfaces;

public class Vehiculo implements Imprimible{
    public int numRuedas;
    public String ficheroModelo;
    public float cilindrada;

    public Vehiculo() {
        numRuedas = 4;
        ficheroModelo ="BMW x5.jpx";
        cilindrada =  2987.6f;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehículo con:\n"+numRuedas+"ruedas.\n" +cilindrada+ "cc\nFichero del modelo: "+ ficheroModelo);
    }
}
