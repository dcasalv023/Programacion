//Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
//muestre por pantalla separados por espacios. El programa pedirá entonces
//por teclado dos valores y a continuación cambiará todas las ocurrencias del
//primer valor por el segundo en la lista generada anteriormente. Los números
//que se han cambiado deben aparecer entrecomillados.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] array = new int[100];
        int num1;
        int num2;

        for (int i = 0; i < 100; i++) {
            array[i] = ((int)(Math.random()*20)+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Dime el numero que quieres cambiar: ");
        num1 = reader.nextInt();

        System.out.println("Dime el numero por el que lo vas cambiar: ");
        num2 = reader.nextInt();

        for (int i = 0; i < 100; i++) {
            if (array[i] == num1) {
                System.out.print("'"+num2+"' ");
            }
            else {
                System.out.print(array[i]+" ");
            }
        }
    }
}
