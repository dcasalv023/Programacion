//Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como *, +,
//-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
//el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
//izquierda o hacia la derecha.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcion;

        System.out.println("Este program te introduce una pirámide");
        System.out.println("Introduzca un carácter para rellenar: ");
        String r = reader.next();
        System.out.println("Elija un tipo de pirámide");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        opcion = reader.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("  " + r);
                System.out.println(" " + r + r + r);
                System.out.println(r + r + r + r + r);
            }
            case 2 -> {
                System.out.println(r + r + r + r + r);
                System.out.println(" " + r + r + r);
                System.out.println("  " + r);
            }
            case 3 -> {
                System.out.println("    " + r);
                System.out.println("  " + r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println("  " + r + " " + r);
                System.out.println("    " + r);
            }
            case 4 -> {
                System.out.println(r);
                System.out.println(r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println(r + " " + r);
                System.out.println(r);
            }
            default -> {
            }
        }
    }
}
