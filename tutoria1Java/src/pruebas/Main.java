package pruebas;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario pepe = new Usuario();
        Administrador abrahamAdm = new Administrador();

        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(pepe);
        usuarios.add(abrahamAdm);
        pepe.nombre = "Pepe";
        pepe.contraseña = "1234";
        pepe.fechaRegistro = new Date();
        abrahamAdm.nombre = "Abraham";
        abrahamAdm.contraseña = "Pollaloca12345€@";
        abrahamAdm.nivel = 3;
        abrahamAdm.fechaRegistro = new Date(1987, 07, 8);

//        System.out.println("Hola soy " + pepe.nombre + " Y mi contraseña es: " + pepe.contraseña);
//        System.out.println("Hola soy " + abrahamAdm.nombre + " Y mi contraseña es: " + abrahamAdm.contraseña
//                        +" y mi nivel es: " + abrahamAdm.nivel);

        for (Usuario usuario : usuarios){

            if (usuario instanceof Administrador) {
                Administrador admin = (Administrador) usuario;

                System.out.println("Hola soy " + admin.nombre + " Y mi contraseña es: " + admin.contraseña
                        + " y mi nivel es: "+ admin.nivel +"\nFecha: "+admin.fechaRegistro);
            }else{
                System.out.println("Hola soy " + usuario.nombre + " Y mi contraseña es: " + usuario.contraseña+"\nFecha: "+usuario.fechaRegistro);
            }
        }


    }
}
