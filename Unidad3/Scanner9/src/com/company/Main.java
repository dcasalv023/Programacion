//Escribe un programa que calcule el volumen de un cono según la fórmula V =
//(1/3)*π*r2*h
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double PI = 3.141592654;
        double altura, radio;

        System.out.println("Por favor introduzca la altura del cono: ");
        altura = reader.nextDouble();

        System.out.println("Por favor introduzca el radio de la base del cono: ");
        radio = reader.nextDouble();

        System.out.println("El volumen del cono es de: " + (1.0/3.0) * PI * radio * radio * altura + " cm3");

    }
}