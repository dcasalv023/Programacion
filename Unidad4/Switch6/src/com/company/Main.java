//ealiza un programa que calcule el tiempo que tardará en caer un objeto desde
//una altura h. Aplica la fórmula t =
//√ 2h g siendo g = 9.81m/s2
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double h, t;
        final double g = 9.81;

        System.out.println("Dime la altura en metros en la que cae el objeto: ");
        h = reader.nextDouble();

         t = Math.sqrt((2 * h) / g);
        System.out.println("Un objeto a una altura de " + h + " metros, tarda " + t + " segundos en caer");
    }
}



