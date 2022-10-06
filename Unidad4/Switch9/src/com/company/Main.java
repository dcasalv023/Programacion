//Realiza un programa que resuelva una ecuación de segundo grado (del tipo
//ax2 + bx + c = 0).
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b, c, discriminante;

        System.out.println("Este programa va a resolver una ecuación de segundo grado: ax2 + bx + c = 0 ");

        System.out.println("Por favor introduce el valor de a: ");
        a = reader.nextInt();

        System.out.println("Por favor introduce el valor de b: ");
        b = reader.nextInt();

        System.out.println("Por favor introduce el valor de c: ");
        c = reader.nextInt();

        if (a == 0 && b == 0 && c == 0){
            System.out.println("Esta ecuación tiene infinitas soluciones");
        }

        if (a == 0 && b == 0 && c != 0){
            System.out.println("Esta ecuación no tiene solución");
        }

        if (a != 0 && b != 0 && c == 0){
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }

        if (a == 0 && b != 0 && c != 0){
            System.out.println("x1 = x2 " + (-c / b));
        }

        if (a != 0 && b != 0 && c != 0){
             discriminante = b*b - (4 * a * c);

            if (discriminante < 0){
                System.out.println("La ecuación no tiene solución reales");
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a) );
                System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
            }
        }
    }
}