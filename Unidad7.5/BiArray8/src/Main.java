//Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
//a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
//indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
//64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
//se indican del 1 al 8.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int fila, columna;

    String[][] a = new String[8][8];

    // Tablero
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            a[i][j] = "█";
        }
    }

    // MOSTRAR
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.printf(a[i][j] + "    ");
        }
        System.out.println("");
    }

    // PREGUNTAR
        System.out.println("Introduzca la posicion del alfil, por ejemplo b2: ");
    String posicion = sc.next();
    fila = (int)(posicion.charAt(0)) - 96;
    columna = (int)(posicion.charAt(1)) - 48;

    fila = fila - 1;
    columna = columna - 1;

    //SUSTITUIR
    a[fila][columna] = "♗";

    //MOSTRAR
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.printf(a[i][j] + "    ");
        }
        System.out.println("");
    }
        System.out.println("");
        System.out.println("");
        System.out.println("");

    //DIAGONALES

    //Importante poner i = 1 y i < ) para que no se coma el alfil
        for (int i = 1; i < 9; i++) {

        if (fila+i < 8 && columna+i <8) {
            a[fila+i][columna+i] = "*";
        }

        if (fila-i >= 0 && columna-i >= 0) {
            a[fila-i][columna-i]="*";
        }

        if (fila+i < 8 && columna-i >= 0) {
            a[fila+i][columna-i] = "*";
        }

        if (fila-i >= 0 && columna+i <8) {
            a[fila-i][columna+i] = "*";
        }

    }

    //MOSTRAR
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.printf(a[i][j] + "    ");
        }
        System.out.println("");
    }
}
}
