//Realiza un programa que pinte una pirámide por pantalla. La altura se debe
//pedir por teclado. El carácter con el que se pinta la pirámide también se debe
//pedir por teclado.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int espacio = 0, cantidad = 1, altura;
        String caracter;

        System.out.println("Introduzca por favor cualquier caracter para poder dibujar la pirámide: ");
        caracter = reader.next();

        System.out.println("Introduzca por favor la altura de esta pirámide: ");
        altura = reader.nextInt();

        for (int i = 0; i < altura; i++) {
            espacio++;
        }
        System.out.println();

        for (int i = 0; i < altura; i++) {
            for (int n = 0; n < espacio; n++) {
                System.out.print(" ");
            }
            espacio--;

            for (int n = 1; n <= cantidad; n++) {
                System.out.print(caracter);
            }

            cantidad += 2;
            System.out.println();
        }
    }
}