//Realiza un programa que sume los 100 números siguientes a un número entero
//y positivo introducido por teclado. Se debe comprobar que el dato introducido
//es correcto (que es un número positivo).
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numint;

        do {
            System.out.print("Por favor introduzca un número entero que sea positivo: ");
            numint = reader.nextInt();

            if(numint < 0) {
                System.out.print("El número que has puesto no es válido, ");
                System.out.println(" Por favor debes introducir un número positivo.");
            }
        }while (numint < 0);

        int suma = 0;

        for(int i = numint; i < numint + 100; i++) {
            suma += i;
        }

        System.out.print("La suma de los 100 números siguientes a ");
        System.out.println(numint + " es " + suma + ".");
    }
}
