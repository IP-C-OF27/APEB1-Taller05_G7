import java.util.Scanner;

/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 
 * 90-100, B para 80-89, etc.)."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese una calificacion (0-100): ");
        int nota = tcl.nextInt();
        System.out.print(nota + " = ");
        if (100 >= nota && nota >= 90)
            System.out.println("A");
        else
            if (90 > nota && 80 <= nota)
                System.out.println("B");
            else
                if (80 > nota && 70 <= nota)
                    System.out.println("C");
                else
                    if (70 > nota && 0 <= nota)
                        System.out.println("D");
                    else
                        System.out.println("Calificacion no valida.");
        }
    }

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese una calificacion (0-100): 79
79 = C
BUILD SUCCESSFUL (total time: 2 seconds)
 */