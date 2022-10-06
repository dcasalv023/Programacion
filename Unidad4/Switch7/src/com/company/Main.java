//Realiza un programa que calcule la media de tres notas.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1, n2, n3, Resultado;

        System.out.println("Por favor dime la primera nota: ");
        n1 = reader.nextInt();

        System.out.println("Por favor dime la segunda nota: ");
        n2 = reader.nextInt();

        System.out.println("Por favor dime la tercera nota: ");
        n3 = reader.nextInt();

         Resultado = (n1 + n2 + n3) / 3;
        System.out.print("La media de las tres notas es: " + Resultado);
    }
}