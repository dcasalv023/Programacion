//Escribe un programa que calcule el área de un rectángulo.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double base, altura;

        System.out.println("Por favor introduzca lo que vale la base del triángulo: ");
        base = reader.nextInt();
        System.out.println("Por favor introduzca lo que vale la altura del triángulo: ");
        altura = reader.nextInt();

        System.out.println( (base*altura)/2);
    }
}
