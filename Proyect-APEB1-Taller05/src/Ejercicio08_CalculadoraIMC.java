import java.util.Scanner;
/**
 * Ejercicio 08: "Calculadora de IMC: Calcula el índice de masa corporal (IMC) 
de una persona y la clasifica en función de su valor (bajo peso, peso normal, 
sobrepeso, etc.)"
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */
public class Ejercicio08_CalculadoraIMC 
{
    public static void main(String[] args) 
    {
        double IMC,peso,estatura;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su peso: ");
        peso= tcl.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura= tcl.nextDouble();
        IMC = peso / (estatura*estatura);
        if (IMC < 18.5){
            System.out.println("Clasificación: Bajo peso");
        }
        else if (IMC < 25){
        System.out.println("Clasificación: Peso normal");
        }
        else if (IMC < 30){
        System.out.println("Clasificación:Sobrepeso");
        }
        else{ 
        System.out.println("Clasificación:Obesidad");
        }
    }    
}
/***
 * EVIDENCIA DEL RUN:
Ingrese su peso: 
50
Ingrese su estatura
1,54
Clasificaci�n: Peso normal
BUILD SUCCESSFUL (total time: 13 seconds)
 */