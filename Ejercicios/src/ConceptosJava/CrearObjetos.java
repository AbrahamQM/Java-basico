package ConceptosJava;

//Crearemos un objeto dependiente de CrearClases.java y usaremos el método Acelerar
//También modificaremos valores para comprobar las diferencias




public class CrearObjetos {
    public static void main(String[] args) {


        //CrearClases cocheObjeto = new CrearClases();  ESTO SERÍA SI TUVIÉRAMOS OTRO CONSTRUCTOR SIN PARÁMETROS

        //ESTE ES EL CONSTRUCTOR
        CrearClases cocheObjeto2 = new CrearClases("rojo", "honda", "civic", 1430.45, 5.4);
        //Invocamos el método constructor que se encuentra en CrearClases.java
        System.out.println("Ahora imprimimos el estado inicial del objeto:\n" + cocheObjeto2 + "\n");

        cocheObjeto2.acelerar(50);      //Usamos el método acelerar con valor +50
        System.out.println("Ahora usamos acelerar(+50) e imprimimos:\n" + cocheObjeto2 + "\n"); //Imprimir el objeto completo. Resultado en terminal es:
        // CrearClases{color='rojo', fabricante='honda', modelo='civic', peso=1430.45, longitud=5.4, velocidad=0}

        cocheObjeto2.peso = 1350.8; // esto es para modificar uno de los valores de cocheObjeto2 en concreto el peso
        System.out.println("Ahora cambiamos el peso por 1350.8:\n" + cocheObjeto2 + "\n");  //comprobamos la diferencia.
        // RESULTADO: CrearClases{color='rojo', fabricante='honda', modelo='civic', peso=1350.8, longitud=5.4, velocidad=50}
        //VEMOS COMO EL PESO HA CAMBIADO Y LA VELOCIDAD TAMBIÉN

        //Esto es un constructor para ClaseHeredadaDeCrearClases QUE CREAMOS EN LA SIGUIENTE SESION 7.1 Herencia

        System.out.println("Ahora veremos el Modelo Eléctrico: ");
        ClaseHeredadaDeCrearClases ClaseHeredadaDeCrearClases = new ClaseHeredadaDeCrearClases();

        ClaseHeredadaDeCrearClases.motorElectrico = "Ejemplo motor Eléctrico";
        ClaseHeredadaDeCrearClases.peso = 1000.5;
        ClaseHeredadaDeCrearClases.color = "Blanco";
        ClaseHeredadaDeCrearClases.fabricante = "Tesla";
        ClaseHeredadaDeCrearClases.longitud = 9.35;
        ClaseHeredadaDeCrearClases.modelo = "Modelo Sport";
        ClaseHeredadaDeCrearClases.velocidad = 80;

        System.out.println(ClaseHeredadaDeCrearClases + "\n");
        //ahora vamos a acelerar
        ClaseHeredadaDeCrearClases.acelerar(50 ); //Aqui le decimos que acelere velocidad(50) + 50, pero la ...
        // función está sobreescrita y queda el resultado velocidad + (50x2) = Velocidad
        System.out.println("Ahora aceleramos el coche eléctrico velocidad+(50x2)(Función acelerar con sobreescritura):");
        System.out.println(ClaseHeredadaDeCrearClases + "\n");

                                //METODO SUPER
        //Ahora creamos una clase con el método "super" que usamos en ClaseHeredadaDeCrearClases línea: 19 - 25
        System.out.println("Ahora veremos el coche eléctrico Hyundai usando el método SUPER pero pasamos valor velocidad=0");
        System.out.println("");
        ClaseHeredadaDeCrearClases ClaseHeredadaDeCrearClases2 = new ClaseHeredadaDeCrearClases("rosado",
                "hyundai", "coupe", 1200.9, 321.6, "hyundai Electrificado");
        System.out.println(ClaseHeredadaDeCrearClases2);

                                //SOBREESCRITURA DE FUNCIONES O MÉTODOS
        //Se usa para modificar el comportamiento del método. Vamos a probarlo con el método acelerar
        //HEMOS modificado la función o método acelerar de CrearClases linea 32 en ClaseHeredadaDeCrearClases línea 31


    }
}