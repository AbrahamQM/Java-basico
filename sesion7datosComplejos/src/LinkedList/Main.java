package LinkedList;
//Es casi idéntico a un ArrayList. Diferencias:
//El Arraylist es mucho más rápido para ALMACENAR Y BUSCAR datos.
//Una LinkedList es mucho más rápido para MODIFICAR datos.


import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
/******************************************** CREAMOS E INICIALIZAMOS********************************/

        LinkedList<String> listaEnlazada = new LinkedList<>();
        listaEnlazada.add("Abraham");
        listaEnlazada.add("Ana Mº");
        listaEnlazada.add("Loco");
        listaEnlazada.add("Juan Antonio(Titi)");
        System.out.println(listaEnlazada);
    }
} //Sin más explicaciones del profesor, ver mejor en ejercicio EjerciciosSesiones7,8,9JavaBasico -> 6º Parte
//jetbrains://idea/navigate/reference?project=EjerciciosSesiones7,8,9JavaBasico&path=Ejercicio/Main.java
