/*
[A.03] Números primos
Mostrar por pantalla todos los números primos que haya hasta el número que ingrese el
usuario por 2 consola.
Nota: Utilizar estructuras repetitivas, selectivas y la función módulo (%).
 */
package bruno.mavenproject1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("------ EJERCICIO 3 ------");
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numeroIngresado = numero.nextInt();
        
        System.out.println("Numeros primos hasta " + numeroIngresado + ":");
        //recorrer desde el 2 hasta el num ingresado
        for (int i = 2; i <= numeroIngresado; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        numero.close();
    }
    
    public static boolean esPrimo(int num){
        if (num <= 1) {
                return false;
            }
        for (int i = 2; i <= Math.sqrt(num); i++) { //El método Math.sqrt(num) en Java se utiliza para calcular la raíz cuadrada de un número.
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
