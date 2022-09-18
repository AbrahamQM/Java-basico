package interfaces;

public class Edificio implements Imprimible{
    public int plantas;
    public String ficheroModelo;
    public float metros;


    public Edificio() {
        plantas = 3;
        ficheroModelo = "Guggenhaim.jpx";
        metros = 3850.9f;
    }

    @Override
    public void imprimir() {
        System.out.println("Edificio con: \n"+plantas+" plantas\n" +metros+ "m de altura. \nFichero del modelo: "+ ficheroModelo);
    }
}
