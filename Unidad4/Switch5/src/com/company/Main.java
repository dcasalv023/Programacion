//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0)
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       int a, b;

        System.out.println("Introduce el valor de a: ");
        a = Integer.parseInt(reader.next());

        System.out.println("Introduce el valor de b: ");
        b = Integer.parseInt(reader.next());

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + -b/a);
        }
    }
}
