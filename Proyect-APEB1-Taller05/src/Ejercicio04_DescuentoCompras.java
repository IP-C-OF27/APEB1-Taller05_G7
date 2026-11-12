import java.util.Scanner;
/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100 ; 
 * De lo contrario, no hay descuento."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */
public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        double precioProducto;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme precio: ");
        precioProducto=tcl.nextDouble();
        if(precioProducto > 100);
        precioProducto *= 0.9;
        System.out.println("El precio total es: "+ precioProducto);               
    }
}
/***
 * EVIDENCIA DEL RUN:
Deme precio: 
250
El precio total es: 225.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */