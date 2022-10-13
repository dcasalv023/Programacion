//Realiza un programa que pida primero un número y a continuación un dígito.
//El programa nos debe dar la posición (o posiciones) contando de izquierda a
//derecha que ocupa ese dígito en el número introducido.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        long numeroInt, numero, volteado = 0;
        int digito, longitud = 0, posicion = 1;

        System.out.println("Por favor introduzca un número entero: ");
        numeroInt = reader.nextLong();

        System.out.println("Por favor introduzca cualquier digito: ");
        digito = reader.nextInt();

        System.out.print("Contando de izquierda a derecha, el " + digito);
        System.out.println(" aparece dentro de " + numeroInt);
        System.out.print("en las siguientes posiciones: ");

        numero = numeroInt;

        numero = numero * 10 + 1;

        if ( numero == 0 ) {
            longitud = 1;
        }

        while ( numero > 0 ) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        while ( volteado != 1 ) {
            if ((volteado % 10) == digito) {
                System.out.print(posicion + " ");
            }
            volteado /= 10;
            posicion++;
        }
        System.out.println();
    }
}