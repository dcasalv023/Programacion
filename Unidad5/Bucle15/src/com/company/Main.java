//Escribe un programa que dados dos números, uno real (base) y un entero
//positivo (exponente), saque por pantalla todas las potencias con base el
//numero dado y exponentes entre uno y el exponente introducido. No se deben
//utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
//se deberán mostrar 21 , 22 , 23 , 24 y 25 .
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int base, potencia = 1, exponente = 1, exponenteFinal;

        System.out.println("Por favor introduzca el valor de la base: ");
        base = reader.nextInt();

        System.out.println("Por favor introduzca el valor del exponente máximo: ");
        exponenteFinal = reader.nextInt();

        for (int i = 1; i <= exponenteFinal; i++) {

            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }

            System.out.println(base + "^" + i + " = " + potencia);
        }
    }
}
