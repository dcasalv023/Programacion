//Escribe un programa que lea 15 números por teclado y que los almacene en un
//array. Rota los elementos de ese array, es decir, el elemento de la posición 0
//debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
//la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
//del array.
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numero = new int[15];
        int ultimo;

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
        for (int i = 0; i < 15; i++) {
            System.out.println( i+ ". Digite un numero: ");
            numero[i] = reader.nextInt();
        }

        ultimo = numero[15];

        for (int i=0;i>=0;i--){
            numero[i+1] = numero[i];
        }

        numero[0] = ultimo;

        System.out.println("\nEl nuevo array es: ");
        for (int i=0;i<10;i++){
            System.out.println(i+"Numero: "+numero[i]);
        }
    }
}
