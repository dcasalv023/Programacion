//Amplía el programa anterior para que diga la nota del boletín (insuficiente,
//suficiente, bien, notable o sobresaliente).
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1, n2, n3, media;

        System.out.println("Por favor dime la primera nota: ");
        n1 = reader.nextInt();

        System.out.println("Por favor dime la segunda nota: ");
        n2 = reader.nextInt();

        System.out.println("Por favor dime la tercera nota: ");
        n3 = reader.nextInt();

        media = (n1 + n2 + n3) / 3;
        System.out.print("La media de las tres notas es: " + media);

        if (media < 5) {
            System.out.print(" Tu nota es un Insuficiente");
        }

        if (media == 5) {
            System.out.print(" Tu nota es un Suficiente");
        }

        if (media == 6 ){
            System.out.println(" Tu nota es un Bien");
        }

        if (media >= 7 && media < 9){
            System.out.println(" Tu nota es un Notable");
        }

        if (media >= 9){
            System.out.println(" Tu nota es un Sobresaliente");
        }
    }
}

