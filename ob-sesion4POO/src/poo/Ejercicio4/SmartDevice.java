package poo.Ejercicio4;

public abstract class SmartDevice {



        //Agregar atributos tal cual tendrían esos objetos en la realidad
        int numCamaras;
        boolean gps;
        String durBateria;
        boolean bluetooth;
        double tamPantalla;
        String resPantalla;
        boolean googlePay;


    public SmartDevice() {
    }

    public SmartDevice(int numCamaras, boolean gps, String durBateria, boolean bluetooth, double tamPantalla, String resPantalla, boolean googlePay) {
        this.numCamaras = numCamaras;
        this.gps = gps;
        this.durBateria = durBateria;
        this.bluetooth = bluetooth;
        this.tamPantalla = tamPantalla;
        this.resPantalla = resPantalla;
        this.googlePay = googlePay;
    }
}
