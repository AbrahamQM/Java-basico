package Ejercicio;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1º parte. Devolver cadena de texto al revés
        String cadena = "Texto para devolver al revés";
        String resultado = reverse(cadena);
        System.out.println("1º-\nEl texto original es: "+cadena);
        System.out.println("El resultado de cadena inversa es: "+ resultado);


        //2º Parte. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] array_String ={
          "Abraham",
          "Alejando",
          "Ana",
          "Antonia",
          "Lucía",
        };
        System.out.println("\n2º-\nLos valores del string[] son: ");
        for (String temp : array_String){
            System.out.println(temp);
        }

        //3º parte. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada
        // elemento en ambas dimensiones.
       Integer [][] enteros = {
               {15,20,16,33},
               {25,99,6,84}
        };
        System.out.println("\n3º-");
        for (int i=0;i< enteros.length;i++){
            for (int j=0;j<enteros[i].length; j++){
                System.out.println("Estamos en la fila: "+(i+1)+" Columna: "+(j+1)+"\nEl valor es: " + enteros[i][j]);
            }
        }

        //4º parte. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2º y 3º elemento
        // y muestra el resultado final.
        Vector<String> vector = new Vector<>();
        vector.add("Primer valor");
        vector.add("Segundo valor");
        vector.add("Tercer valor");
        vector.add("Cuarto valor");
        vector.add("Quinto valor");

        vector.remove(2); //El 1 corresponde al 2º valor, Comienzan por 0
        vector.remove(1); //Los borro en orden inverso para evitar que se modifique la posición de los elementos
        System.out.println("\n4º-\nEl resultado del vector menos el 2º y 3º elemento es:\n"+vector);

        //5º parte. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
        // 1000 elementos para ser añadidos al mismo.
        System.out.println("""

                5º-
                Cada vez que sobrepasamos la capacidad del vector,(por defecto) éste crea otro duplicando la capacidad\s
                del vector anterior y lo sobreescribe, lo cual puede llegar a ocupar mucho espacio en memoria.
                también si el vector tuviera 1001 elementos, tendríamos un vector con capacidad 2000 en los que 999
                se desaprovechan se puede (remediar) haciendo un trim.""");

        //6º parte. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos
        // mostrando únicamente el valor de cada elemento.
        System.out.println("\n6º-");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("1º elemento");
        lista.add("2º elemento");
        lista.add("3º elemento");
        lista.add("4º elemento");
        LinkedList<String> listaEnlazada = new LinkedList<>();
        for (int i = 0; i<lista.size(); i++){   //Las copiamos
            listaEnlazada.add(i,lista.get(i));
        }

        System.out.println("Elementos del ArrayList: ");
        for(String i: lista){
            System.out.println(i);
        }

        System.out.println("Elementos de la LinkedList: ");
        for(String i: listaEnlazada){
            System.out.println(i);
        }


        //7º Parte. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los números pares. Por último, vuelve a recorrerlo y muestra el ArrayList
        // final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno
       ArrayList<Integer> numeros = new ArrayList<>();

        for (int i=1;i<11;i++){ //Añadimos números
            numeros.add(i);
        }

        for (int i =9; i>=0;i--){  //eliminamos los pares
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }

        System.out.println("\n7º.-\nEjercicio arraylist de int:");
        for (int i = 0; i<numeros.size(); i++){     //Recorremos e imprimimos
            System.out.println("Número "+(i+1)+"º del ArrayList es: " + numeros.get(i) );
        }

        //8º Parte. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la
        // excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        System.out.println("\n8º.-\nEjercicio Divide por 0:");
        try {

            System.out.println(DividePorCero(5, 0));
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse error: "+ e);
        }finally {
            System.out.println("Demo de código");
        }

        //9º Parte: Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y
        // "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al
        // fichero dado en "fileOut".
        System.out.println("\n9º.-\nEjercicio fileIn, fileOut:");
        inOut("fileIn.txt", "fileOut.txt");


        //10º Parte:Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
        // un HashMap y un ArrayList, LinkedList o array.

        parteDiez();
    }


//1º
    public static String reverse(String texto) {
        String devolver = "";

        for (int i = texto.length() -1; i>=0; i--) {
            devolver = devolver + texto.charAt(i); //substring
        }
        return devolver;
    }
//8º
    public static double DividePorCero (int a, int b) throws ArithmeticException{
        try {
            return a / b;
        } catch (Exception e){
            throw new ArithmeticException();
        }

    }
//9º
    public static void inOut(String input, String output)  {



        try {
            InputStream fileIn = new FileInputStream(input);
            PrintStream fileOut = new PrintStream(output);
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            fileOut.write(datos);
            fileOut.close();
            System.out.println("Copia realizada correctamente.");

        }catch(Exception e){
            System.out.println("Exception error: " +e);
        }
    }

    public static void parteDiez(){
        System.out.println("\n10º.-\nEjercicio libre: copiar un archivo en otro nuevo y añadirle al nuevo un CopyWrite");
        try {
            InputStream fileIn = new FileInputStream("parteDiez.txt"); //InputStream
            PrintStream fileOut = new PrintStream("copiaParteDiez.txt");//PrintStream
            HashMap<String, String> mapa = new HashMap<>();//HashMap
            byte[] datos = fileIn.readAllBytes();//array
            mapa.put("Copywrite:", "2021");
            mapa.put("Nombre Creador: ", "Pepito");
            mapa.put("1º Apellido: ", "Apeles");
            mapa.put("2º Apellido: ", "Medina");
            mapa.put("fecha: ", "13/11/2021");


            fileOut.write(datos);  //Copiamos lo que hay en parteDiez.txt a copiaParteDiez.txt

            //Copiamos el HashMap
            for (Map.Entry elemento: mapa.entrySet()){
                String temp="\n";
                temp = "\n " +(String) elemento.getKey();
                temp += (String) elemento.getValue() ;

                fileOut.write(temp.getBytes());
            }
            fileOut.close();
            // imprimir el archivo copiaParteDiez.txt
            FileReader contenido = new FileReader("copiaParteDiez.txt");
            int valor = contenido.read();
            while(valor != -1){
                System.out.print((char) valor);
                valor = contenido.read();
            }
            contenido.close();

 /*
            InputStream file = new FileInputStream("copiaParteDiez.txt"); //InputStream
            datos = file.readAllBytes();
            System.out.println("copiaParteDiez.txt:");
            //imprimir el fichero en consola
*/
        }catch(Exception e){
            System.out.println("Fallo en parteDiez: " +e);
        }

    }

}
