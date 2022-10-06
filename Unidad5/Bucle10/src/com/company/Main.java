//Escribe un programa que calcule la media de un conjunto de números positivos
//introducidos por teclado. A priori, el programa no sabe cuántos números se
//introducirán. El usuario indicará que ha terminado de introducir los datos
//cuando meta un número negativo.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num, suma, elementos;
        float media;

        System.out.println("Introduzca a continuación un número: ");
        num = reader.nextInt();

        suma = 0;
        elementos = 0;

        while (num >= 0){

            suma+=num;
            elementos++;

            System.out.println("Introduzca a continuación otro número: ");
            num = reader.nextInt();
        }
        if (elementos == 0){
            System.out.println("No es posible hacer la media, lo siento");
        }
        else{
            media=(float) suma/elementos;
            System.out.println("La media es de: " + media);
        }
    }
}