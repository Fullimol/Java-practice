/*
[A.07] ¿Cuántos días viviste?
Hacer un programa que pida por pantalla la fecha de nacimiento de una persona (día, mes
y año) y calcule el número de días vividos por esa persona hasta la fecha actual (tomar la fecha del sistema
con LocalDateTime.now()).
Nota: Utilizar estructuras selectivas. Tener en cuenta los años bisiestos
 */
package bruno.mavenproject1;

import static bruno.mavenproject1.Ejercicio6.esBisiestro;
import java.time.LocalDateTime;
import java.util.Scanner;

/*
               ¡¡¡¡¡¡¡       EJRCICIO  INCOMPLETO     !!!!!!!!!!!
*/

public class Ejercicio7 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 7 ------");
        LocalDateTime fechaActual = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        
        /*
        System.out.print("Ingrese dia: ");
        int diaIngresado = scanner.nextInt();
        System.out.print("Ingrese mes: ");
        int mesIngresado = scanner.nextInt();
        */
        System.out.print("Ingrese anio nacimiento: ");
        int anioIngresado = scanner.nextInt();
        
        int anioActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();
        
        int diasVividos = 0;
        
       
        // System.out.println("Fecha Ingresada: " + diaIngresado + "/" + mesIngresado + "/" + anioIngresado);
        System.out.println("Fecha actual: " + diaActual + "/" + mesActual + "/" + anioActual);
        
        
        /*
        for(int i = 1; i < mesActual + 1; i++){
            diasVividos += 30;
        }
        */
        
        // paso los años desde X hasta el actual en días.
        for (int i = anioIngresado; i <= anioActual; i++) {
            if (esBisiestro(i)) {
                diasVividos += 366;
            } else {
                diasVividos += 365;
            }
        }
        
        System.out.println("Has vivido " + diasVividos + " dias.");
        scanner.close();
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
