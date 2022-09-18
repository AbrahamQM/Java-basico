public class Coche {

    //aquí se pondrían los atributos y métodos de coche
    String name = "Nombre de coche";

    public Coche(){} //Esto es un constructor vacío para que no haya problemas si se utilizan los nombres por defecto
    //Si quitamos ese constructor vacío, nos obligaría a establecer el nombre al crear un objeto de esa clase


    //Constructor para modificar el nombre del coche
    public Coche(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }


}
