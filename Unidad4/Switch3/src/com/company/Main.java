//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String numero;

        System.out.println("Dime un número del 1 al 7: ");
        numero = reader.next();

        switch (numero) {
            case "1":
                System.out.println("Lunes");
                break;
            case "2":
                System.out.println("Martes");
                break;
            case "3":
                System.out.println("Miércoles");
                break;
            case "4":
                System.out.println("Jueves");
                break;
            case "5":
                System.out.println("Viernes");
                break;
            case "6":
                System.out.println("Sábado");
                break;
            case "7":
                System.out.println("Domingo");
                break;
        }
    }
}