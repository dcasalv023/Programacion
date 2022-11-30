//Realiza un programa que rellene un array de 6 filas por 10 columnas con
//números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
//A continuación, el programa deberá dar la posición tanto del máximo como
//del mínimo.

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int[][] arrayBi = new int[6][10];
    Random r = new Random();
    int min = arrayBi[0][0];
    int max = arrayBi[0][0];
    int minFila = 0, minColumna = 0;
    int maxFila = 0, maxColumna = 0;

        for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 10; j++) {
            arrayBi[i][j] = r.nextInt(1000) + 1;
            System.out.printf("%8d ", arrayBi[i][j]);


            if (arrayBi[i][j] > max) {
                max = arrayBi[i][j];
                maxFila = i;
                maxColumna = j;
            }
            if (arrayBi[i][j] < min) {
                min = arrayBi[i][j];
                minFila = i;
                minColumna = j;
            }
        }
        System.out.println();
    }

        System.out.println("El maximo es " + max + " y su posicion es " + maxFila + "," + maxColumna);
        System.out.println("El minimo es " + min + " y su posicion es " + minFila + "," + minColumna);

        }
    }