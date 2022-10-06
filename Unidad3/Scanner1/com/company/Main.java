//Realiza un programa que pida dos números y que luego muestre el resultado
//de su multiplicación.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double primerNumero, segundoNumero, total;


        System.out.println("Por favor, introduce un número: ");
        primerNumero = reader.nextInt();

        System.out.println("Introduce otro, por favor: ");
        segundoNumero = reader.nextInt();

        total = primerNumero*segundoNumero;

        System.out.println("El resultado de estos dos números es: " + total);

    }
}
