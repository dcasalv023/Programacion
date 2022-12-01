//Realiza un programa que pida 8 números enteros y que luego muestre esos
//números junto con la palabra “par” o “impar” según proceda.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[] num = new int[8];
        System.out.print("Introduce 8 numeros: ");

        num [0] = reader.nextInt();
        num [1] = reader.nextInt();
        num [2] = reader.nextInt();
        num [3] = reader.nextInt();
        num [4] = reader.nextInt();
        num [5] = reader.nextInt();
        num [6] = reader.nextInt();
        num [7] = reader.nextInt();

        for (int i = 0; i<=7; i++){

            if (num[i] %2==0){
                System.out.println(num[i] + " Es par");
            }else System.out.println(num[i] + " Es impar");
        }
    }
}