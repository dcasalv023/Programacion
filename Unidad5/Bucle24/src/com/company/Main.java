//Escribe un programa que lea un número n e imprima una pirámide de números
//con n filas como en la siguiente figura:
//1
//121
//12321
//1234321
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int altura = 1, i, espacios = 0, alturaIntroducida;

        System.out.println("Este programa pinta una pirámide hecha a base de números.");
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
         alturaIntroducida = reader.nextInt();

        while (altura <= alturaIntroducida) {

            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacios--;
        }
    }
}
