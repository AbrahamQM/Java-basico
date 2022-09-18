package poo.Ejercicio4;

public class SmartWatch extends SmartDevice{

    //Agregar atributos tal cual tendrían esos objetos en la realidad
    String colCorrea;
    String colEsfera;
    int numSkins;
    boolean correaMetal;
    double tamCorrea;
    boolean conectApp;




    //Crear constructor vacío y otro con todos los parámetros (En cada clase)
    public SmartWatch() {
    }

    public SmartWatch(int numCamaras, boolean gps, String durBateria, boolean bluetooth, double tamPantalla,
                      String resPantalla, boolean googlePay, String colCorrea, String colEsfera, int numSkins,
                      boolean correaMetal, double tamCorrea, boolean conectApp) {

        super(numCamaras, gps, durBateria, bluetooth, tamPantalla, resPantalla, googlePay);
        this.colCorrea = colCorrea;
        this.colEsfera = colEsfera;
        this.numSkins = numSkins;
        this.correaMetal = correaMetal;
        this.tamCorrea = tamCorrea;
        this.conectApp = conectApp;

    }

    //Método toString

    @Override
    public String toString() {
        return "SmartWatch{" +
                "numCamaras=" + numCamaras +
                ", gps=" + gps +
                ", durBateria='" + durBateria + '\'' +
                ", bluetooth=" + bluetooth +
                ", tamPantalla=" + tamPantalla +
                ",\nresPantalla='" + resPantalla + '\'' +
                ", googlePay=" + googlePay +
                ", colCorrea='" + colCorrea + '\'' +
                ", colEsfera='" + colEsfera + '\'' +
                ", numSkins=" + numSkins +
                ", correaMetal=" + correaMetal +
                ", tamCorrea=" + tamCorrea +
                ", conectApp=" + conectApp +
                '}';
    }
}
