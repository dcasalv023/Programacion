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
        System.out.println("Introduce el numero a ser buscado: ");
        int numero = reader.nextInt();
        System.out.println("Introduce el numero con que queremos reemplazar: ");
        int remplazo = reader.nextInt();

        int array [] = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = ((int)(Math.random()*20));

            if (array [i] == numero){
                System.out.println(" ` " + remplazo + " ` ");
            } else System.out.println(array[i]);
        }
    }
}
