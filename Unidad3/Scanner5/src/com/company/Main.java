package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	    double largo, ancho;

	    System.out.println("Por favor introduzca lo que vale el ancho del rectángulo: ");
        ancho = reader.nextInt();

        System.out.println("Por favor introduzca lo que vale el largo del rectángulo: ");
        largo = reader.nextInt();

        System.out.println(largo * ancho);
    }
}
