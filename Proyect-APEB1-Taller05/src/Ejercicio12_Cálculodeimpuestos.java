import java.util.Scanner;
/**
 * Ejercicio 12: "Cálculo de impuestos: Desarrollar una solución que permita 
 leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por 
 pagar y el precio de venta (incluido el impuesto) . Si el origen es Alemania 
 el impuesto es 20% , si es de Japón el impuesto es 30% , si es de Italia, 15%,
 y si es de USA, 8%"
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */
public class Ejercicio12_Cálculodeimpuestos
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double costo,impuesto,costoTotal;
        String marca, origen;
        System.out.println("Ingrese la marca del vehículo: ");
        marca=tcl.nextLine();
        System.out.println("Ingrese el origen del vehiculo: ");
        origen= tcl.nextLine();
        System.out.println("Ingrese el costo del vehiculo: ");
        costo= tcl.nextDouble();
        switch (origen) {
            case "Alemania":
                impuesto= costo*0.20;
                break;
            case "Japón":
                impuesto= costo*0.30;
                break;
            case "Italia":
                impuesto= costo*0.15;
                break;
            case "USA":
                impuesto= costo*0.08;                
                break;
            default:
                impuesto=0;
        }
        costoTotal = costo + impuesto;
        System.out.printf("El impuesto a pagar es: $%.2f\n ",impuesto);
        System.out.printf("El valor total es: $%.2f\n",costoTotal); 
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese la marca del veh�culo: 
Hyundai
Ingrese el origen del vehiculo: 
Italia
Ingrese el costo del vehiculo: 
18.990
El impuesto a pagar es: $2848,50
 El valor total es: $21838,50
BUILD SUCCESSFUL (total time: 16 seconds)
 */