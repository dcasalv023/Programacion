//Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int altura, cantidad = 1, espacio = 0;
        String caracter;

        System.out.print("Por favor Introduzca el carácter para poder dibujar la pirámide: ");
         caracter = reader.next();

        System.out.print("Por favor Introduzca la altura de la pirámide: ");
         altura = reader.nextInt();


        for (int i = 0; i < altura; i++) {
            espacio++;
        }

        System.out.println();

        for (int i = 1; i <= altura; i++) {

            if (i != altura) {
                for (int n = 0; n < espacio; n++) {
                    System.out.print(" ");
                }
                espacio--;

                for (int n = 1; n <= cantidad; n++) {

                    if ((n == 1) || (n == cantidad)) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                cantidad += 2;
                System.out.println();
            } else {
                for (int n = 0; n < espacio; n++) {
                    System.out.print(" ");
                }
                espacio--;

                for (int n = 1; n <= cantidad; n++) {
                    System.out.print(caracter);
                }
            }
        }
    }
}