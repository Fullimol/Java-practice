package bruno.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double num1 = numero.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = numero.nextDouble();
        
        double resultado = num1 + num2;
        
        if (resultado > 0 ) {
            System.out.println("Es resultado es positivo = " + resultado);
        } else if (resultado < 0){
            System.out.println("Es resultado es negativo = " + resultado);
        } else {
            System.out.println("Es resultado es cero = " + resultado);
        }
        
        numero.close();
    }
}