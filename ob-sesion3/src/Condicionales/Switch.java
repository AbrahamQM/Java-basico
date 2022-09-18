package Condicionales;

public class Switch {
    public static void main(String[] args) {


        String dia = "Viernes";  //Inicializamos el valor a comprobar

        switch (dia) {       //Parámetro a comprobar  AQUI SE PONEN LAS LLAVES
            case "Lunes":   //Casos a comprobar. OJO SE PONEN ":" EN LUGAR DE {}
                System.out.println("Vamos que es Lunes");
                break;   //OJO SI NO PONEMOS UN BREAK, EJECUTA TODOS LOS CASOS
            case "Martes":
                System.out.println("Martes");
                break;
            case "Miércoles":
                System.out.println("Miércoles");
                break;
            case "Jueves":
                System.out.println("Jueves");
                break;
            case "Viernes":
                System.out.println("Viernes Garimbitas isofacto");
                break;
            case "Sábado":
                System.out.println("Deja el pc y vete a volar, Es sábadoooo!!!!");
                break;
            case "Domingo":
                System.out.println("Deja el pc y arranca la moto, Es Domingo--GassssSsSsSsSsS--");
                break;
            default:
                System.out.println("No es un día válido");
        }
    }
}
