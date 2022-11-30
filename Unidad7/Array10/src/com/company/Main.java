

//Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
//y que los almacene en un array. El programa debe ser capaz de pasar todos
//los números pares a las primeras posiciones del array (del 0 en adelante) y
//todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
//es necesario.
package com.company;
public class Main {
    public static void main(String[] args){
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random()*101);
        }
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        int[] aux = new int[20];
        int contAux = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i]%2 != 0){
                aux[contAux] = num[i];
                num[i] = -1;
                contAux++;
            }
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] != -1){
                int trash = num[i];
                for (int j = 0; j < i ; j++){
                    if (num[i-j-1] == -1){
                        num[i-j-1] = trash;
                        num[i-j] = -1;
                    }
                }
            }
        }

        int j = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] == -1){
                num[i] = aux[j];
                j++;
            }
        }

        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
