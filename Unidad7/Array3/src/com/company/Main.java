//Escribe un programa que lea 10 números por teclado y que luego los muestre
//en orden inverso, es decir, el primero que se introduce es el último en
//mostrarse y viceversa.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int [] inversa = new int[10];
        int i;

        System.out.println("Buenas debes introducir 10 números enteros: ");

        for (i = 0; i < 10; i++){
            inversa [i] = reader.nextInt();
        }

        System.out.println("Estos son los números escritos al revés: ");
        for(i = 9; i >= 0; i--){
            System.out.println(inversa[i]);
        }
    }
}
