package EjercicioIVA;

/**
 * Ejercicio de la Sesión 2 de Java Básico
 * Crear una función que reciba precio sin IVA y devuelva precio con IVA incluido
 */


public class PrecioIvaMain {
    public static void main(String[] args) {
        double precioSinIva = 19.95;
        System.out.println("El precio sin IVA es: "+ precioSinIva);
        System.out.println("El precio con IVA es: "+ precioMasIva(precioSinIva));

    }
    static double precioMasIva(double precio){
        double impuesto = precio * 0.19;
        System.out.println("IVA 19% de este artículo: " + impuesto);
        return precio + impuesto;
    }
}
