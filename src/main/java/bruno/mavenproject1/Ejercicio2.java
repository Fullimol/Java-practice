/*
[A.02] Potencias
Ingresar un número y mostrar: el cuadrado y el cubo del mismo.
Se debe validar que el número sea mayor que cero, caso contrario, mostrar
el mensaje: "ERROR. ¡Reingresar número!".
Nota: Utilizar el método ‘pow’ de la clase Math para realizar la operación
*/
package bruno.mavenproject1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 2 ------");
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        double numeroIngresado = numero.nextDouble();
        
        while (numeroIngresado <= 0) {
            System.out.println("ERROR. Reingresar Numero!");
            System.out.print("Ingrese el numero: ");
            numeroIngresado = numero.nextDouble();
        } 

            //mostrar el cuadro y el cubo.
            double cuadrado = Math.pow(numeroIngresado, 2);
            double cubo = Math.pow(numeroIngresado, 3);
            
            System.out.println("valor al cuadrado: " + cuadrado);
            System.out.println("valor al cubo: " + cubo);
        
        numero.close();
    }
}
