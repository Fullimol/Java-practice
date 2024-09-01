/*
[A.10] Dibujando un triángulo equilátero
Partiendo de la base del ejercicio anterior, se pide realizar un programa que imprima por
pantalla una pirámide como la siguiente:
*
***
*****
*******
*********
Nota: Utilizar estructuras repetitivas y selectivas.
 */
package bruno.mavenproject1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 10 ------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura: ");
        int altura = scanner.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
    }
}