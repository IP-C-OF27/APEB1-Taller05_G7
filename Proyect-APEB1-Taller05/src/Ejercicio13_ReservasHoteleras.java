import java.util.Scanner;

/**
 * Ejercicio 13: "Sistema de reservas hoteleras: En una hostería de la ciudad de Loja se hace un descuento del 10% 
 * si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 
 * días. Elaborar una solución que pida el número de días y el precio diario de la habitación y luego calcule e 
 * imprima el subtotal por pagar, el descuento y el total por pagar."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio13_ReservasHoteleras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese número de dias de estadía: ");
        int dias = tcl.nextInt();
        System.out.print("Ingrese precio diario de la habitación: $");
        double precioDiario = tcl.nextInt();
        
        double subtotal = dias * precioDiario, descuento = 0;
        if (dias > 15){
            descuento = subtotal * 0.2;
            System.out.println("    Aplicable descuento del 20%.");
        }
        else {
            if (dias > 10){
                descuento = subtotal * 0.15;
                System.out.println("    Aplicable descuento del 15%.");
            }
            else
                if (dias > 5){
                    descuento = subtotal * 0.1;
                    System.out.println("    Aplicable descuento del 10%.");
                }
        }
        
        double total = subtotal - descuento;
        
        System.out.println("-------------- Factura Hostería --------------");
        System.out.printf("Subtotal: \t $%.2f \nDescuento: \t-$%.2f \n\nTotal a pagar: \t $%.2f \n", subtotal, 
                descuento, total);
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese n�mero de dias de estad�a: 17
Ingrese precio diario de la habitaci�n: $40
    Aplicable descuento del 20%.
-------------- Factura Hoster�a --------------
Subtotal: 	 $680,00 
Descuento: 	-$136,00 

Total a pagar: 	 $544,00 
BUILD SUCCESSFUL (total time: 15 seconds)
 */