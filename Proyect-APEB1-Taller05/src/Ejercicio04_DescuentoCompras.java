
import java.util.Scanner;
/**
 * Ejercicio 01: "Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100 ; 
 * De lo contrario, no hay descuento."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        double precioproducto,preciofinal,factura;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme precio: ");
        precioproducto=tcl.nextDouble();
        factura=precioproducto;
        if(precioproducto > 100);
        factura= precioproducto *(precioproducto -10/100);
        System.out.println("");
        
        
        
        
        
                
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */