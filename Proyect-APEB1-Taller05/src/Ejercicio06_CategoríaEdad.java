import java.util.Scanner;
/**
 * Ejercicio 04: "Categoría de Edad: Clasificar a una persona en una categoría 
 de edad (niño, adolescente, adulto) en función de su edad."
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */
public class Ejercicio06_CategoríaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme su edad: ");
        int edad = tcl.nextInt();
        if (edad < 11)
            System.out.println("Categoria niño");
        else
        if (edad < 18)
            System.out.println("Categoría adolescente");
        else 
            System.out.println("Categoria adulta");      
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Deme su edad: 
4
Categoria ni�o
BUILD SUCCESSFUL (total time: 4 seconds)
 */