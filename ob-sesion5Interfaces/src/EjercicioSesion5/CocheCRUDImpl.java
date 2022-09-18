package EjercicioSesion5;

public class CocheCRUDImpl implements CocheCRUD{

//Constructores

    public CocheCRUDImpl(String fabricante, String modelo, String color, double precio, int caballos) {
    }

    public CocheCRUDImpl() {
    }


//Implementación de Métodos


    @Override
    public void save() {
        System.out.println("Guardamos un coche con save");
    }

    @Override
    public void findAll() {
        System.out.println("Borramos coche con delete");
    }

    @Override
    public void delete() {
        System.out.println("Encontramos los coches con findAll");
    }
}


/* @Override
     static void save() {
         @Override
     static void save() {
        System.out.println("Guardamos un coche con save");

    }

    @Override
    static void delete() {
        System.out.println("Borramos coche con delete");
    }


    @Override
    static void findAll() {
        System.out.println("Encontramos los coches con findAll");

    }

    }

    @Override
    static void delete() {
        System.out.println("Borramos coche con delete");
    }


    @Override
    static void findAll() {
        System.out.println("Encontramos los coches con findAll");

    }*/



