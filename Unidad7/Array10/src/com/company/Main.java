//Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
//y que los almacene en un array. El programa debe ser capaz de pasar todos
//los números pares a las primeras posiciones del array (del 0 en adelante) y
//todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
//es necesario.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int arreglo [] = new int[10];
        int pares = 0, impares = 0;

        System.out.println("Digite unos números: ");
        for (int i = 0; i < 10; i++){
            System.out.println((i+1) + ". Digite unn número: ");
            arreglo[i] = reader.nextInt();

            if (arreglo[i] % 2==0){
                pares++;
            }
            else{
                 impares++;
            }
        }

        int par[] = new int[pares];
        int impar[] = new int[impares];

        pares = 0;
        impares = 0;

        for (int i=0;i<10;i++){
            if (arreglo[i] % 2 == 0){
                par[pares] = arreglo[i];
                pares++;
            }

            else {
                impar[impares] = arreglo[i];
                impares++;
            }
        }

        System.out.println("Estos son los numeros pares: ");
        for (int i = 0;i<pares;i++){
            System.out.println(par[i]+" - ");
        }
        System.out.println("");

        System.out.println("Estos son los numeros impares: ");
        for (int i=0; i<impares;i++){
            System.out.println(impar[i]+" - ");
        }
        System.out.println("");
    }
}
