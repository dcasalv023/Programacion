//Escribe un programa que calcule el factorial de un número entero leído por
//teclado.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        long factorial = 1;
        int num;

        System.out.println("Por favor introduce un número: ");
        num = reader.nextInt();

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}