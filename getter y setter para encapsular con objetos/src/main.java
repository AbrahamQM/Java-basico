//encapsulamos las variables "tipo" y "velocidadMaxima" de cada vehículo en cada objeto "vehículo",


class Main {

    public static void main (String[] args) {
//coche
        Vehiculo coche = new Vehiculo(); //creamos objeto vehiculo coche

        coche.setTipo ("COUPE"); //usamos setter para decirle tipo.coche = coupe
        coche.setVelocidadMaxima(100); //usamos setter para decirle velocidad.coche = 100


//moto
        Vehiculo moto = new Vehiculo(); //creamos otro objeto vehículo moto
        moto.setTipo("GSR 600");
        moto.setVelocidadMaxima(299);   //usamos setter para decirle velocidad.moto = 100

        //ahora obtenemos con getter e imprimimos cada valor
        System.out.print ("Tipocoche: ");
        System.out.println(coche.getTipo()); //usammos  getter para obtener el valor tipo ...

        System.out.print ("Tipo moto: ");
        System.out.println(moto.getTipo()); //de cada vehiculo e imprimirla

        System.out.print ("Ahora velocidades \n"); //para separar el resultado


        System.out.print ("Vel. Max. coche: ");
        System.out.println(coche.getVelocidadMaxima()); //usammos  getter para obtener el valor velocidadMaxima d

        System.out.print ("Vel. Max. Moto: ");
        System.out.println(moto.getVelocidadMaxima()); //de cada vehiculo e imprimirla
    }
}


class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
// establecemos velocidadMaxima
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
//obtenemos velocidadMaxima
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
//establecemos tipo
    public void setTipo(String tipo) { //función establecer tipo

        this.tipo = tipo;

    }
//obtenemos tipo
    public String getTipo() { //función obtener tipo

        return this.tipo;
    }
}