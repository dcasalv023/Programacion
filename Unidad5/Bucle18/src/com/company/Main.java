//Escribe un programa que obtenga los números enteros comprendidos entre
//dos números introducidos por teclado y validados como distintos, el programa
//debe empezar por el menor de los enteros introducidos e ir incrementando de
//7 en 7.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);{
            int num1, num2;

           do{
               System.out.println("Por favor introduce el primer número: ");
               num1 = reader.nextInt();

               System.out.println("Por favor introduce un segundo número distinto al otro: ");
               num2 = reader.nextInt();

               if(num1 == num2) {
                   System.out.print("Los números que has puesto no son válidos, ");
                   System.out.println(" los números deben ser distintos.");
               }
           } while (num1 == num2);
            if (num1 > num2) {
                int aux = num1;
                num1 = num2;
                num2 = aux;
            }
            for(int i = num1; i <= num2; i += 7) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


