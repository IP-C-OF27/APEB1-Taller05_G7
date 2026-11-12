import java.util.Scanner;

/**
 * Ejercicio 01: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, 
 * mostrar un mensaje especial."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = tcl.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
            System.out.println("----- Su año es bisiesto! -----");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un a�o: 1900
BUILD SUCCESSFUL (total time: 11 seconds)
run:
Ingrese un a�o: 2000
----- Su a�o es bisiesto! -----
BUILD SUCCESSFUL (total time: 2 seconds)
 */