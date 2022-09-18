//funciones abstractas Sesion 9
//Función abstracta se usa para indicar que la clase hijo debe tener esa función como sea
public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("Brrr");
        coche.velocidadMaxima = 14;

        System.out.println(coche.getSonido());
    }
}


abstract class Vehiculo {
    String tipoCombustible;
    int velocidadMaxima;
    String sonido;

    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    abstract public String getSonido(); //Función abstracta se usa para indicar que la clase hijo debe...

    abstract public void setSonido(String sonido);  //tener esa función como sea
}

class Coche extends Vehiculo {
    public String getSonido() {
        return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    public Coche() {
        System.out.print("Estoy en la clase coche\n");
    }

}
