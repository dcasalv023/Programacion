//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
//separados por espacios. Muestra también el máximo, el mínimo y la media
//de esos números.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa saca 50 números aleatorios y te dice el mayor, el menor y la media de todos estos números. ");
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        int suma = 0;
        System.out.println();


        for (int i = 0; i < 50; i++) {
            int numeros = (int) (Math.random() * 100 + 100);
            System.out.print(numeros + " ");
            if (numeros > maximo) {
                maximo = numeros;
            } else if (numeros < minimo) {
                minimo = numeros;
            }
            suma = suma + numeros;
        }

        System.out.println("El número más pequeño de esos 50 es el " + minimo);
        System.out.println("El número más grande de esos 50 es el " + maximo);
        System.out.println("La media de esos números es de " + suma / 50);
    }
}