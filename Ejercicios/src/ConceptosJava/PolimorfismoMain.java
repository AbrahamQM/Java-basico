package ConceptosJava;

public class PolimorfismoMain {
    public static void main(String[] args) {
        //Asi es como se estaban creando objetos coche hasta ahora:

        CrearClases coche1 = new CrearClases();
        ClaseHeredadaDeCrearClases coche2 = new ClaseHeredadaDeCrearClases();
        CocheHibrido coche3 = new CocheHibrido();

        //con polimorfismo podemos crear clases hijas directamente con todos los métodos y variables de las clases padre:
        CrearClases coche4 = new ClaseHeredadaDeCrearClases(); //estamos creando una clase hija y pomos trabajar ...
                                                                // con estos objetos como si fueran de la clase padre
        CrearClases coche5 = new CocheHibrido();    //Aquí creamos una clase padre que tiene los métodos y variables de:
                                                    //  CrearClases (coche híbrido hereda de CrearClases)
                                                    //  CocheHibrido


                        //COMPROBACIONES de que clase es cada objeto
        //para comprobar que de que clase es un objeto podemos usar la palabra reservada instanceof

        if (coche4 instanceof CrearClases){     //Estro es true
            System.out.println("Coche4 es un objeto CrearClases");
        }
        if (coche4 instanceof ClaseHeredadaDeCrearClases){      //esto es true
            System.out.println("Coche4 es un objeto ClaseHeredadaDeCrearClases");
        }
        if (coche4 instanceof CocheHibrido){       //esto tiene que dar false porque coche4 no es de clase CocheHibrido
            System.out.println("Coche4 Es un CocheHíbrido");
        }else {
            System.out.println("Coche4 no es un coche híbrido");
        }

        //comprobaciones coche5
        if (coche5 instanceof CrearClases){ //esto es true
            System.out.println("Coche5 es un objeto CrearClases");
        }
        if (coche5 instanceof ClaseHeredadaDeCrearClases){  //esto es false
            System.out.println("Coche5 es un objeto ClaseHeredadaDeCrearClases");
        }else{
            System.out.println("Coche 5 no es un objeto ClasesHeredadasDeCrearclases");
        }
        if (coche5 instanceof CocheHibrido){    //esto es true
            System.out.println("Coche5 es un coche híbrido");
        }else {
            System.out.println("Coche5 no es un coche híbrido"); //Esto no se ejecuta porque coche 5 si es CocheHibrido
        }

        //Comprobamos coche1 para ver las diferencias
        if (coche1 instanceof CrearClases){
            System.out.println("Coche1 es un objeto CrearClases");
        }else {
            System.out.println("Coche1 no es un objeto CrearClases");
        }

        if (coche1 instanceof ClaseHeredadaDeCrearClases){
            System.out.println("Coche1 es un objeto ClaseHeredadaDeCrearClases");
        }else {
            System.out.println("Coche1 no es un coche ClaseHeredadaDeCrearClases");
        }

        if (coche1 instanceof CocheHibrido){
            System.out.println("Coche1 es un coche híbrido");
        }else {
            System.out.println("Coche1 no es un coche híbrido");
        }


    }
}

//Podemos comprobar que coche4 y coche 5 pertenecen a varias clases a la misma vez,
//Sin embargo cuando trabajamos con coche1, coche2 y coche3, trabajamos con clases concretas de objetos

//El Polimorfismo nos permitirá ejecutar un mismo método o función (que java nos pide poner siempre ...
//... usar el mismo tipo de objeto) para diferentes tipos de objetos a la misma vez usando la clase padre.