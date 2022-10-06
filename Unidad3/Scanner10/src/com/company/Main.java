//Realiza un conversor de Mb a Kb.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double mb, kb;

        System.out.println("Por favor introduzca el número de  los megabytes: ");
        mb = reader.nextInt();

        System.out.println(mb + "mb son " + (mb * 1000) + "kb");
    }
}