//Escribe un programa que, dado un número entero, diga cuáles son y cuánto
//suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
//izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
//números largos.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long numBasura = 0, reves = 0,dig, suma = 0;
        int numDig = 0;
        System.out.print("Introduce un número: ");
        long numUs = reader.nextLong();
        System.out.print("Los dígitos pares son: ");

        while ( numBasura > 0 ){
            reves = ((reves * 10) + (numBasura % 10));
            numBasura /=10;
            numDig++;
        }

        for (int i = 0; i < numDig ; i++){
            dig = reves % 10;
            if (dig%2 == 0){
                System.out.print(dig+" ");
                suma += dig;
            }
            reves /= 10;
        }
        System.out.print("La suma de los dígitos pares, es: " +suma);
    }
}
