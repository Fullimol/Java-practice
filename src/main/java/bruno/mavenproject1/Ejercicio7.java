/*
[A.07] ¿Cuántos días viviste?
Hacer un programa que pida por pantalla la fecha de nacimiento de una persona (día, mes
y año) y calcule el número de días vividos por esa persona hasta la fecha actual (tomar la fecha del sistema
con LocalDateTime.now()).
Nota: Utilizar estructuras selectivas. Tener en cuenta los años bisiestos
 */
package bruno.mavenproject1;

import java.time.LocalDateTime;



/*
               ¡¡¡¡¡¡¡       EJRCICIO  INCOMPLETO     !!!!!!!!!!!
*/



public class Ejercicio7 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 7 ------");
        LocalDateTime fechaActual = LocalDateTime.now();
        
        int anio = fechaActual.getYear();
        int mes = fechaActual.getMonthValue();
        int dia = fechaActual.getDayOfMonth();
        
        System.out.println("Fecha actual: " + dia + "/" + mes + "/" + anio);
    }
}
