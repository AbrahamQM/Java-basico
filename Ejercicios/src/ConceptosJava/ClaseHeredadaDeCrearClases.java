package ConceptosJava;
//Aqui vamos a crear una clase que hereda de CrearClases.java pero con atributos añadidos de un coche eléctrico
public class ClaseHeredadaDeCrearClases extends CrearClases {

    String motorElectrico ;

    public  ClaseHeredadaDeCrearClases(){
        //esto sería un constructor sin parámetros

    }
                        //SOBRECARGA DE FUNCIONES

    //Vamos a hacer "sobrecarga de funciones" a continuación sobrecargando la función constructora CrearClases
    //Cambiando las variables que se pasan
    public  ClaseHeredadaDeCrearClases(String motorElectrico){
        this.motorElectrico = motorElectrico;

    }
                                    //Usar el método SUPER

    public  ClaseHeredadaDeCrearClases(String color, String fabricante, String modelo, Double peso, Double longitud, String motorElectrico){
       //Hemos añadido la variable "String motorElectrico" ya que en la clase padre "CrearClases" que invocaremos a coninuación no existe
        super (color, fabricante, modelo, peso, longitud); //El método SUPER nos permite invocar a un constructor de la clase superior no tiene velicidad aun
        this.motorElectrico = motorElectrico;   //le asignamos a la variable motorElectrico el valor que nos pasen al invocar esta funcion sobrecargada
    }


                                  //SOBREESCRITURA
    //Vamos a sobreescribir el método ACELERAR para modificar el comportamiento
    @Override  //esta anotación de metadatos, le dice al compilador que compruebe si existe el método acelerar en la clase superior CrearClases
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada =   cantidad * 2;        //vamos a modificar la aceleración para comprobarlo
        super.acelerar(cantidadAjustada);       //Usamos super para acceder al método acelerar de la clase superior CrearClases
    }

    @Override   //Aqui vamos a imprimir todas las variables de ClaseHeredadaDeCrearClases
    public String toString() {
        return "ClaseHeredadaDeCrearClases{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", longitud=" + longitud +
                ", velocidad=" + velocidad +
                '}';
    }
}
