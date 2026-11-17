import java.util.Scanner;
/**
 * Ejercicio 10:"Valores pares o impares: Dado un valor entero ingresado por 
 teclado (positivo o negativo) , determine si se trata de un valor par o impar"
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */
public class Ejercicio10_Valoresparesimpares 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        int num;
        System.out.print("Ingrese el numero: ");
        num = tcl.nextInt();
        num %= 2;
        if (num == 0)
            System.out.println("Par");
        else 
            System.out.println("Impar");
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese el numero: 7
Impar
BUILD SUCCESSFUL (total time: 3 seconds)
 */
