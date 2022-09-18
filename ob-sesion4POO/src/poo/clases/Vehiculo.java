package poo.clases;

public class Vehiculo {
//public abstract class Vehiculo { // (esto esta relacionado con Main.java línea 74)
    //1. Atributos
    //Explicación del public en  herencias.Camion línea 10
    public String modelo;
    public String fabricante;
    public double cc; // al ser con la d minúscula, es un tipo primitivo (hay que inicializarlo)
//  Double cc; //Es un tipo envoltorio, una clase ya predefinida que tiene entre sus ventajas puede ser
                // con valor null.
    public int year;
    public boolean sport; //para saber si tiene modo sport o no
    public int velocidad;
    public Motor motor; //Declaramos un objeto de la clase Motor que es otro atributo más de la clase Vehículo

//----------------------------------------------------------------------------------------------------------------

    //2. Constructores.  Son métodos especiales que permiten construir objetos a partir de la plantilla (Clase, en este
    // caso Vehiculo). La conveción dice:
    //+Público(Para que pueda ser accesible desde la clase Main u otras)
    //+Nombre de la clase a construir (en este caso Vehiculo).
    //+Parámetros en caso de haberlos(tipo parámetro1,tipo parámetro2, ...) Entre paréntesis.
    //+ {} para colocar dentro instancias para inicializar los parámetros, asignarle el valor que nos pasan, ...

    //SE PUEDE CREAR UN CONSTRUCTOR "AUTOMÁTICAMENTE" CON: ClickDcho ratón->Generate->Constructor y seleccionando los
    //parámetros que queremos pasarle. Si lo hacemos con todos, generaría el (Constructor 2) que hay más abajo
    //Incluyendo las asignaciones de valores

    //++++++++++++++++++++++++++++++++++++++




    //Constructor 1 (sin paso de valores)
    // (en este caso lo crearemos vacío para que permita crear un objeto de la clase sin rellenar los parámetros
    public Vehiculo(){

    }

    //SOBRECARGA de constructores: Creamos otro método constructor con parámetros diferentes, por si queremos invocarlo
    //pasándole parámetros. si lo ponemos idéntico a otro ya creado, dará error
    //++++++++++++++++++++++++++++++++++++++++

    //Constructor 2 (Pasándole todos los parámetros)

    public Vehiculo(String modelo, String fabricante, double cc, int year, boolean sport, int velocidad, Motor motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    //+++++++++++++++++++++++++++++++++++++++++++

    //Constructor 3 (Sólo algunos parámetros)
    public Vehiculo(String fabricante, String modelo){
        //Creamos este tipo de constructor por si solo sabemos algunos de los atributos, en este caso fabricante y modelo
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    //++++++++++++++++++++++++++++++++++++++++++

//------------------------------------------------------------------------------------------------------------

    //3. Métodos (Comportamiento)


    //Método 1. Creamos un método para acelerar el vehículo

    public void acelerar(int quantity){
        this.velocidad += quantity;

    }

    //Getter y setter


    //toString



}
