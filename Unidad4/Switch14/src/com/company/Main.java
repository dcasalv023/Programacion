//Realiza un programa que diga si un número introducido por teclado es par y/o
//divisible entre 5.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a;

        System.out.println("Por favor introduzca un número: ");
        a = reader.nextInt();

        if (a % 5 == 0 ){
            System.out.println("El número es divisible entre cinco");
        }else System.out.println("El número no es multiplo de 5");
    }
}