/*
[A.06] Bis sextus dies ante calendas martii
Escribir un programa que determine si un año es bisiesto.
Un año es bisiesto si es múltiplo de 4. Los años múltiplos de 100 no son bisiestos, salvo si
ellos también son múltiplos de 400. Por ejemplo: el año 2000 es bisiesto pero 1900 no.
Pedirle al usuario un año de inicio y otro de fin y mostrar todos los años bisiestos en ese
rango.
Nota: Utilizar estructuras repetitivas, selectivas y la función módulo (%)
 */
package bruno.mavenproject1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio6 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 6 ------");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Anio de inicio: ");
            int anioInicial = scanner.nextInt();
            while (!validarAnio(anioInicial)){
                System.out.print("Ingrese anio de inicio correcto: ");
                anioInicial = scanner.nextInt();
            }
            System.out.print("Anio final: ");
            int anioFinal = scanner.nextInt();
            while (!validarAnio(anioFinal)){
                System.out.print("Ingrese anio de final correcto: ");
                anioInicial = scanner.nextInt();
            }
            
            System.out.println("Los anios bisisestros desde " + anioInicial + " hasta " + anioFinal + " son: ");
            for(int i = anioInicial; i < anioFinal + 1; i++){
                if(esBisiestro(i)){
                    System.out.println(i);
                }
            }
        } catch (InputMismatchException e){
            System.out.print("Dato ingresado incorrecto.");
            scanner.next();
        };
        
        scanner.close();
    }
    
    public static boolean validarAnio (int anio) {
        if (anio > 9999 || anio < 999) {
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean esBisiestro(int anio){
        /*
        Si el año es divisible por 4, se verifica si también es divisible por 100. Si es así, el año podría no ser bisiesto. 
        Si el año es divisible por 100, se verifica si también es divisible por 400. 
        Si es divisible por 400, el año es bisiesto (true), de lo contrario, no lo es (false).
        */
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                return anio % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    } 
}
