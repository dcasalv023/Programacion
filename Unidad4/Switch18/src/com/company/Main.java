//Escribe un programa que diga cuál es la primera cifra de un número entero
//introducido por teclado. Se permiten números de hasta 5 cifras.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n, primera = 0;

        System.out.print("Por favor, introduzca un número entero positivo de cinco cifras como máximo: ");
        n = reader.nextInt();

        if ( n < 10 ) {
            primera = n;
        }

        if ( n >= 10  &&  n < 100 ) {
            primera = n / 10;
        }

        if ( n >= 100  &&  n < 1000 ) {
            primera = n / 100;
        }

        if ( n >= 1000  &&  n < 10000 ) {
            primera = n / 1000;
        }

        if ( n >= 10000 ) {
            primera = n / 10000;
        }

        System.out.println("La primera cifra del número introducido es el " + primera + ".");
    }
}
