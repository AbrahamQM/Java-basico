package EjercicioSesion5;

public class Coche {
   //Atributos
    String fabricante;
    String modelo;
    String Color;
    double precio;
    int caballos;

    //Constructores
    public Coche() {
    }

    public Coche(String fabricante, String modelo, String color, double precio, int caballos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.Color = color;
        this.precio = precio;
        this.caballos = caballos;
    }

    //Método
        @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Color='" + Color + '\'' +
                ", precio=" + precio +
                ", caballos=" + caballos +
                '}';
    }



}
