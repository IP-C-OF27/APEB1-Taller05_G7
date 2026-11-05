import java.util.Scanner;

/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en 
 * función del número ingresado (1 para lunes, 2 para martes, etc.)"
 * @author Kenny Gualán, Tamara Fernández
 * @version 1.0
 */

public class Ejercicio02_DíaSemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme numero del día(1-7):");
        int dia = tcl.nextInt();
        String mensajeDia;
        switch (dia) 
        {
            case 1:
                mensajeDia= "Lunes";
                break;
            case 2:
                mensajeDia= "Martes";
                break;
            case 3:
                mensajeDia= "Miercoles";
                break;
            case 4:
                mensajeDia= "Jueves";
                break;
            case 5:
                mensajeDia= "Viernes";
                break;
            case 6:
                mensajeDia= "Sábado";
                break;
            case 7:
                mensajeDia= "Domingo";
                break;
            default:
                mensajeDia="error";
                throw new AssertionError();
        }
        System.out.println("El numero:"+ dia +"Corresponde a: "+ mensajeDia);     
        }
        
    }
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */