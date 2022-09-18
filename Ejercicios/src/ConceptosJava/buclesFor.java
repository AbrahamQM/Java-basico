package ConceptosJava;

public class buclesFor {
    public static void  main(String[] args){

        for (int i = 0; i < 10; i++){ // (condicion de comienzo; condicion de parada; condicon de paso)

                                    //Condicion de paso es el acto para seguir caminando el bucle
            System.out.println("Texto impreso por " + (i + 1) + "ª vez.");
            //imprime Texto + nº de paso(+1 xq comienza en 0) + ª vez
        }
        System.out.println("Fin");
    }
}
