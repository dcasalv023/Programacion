// Realiza un programa que nos diga cuántos dígitos tiene un número entero que
//puede ser positivo o negativo. Se permiten números de hasta 5 dígitos
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, digitos = 0;

        System.out.print("Por favor, introduzca un número entero como máximo de cinco cifras: ");
        n = reader.nextInt();

        if ( n < 10 ) {
            digitos = 1;
        }

        if ( n >= 10  &&  n < 100 ) {
            digitos = 2;
        }

        if ( n >= 100  &&  n < 1000 ) {
            digitos = 3;
        }

        if ( n >= 1000  &&  n < 10000 ) {
            digitos = 4;
        }

        if ( n >= 10000 ) {
            digitos = 5;
        }

        if (digitos == 1) {
            System.out.println("El número introducido tiene 1 dígito.");
        } else {
            System.out.println("El número introducido tiene " + digitos + " dígitos.");
        }
    }
}