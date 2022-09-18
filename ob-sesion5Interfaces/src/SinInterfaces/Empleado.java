package SinInterfaces;
//Aqui creamos la clase con sus atributos y un método toString
public class Empleado {

   //1.Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta; //true = trabajando actualmente, false = está de baja

    //2.Constructores

    public Empleado() {  //Constructor vacío
    }

    public Empleado(String nombre, int edad, double salario, boolean alta) { //constructor con todos los atributos
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }
//3.Métodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
