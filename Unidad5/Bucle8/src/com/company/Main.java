//Muestra la tabla de multiplicar de un número introducido por teclado.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); {
       int a;
       System.out.println("Introduce cualquier número: ");
       a = reader.nextInt();
       System.out.println("Se va a mostrar a continuación la tabla del " + a);

            for(int i = 1; i<=10; i++){
                System.out.println(a + " * " + i + " = " + a*i);
            }
        }
    }
}