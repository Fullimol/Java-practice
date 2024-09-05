/*
[A.04] Números perfectos
Un número perfecto es un entero positivo, que es igual a la suma de todos los enteros
positivos (excluido 3
el mismo) que son divisores del número.
El primer número perfecto es 6, ya que los divisores de 6 son 1, 2 y 3;
y 1 + 2 + 3 = 6. Escribir una aplicación que encuentre los 4 primeros
números perfectos.
Nota: Utilizar estructuras repetitivas y selectivas
 */
package bruno.mavenproject1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 4 ------");

        Scanner scanner = new Scanner(System.in);
        
        //almacenar los números perfectos encontrados
        int[] perfectosEncontrados = new int[4];
        //contador de numeros perfectos encontrados
        int contadorEncontrados = 0;
        
        //inicializo desde el numero 1
        int numero = 1;
        System.out.println("Primeros 4 numeros perfectos: ");
        
        while (contadorEncontrados < 4) {
            if (esPerfecto(numero)) {
                perfectosEncontrados[contadorEncontrados] = numero;
                contadorEncontrados++;
            }
            numero++;
        }
        
        for (int i = 0; i < perfectosEncontrados.length; i++) {
            System.out.println("Numero perfecto encontrado: " + perfectosEncontrados[i]);
        }
        
        scanner.close();
    }
    
    public static boolean esPerfecto(int num){
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }

}
