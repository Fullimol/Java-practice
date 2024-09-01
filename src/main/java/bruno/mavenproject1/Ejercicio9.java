/*
[A.09] Dibujando un triángulo rectángulo
Escribir un programa que imprima por pantalla una pirámide como la siguiente:
*
***
*****
*******
*********
El usuario indicará cuál será la altura de la pirámide ingresando un número entero positivo.
Para el ejemplo anterior la altura ingresada fue de 5.
Nota: Utilizar estructuras repetitivas y selectivas.
 */
package bruno.mavenproject1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 9 ------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura: ");
        int altura = scanner.nextInt();
        
        for (int i = 1; i <= altura; i++){
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}