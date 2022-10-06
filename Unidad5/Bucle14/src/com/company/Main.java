//Escribe un programa que pida una base y un exponente (entero positivo) y
//que calcule la potencia.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double base, resultado;
        int exponente;

        System.out.println("Introduce la base de la potencia: ");
        base = reader.nextDouble();
        do {
            System.out.println("Introduce el exponente de la potencia: ");
            exponente = reader.nextInt();

            if(exponente <= 0){
                System.out.println("Esto no es posible, el exponente debe ser positivo");
            }
        }while (exponente <= 0);
        resultado = base;

        for (int i=1; i<exponente;i++){
            resultado = (resultado*base);
        }

        System.out.println("El resultado de la potencia es " + resultado);

    }
}
