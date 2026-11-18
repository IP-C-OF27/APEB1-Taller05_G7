import java.util.Scanner;

/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio09_OrdenarNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese tres numeros: ");
        int num1 = tcl.nextInt(), num2 = tcl.nextInt(), num3 = tcl.nextInt(), mayor, medio, menor;
        if (num1 > num2) {
             mayor = num1;
             menor = num2;
        }
        else {
            mayor = num2;
            menor = num1;
        }
        
        if (mayor < num3) {
            medio = mayor;
            mayor = num3;
        }
        else 
            medio = num3;
        
        if (medio < menor) {
            num1 = medio;
            medio = menor;
            menor = num1;
        }   
        
        System.out.println("Orden ascendente: " + menor + " < " + medio + " < " + mayor);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese tres numeros: 3 1 2
Orden ascendente: 1 < 2 < 3
BUILD SUCCESSFUL (total time: 2 seconds)
 */