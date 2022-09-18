//(he copiado las clases que había en C:\Users\Abraham\IdeaProjects\Ejercicios
//para poder trabajar sin modificar los ejercicios anteriores)

package ConceptosJava.Interfaces;

public abstract class CrearClases { //Convertimos en clase abstracta para usar interfaces

        //ORDEN DE COLOCACIÓN NORMALIZADA para una clase:

        //-atributos "característica que varían de uno a otro
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Double longitud;
        Integer velocidad = 0;


        //-constructores "nos permiten crear objetos de esta clase" COMIENZA EN MAYÚSCULA ...
        //Y TIENE EL MISMO NOMBRE QUE LA CLASE.
            //Si no hubiera ningún constructor, habría uno por defecto con todos los valores vacíos
       public CrearClases(String color, String fabricante, String modelo, Double peso, Double longitud){
            this.color = color;
            this.fabricante = fabricante;       //se usan los this para indicarle que haga referencia ...
            this.modelo = modelo;               // a esta propiedad de este objeto
            this.peso = peso;
            this.longitud = longitud;
       }

      public CrearClases() {      //Esto es un constructor Al que hay que p
      }


    //-comportamiento "métodos o funciones" aquí probaremos un if también
        public void acelerar(Integer cantidad){
           if(cantidad >= 0 && cantidad <=420) {

               this.velocidad += cantidad;
           }
        }



    @Override       //esto se hizo con botónDerecho "generate"->"toString()"
    public String toString() {
        return "CrearClases{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", longitud=" + longitud +
                ", velocidad=" + velocidad +
                '}';

    }

}

