//Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
//entre 1 y un número leído por teclado.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numeroIntroducido, cuenta = 0, suma = 0;

        System.out.print("Introduzca un número entero mayor que 1: ");
        numeroIntroducido = reader.nextInt();

        for (int i = 1; i < numeroIntroducido; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + " ");
                cuenta++;
                suma += i;
            }
        }

        System.out.println("Desde 1 hasta " + numeroIntroducido + " hay " + cuenta);
        System.out.println(" múltiplos de 3 y suman " + suma + ".");
    }
}