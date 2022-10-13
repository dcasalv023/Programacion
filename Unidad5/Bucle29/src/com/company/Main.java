//Escribe un programa que muestre por pantalla todos los números enteros
//positivos menores a uno leído por teclado que no sean divisibles entre otro
//también leído de igual forma.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numeroGrande, numeroPeque, cuenta, suma;
        System.out.print("Introduzca un número entero positivo más grande : ");
         numeroGrande = reader.nextInt();

        System.out.print("Introduzca otro número más pequeño : ");
         numeroPeque = reader.nextInt();

        System.out.print("Los números enteros positivos menores que " + numeroGrande );
        System.out.println(" que no son divisibles entre " + numeroPeque + " son los siguientes:");

         cuenta = 0;
         suma = 0;

        for (int i = 1; i < numeroGrande; i++) {
            if ((i % numeroPeque) != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
