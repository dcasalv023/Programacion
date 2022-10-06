package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double pesetas,euros;

        System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
        euros = reader.nextInt();

        pesetas = euros / 0.0060;

        System.out.println(euros + " euros son " + pesetas + " pesetas");
    }
}
