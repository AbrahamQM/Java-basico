package poo.Ejercicio4;

/*Ejercicio4 Sesión 4

Ejercicio4 1

En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/
public class Main {


    public static void main(String[] args) {


        //Creamos usando constructores vacíos:

        //Creamos dos teléfonos
        SmartPhone iphone = new SmartPhone();
        SmartPhone redmi = new SmartPhone();

        //Creamos dos Relojes
        SmartWatch smartWatch = new SmartWatch();
        SmartWatch samsungGalaxyFit = new SmartWatch();


        //Creamos usando constructores con todos los parámetros

        //Creamos dos teléfonos
        SmartPhone iphone2 = new SmartPhone(4, true, "20 horas", true, 7.9,
                "3200x6500", false, 16, 64, "5G",
                "Wifi+",32,8,"iOS9", false);
        SmartPhone redmi2 = new SmartPhone(5, true, "72 horas", true, 6.8,
                "2900x6500", true, 32, 256, "5g",
                "WiFi+",128, 16, "Android 11", true);

        //Creamos dos Relojes
        SmartWatch appleWatch2 = new SmartWatch(3, true, "19 Horas", true,
                7.2, "1280x3620", false,"Negra", "Plata", 8, false,
                18.5, true);


        SmartWatch samsungGalaxyFit2 = new SmartWatch(0, true, "48 Horas", true, 1.7, "300x200", true, "Verde, Azul, " +
                "Fucsia", "Negra", 200, true, 17.1, true);

        System.out.println("Teléfonos:");
        System.out.println("\niPhone sin datos: "+iphone);
        System.out.println("\niPhone2 con todos los atributos "+iphone2);
        System.out.println("\nRedmi sin datos: "+redmi);
        System.out.println("\nRedmi2 con todos los atributos "+redmi2);

        System.out.println("\nRelojes:");
        System.out.println("\nAppleWatch sin datos: "+ smartWatch);
        System.out.println("\nAppleWatch2 con todos los atributos "+ appleWatch2);
        System.out.println("\nSamsung Galaxy Fit sin datos: "+samsungGalaxyFit);
        System.out.println("\nSamsung Galaxy Fit 2 con todos los atributos "+samsungGalaxyFit2);
    }

}
