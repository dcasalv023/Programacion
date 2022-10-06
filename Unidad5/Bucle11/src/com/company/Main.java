//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
//los 5 primeros números enteros a partir de uno que se introduce por teclado.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cont=0, num1=1;

        System.out.println("ingrese un numero: ");

        num1 = reader.nextInt();

        for (cont=num1; cont<=num1+5; cont++){

            System.out.println(cont + " El cuadrado de este número es: " + cont*cont +" El cubo de este número es: " + cont*cont*cont);

        }

    }

}