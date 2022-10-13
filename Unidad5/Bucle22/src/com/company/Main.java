//Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
package com.company;

public class Main {
    public static void main(String[] args) {
        int prueba, i, contador;

        for (int n = 1; n < 101; n++) {
            i = 0;
            contador = 0;
            do {
                i++;
                prueba = n % i;

                if (prueba == 0) {
                    contador++;
                }

            } while (i != n);

            if (contador == 2) {
                System.out.print(n + " ");
            }
        }
    }
}
