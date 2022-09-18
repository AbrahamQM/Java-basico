package ConceptosJava;
//es muy parecida al if-else pero permite poner múltiples "if"
public class SentenciaSwitch {
    public static void main(String[] args) {

        String weather = "verano";  //aqui podemos poner verano, invierno o cualquier otra cosa
                                      //para probar las diferentes opciones
        switch (weather){
            case "verano":      //si es verano hacer...
                System.out.println("Es verano");
                break;    //SI NO PONEMOS break, SE EJECUTA también EL SIGUIENTE CASE como si fuera cierto
                          // Pero solo el siguiente
            case "invierno":        //si es invierno hacer...
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:        //sentencia default es cualquier otra opción
                System.out.println("No sabemos que estación es.");
                break;

        }

    }
}
