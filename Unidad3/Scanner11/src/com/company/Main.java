//Realiza un conversor de Kb a Mb.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double  kb;

        System.out.println("Por favor introduzca el número de  los kilobytes: ");
        kb = reader.nextInt();

        System.out.println(kb + "kb son " + (kb * 0.001) + "mb");
    }
}