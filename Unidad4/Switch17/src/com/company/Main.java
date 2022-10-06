//Escribe un programa que diga cuál es la última cifra de un número entero
//introducido por teclado
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);{

            int n;
            System.out.println("Por favor introduzca un número entero: ");
            n = reader.nextInt();
            System.out.println("La última cifra del número introducido es el " + (n % 10));
        }
    }

}