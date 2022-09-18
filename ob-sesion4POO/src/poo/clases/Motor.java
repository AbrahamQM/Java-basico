package poo.clases;

//Esta clase encapsulada dentro de vehículo. sería Clase Heredada De Vehículo
//Se usan clases encapsuladas si alguno de los atributos de la clase padre ...
//...fuera muy complejo o tuviera métodos propios

public class Motor {

    //1. Atributos
    int caballos;
    double parNm;
    int numCilindros;
    String modelo;  //Este atributo se llama igual que Vehiculo.modelo, pero Esta se refiere al modelo del motor, ...
    // mientras que Vehiculo.modelo, se refiere al modelo de vehículo. No habría ningún problema

    //2. Constructores
    public Motor(){ //Constructor sin parámetros

    }

    public Motor(int caballos, double parNm, int numCilindros, String modelo) { //Constructor con todos los parámetros
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
        this.modelo = modelo;
    }

    //3. Métodos


}
