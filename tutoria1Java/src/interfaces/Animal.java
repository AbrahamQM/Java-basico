package interfaces;

public class Animal implements Imprimible{
    public float anchura;
    public float altura;
    public String ficheroModelo;

    public Animal() {
        anchura = 1.5f;
        altura =2;
        ficheroModelo = "caballo.jpx";
    }

    @Override
    public void imprimir() {
        System.out.println("Animal con:\n"+anchura+" cm de ancho\n" +altura+ " cm de alto\nFichero del modelo: "+ ficheroModelo);
    }
}
