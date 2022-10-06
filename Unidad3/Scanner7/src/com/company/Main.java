package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double IVA, importe,precioFinal;

        System.out.println("Por favor dime lo que te ha costado la compra: ");
        importe = reader.nextInt();

        IVA = importe*0.21;

        precioFinal = importe + IVA;

        System.out.println("El precio final de la compra es: " + precioFinal);


    }
}
