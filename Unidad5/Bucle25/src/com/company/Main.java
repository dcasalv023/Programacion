//Realiza un programa que pida un número por teclado y que luego muestre ese
//número al revés.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numeroInt;

        System.out.println("Por favor introduzca un numero entero: ");
        numeroInt = reader.nextInt();

        int numero = numeroInt, volteado = 0;

        while ( numero > 0 ) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }

        System.out.print("Si le damos la vuelta al " + numeroInt);
        System.out.println(" tenemos el " + volteado + ".");
    }
}