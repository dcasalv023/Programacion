//Realiza un programa que nos diga cuántos dígitos tiene un número introducido
//por teclado.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        long numeroIntroducido = reader.nextInt();

        long n = numeroIntroducido;
        int numeroDeDigitos = 1;

        while (n > 10) {
            numeroDeDigitos++;
            n /= 10;
        }

        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
    }
}
