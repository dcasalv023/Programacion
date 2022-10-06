//Escribe un programa que diga si un número introducido por teclado es o no
//primo. Un número primo es aquel que sólo es divisible entre él mismo y la
//unidad.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numint;
        boolean primo = true;

        System.out.println("Por favor introduzca un número y le dire si es primo o no: ");
        numint = reader.nextInt();

        for (int i = 2; i < numint; i++) {
            if ((numint % i) == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }

        

    }
}
