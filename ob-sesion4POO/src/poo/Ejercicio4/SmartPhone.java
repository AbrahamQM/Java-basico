package poo.Ejercicio4;


public class SmartPhone extends SmartDevice{

    //Agregar atributos tal cual tendrían esos objetos en la realidad

    int memoriaRam;
    int memoriaInterna;
    String ProtocoloAntena;
    String protocoloWifi;
    int resolucionTras;
    int resolucionFront;
    String soperativo;
    boolean funda;


    //Crear constructor vacío y otro con todos los parámetros (En cada clase)

    public SmartPhone() {
    }

    public SmartPhone(int numCamaras, boolean gps, String durBateria, boolean bluetooth, double tamPantalla,
                      String resPantalla, boolean googlePay, int memoriaRam, int memoriaInterna, String protocoloAntena,
                      String protocoloWifi, int resolucionTras, int resolucionFront, String soperativo, boolean funda) {
        super(numCamaras, gps, durBateria, bluetooth, tamPantalla, resPantalla, googlePay);
        this.memoriaRam = memoriaRam;
        this.memoriaInterna = memoriaInterna;
        ProtocoloAntena = protocoloAntena;
        this.protocoloWifi = protocoloWifi;
        this.resolucionTras = resolucionTras;
        this.resolucionFront = resolucionFront;
        this.soperativo = soperativo;
        this.funda = funda;

    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "numCamaras=" + numCamaras +
                ", gps=" + gps +
                ", durBateria='" + durBateria + '\'' +
                ", bluetooth=" + bluetooth +
                ", tamPantalla=" + tamPantalla +
                ", resPantalla='" + resPantalla + '\'' +
                ",\ngooglePay=" + googlePay +
                ", memoriaRam=" + memoriaRam +
                ", memoriaInterna=" + memoriaInterna +
                ", ProtocoloAntena='" + ProtocoloAntena + '\'' +
                ", protocoloWifi='" + protocoloWifi + '\'' +
                ", resolucionTras=" + resolucionTras +
                ", resolucionFront=" + resolucionFront +
                ", soperativo='" + soperativo + '\'' +
                ", funda=" + funda +
                '}';
    }
}
