//Escribe un programa que pida 20 números enteros. Estos números se deben
//introducir en un array de 4 filas por 5 columnas. El programa mostrará las
//sumas parciales de filas y columnas igual que si de una hoja de cálculo se
//tratara. La suma total debe aparecer en la esquina inferior derecha.
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
            throws InterruptedException { // Se añade esta línea para poder usar sleep

        Scanner s = new Scanner(System.in);

        int[][] num = new int[3][6]; // array de 3 filas por 6 columnas

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 7;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        int fila;
        int columna;

        System.out.print("       ");
        for(columna = 0; columna < 6; columna++) {
            System.out.print("   Columna " + columna);
        }
        for(fila = 0; fila < 3; fila++) {

            System.out.print("\nFila " + fila);

            for(columna = 0; columna < 6; columna++) {
                System.out.printf("%9d   ", num[fila][columna]);
                Thread.sleep(500); // retardo de medio segundo
            }
        }

    }
}