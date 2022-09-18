//empezamos con funciones clases heredadas Sesion 9 clases heredadas y clase final

public class Main { //Función Principal

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("Brrr");
        coche.velocidadMaxima = 14;

        System.out.println(coche.getSonido());
    }
}


class Vehiculo { //objeto vehiculo con sus propiedades
    String tipoCombustible;
    int velocidadMaxima;
    String sonido;  //SOLO VAMOS A USAR ESTA PROPIEDAD

    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    public String getSonido() {
        return this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }

}

final class Coche extends Vehiculo {  //ESTA ES LA CLASE QUE HEREDA LAS PROPIEDADES DE VEHÍCULO
                                        //Es una clase FINAL, NADIE PUEDE HEREDAR DE ELLA
    public Coche() {
        System.out.print("Estoy en la clase coche\n");
    }

}