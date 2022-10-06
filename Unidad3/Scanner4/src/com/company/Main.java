//Escribe un programa que sume, reste, multiplique y divida dos números
//introducidos por teclado.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x, y;


        System.out.print("Por favor, introduzca el primer número: ");
        x = reader.nextInt();
        System.out.print("Introduzca el segundo número: ");
        y = reader.nextInt();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x * y = " + (x * y));
    }
}
