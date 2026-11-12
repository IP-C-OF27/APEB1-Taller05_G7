import java.util.Scanner;

/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos, determinar cuál es el mayor."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio03_MayorNumero {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Escribe 3 numeros: ");
        int n1 = tcl.nextInt(), n2 = tcl.nextInt(), n3 = tcl.nextInt(), mayor;
        
        if (n1 > n2)
            mayor = n1;
        else 
            mayor = n2;
        if (mayor < n3)
            mayor = n3;
        
        System.out.println("Mayor: " + mayor);    
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
<<<<<<< HEAD
Deme edad: 15
No legible para votar.
BUILD SUCCESSFUL (total time: 3 seconds)
 */ 
=======
Escribe 3 numeros: 2 3 1
Mayor: 3
BUILD SUCCESSFUL (total time: 6 seconds)
 */
>>>>>>> b74c223267bb630fc56c715c466bc49979674634
