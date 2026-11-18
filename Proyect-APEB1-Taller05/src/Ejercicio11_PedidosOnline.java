import java.util.Scanner;

/**
 * Ejercicio 11: "Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un artículo del cual 
 * se tiene la descripción, la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 
 * unidades, se hace un descuento de 15%."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese descripción del artiículo: ");
        String descripcion = tcl.nextLine();
        System.out.print("Ingrese la cantidad requerida: ");
        int cantidad = tcl.nextInt();
        System.out.print("Ingrese precio unitario: ");
        double precio = tcl.nextDouble();
        
        double costo = precio * cantidad;
        
        System.out.printf("\n------------ Costo del pedido ----------\n");
        System.out.printf("Desc.: \t%S \nCant.: \t%d \nPrecio unit.: \t$%.2f \n", descripcion, cantidad, precio);
        
        if (cantidad > 50) {
            double descuento = costo * 0.15;
            costo -= descuento;
            System.out.printf("--- Aplica descuento (15%% = $%.2f) por cantidad de unidades ---", descuento);
        }
        
        System.out.printf("\n\t\tCosto: $%.2f\n", costo);
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese descripcion del articulo: helado de manzana
Ingrese la cantidad requerida: 150
Ingrese precio unitario: 3,50

------------ Costo del pedido ----------
Desc.: 	HELADO DE MANZANA 
Cant.: 	150 
Precio unit.: 	$3,50 
--- Aplica descuento (15% = $78,75) por cantidad de unidades ---
		Costo: $446,25
BUILD SUCCESSFUL (total time: 35 seconds)
 */