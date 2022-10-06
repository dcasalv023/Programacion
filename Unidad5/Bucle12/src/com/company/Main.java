//Escribe un programa que muestre los n primeros términos de la serie de
//Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
//y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
//los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
//debe introducir por teclado
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = 0, b = 1, c, n;

        System.out.println("Por favor introduzca a continuación una cantidad de elementos para la serie: ");
        n = reader.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}