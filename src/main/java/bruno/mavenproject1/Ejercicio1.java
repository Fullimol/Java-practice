/*
[A.01] Máximos, mínimos y promedios
Ingresar 5 números por consola, guardandolos
en una variable escalar. Calcular y mostrar: el
valor máximo, el valor mínimo y el promedio.
Utilizar estructuras repetitivas.
*/
package bruno.mavenproject1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("------ EJERCICIO 1 ------");
        
        Scanner numero = new Scanner(System.in);
        double[] numeros = new double[5];
        double suma = 0;
        double valorMaximo = 0;
        double valorMinimo = 0;
        boolean primerNumeroFlag = true;
        
        for (int i = 0; i < 5; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = numero.nextDouble(); //nextDouble() captura ese número y lo devuelve como un valor de tipo double
            suma += numeros[i];
            
            if (numeros[i] > valorMaximo) {
                valorMaximo = numeros[i];
            }
            if (primerNumeroFlag || numeros[i] < valorMinimo) {
                valorMinimo = numeros[i];
            }
            
            primerNumeroFlag = false;
        }
        
        double promedio = suma / 5;
        
        System.out.println("Valor maximo: " + valorMaximo);
        System.out.println("Valor minimo: " + valorMinimo);
        System.out.println("Promedio: " + promedio);
        
        numero.close();
    }
}