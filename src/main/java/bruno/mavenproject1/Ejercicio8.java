/*
[A.08] Recibos de sueldo
Por teclado se ingresa el valor hora, el nombre, la antigüedad (en años) y la cantidad de
horas trabajadas en el mes de N empleados de una fábrica.
Se pide calcular el importe a cobrar teniendo en cuenta que el total (que resulta de multiplicar
el valor hora por la cantidad de horas trabajadas), hay que sumarle la cantidad de años
trabajados multiplicados por $51000, y al total de todas esas operaciones restarle el 13% en
concepto de descuentos.
Mostrar el recibo correspondiente con el nombre, la antigüedad, el valor hora, el total a cobrar
en bruto, el total de descuentos y el valor neto a cobrar de todos los empleados ingresados.
Nota: Utilizar estructuras repetitivas y selectivas.
 */
package bruno.mavenproject1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 8 ------");
        Scanner scanner = new Scanner(System.in);
       
        while (true){
            System.out.print("Ingrese el nombre (o 'salir' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Ingrese el valor x hora: ");
            int valorHora = scanner.nextInt();
            System.out.print("Anios de antiguedad: ");
            int aniosAntiguedad = scanner.nextInt();
            System.out.print("Horas trabajadas en el mes: ");
            int horasEnElMes = scanner.nextInt();
            
            int valorPorMes = valorHora * horasEnElMes;
            //int valorTotal = valorPorMes * aniosAntiguedad * 12;
            int valorTotal = valorPorMes + aniosAntiguedad * 51000;
            double valorDescuento = valorTotal * 0.13;
            
            scanner.nextLine(); // Limpiar el buffer para leer una nueva entrada.
            
            System.out.println(" ");
            System.out.println("******* RECIBO *******");
            System.out.println("Nombre: " + nombre);
            System.out.println("Antiguedad: " + aniosAntiguedad);
            System.out.println("Valor hora: $" + valorHora);
            System.out.println("Total bruto: $" + valorTotal);
            System.out.println("Total de descuento: -$" + valorDescuento);
            System.out.println("Valor NETO: $" + (valorTotal - valorDescuento));
            System.out.println("**********************");
            System.out.println(" ");
            
        }
        scanner.close();
    }
}
