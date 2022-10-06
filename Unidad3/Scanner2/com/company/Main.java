//Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
//convertir debe ser introducida por teclado.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double pesetas,euros;

        System.out.print("Por favor, introduzca la cantidad de pesetas que quiere convertir: ");
        pesetas = reader.nextInt();

        euros = pesetas / 166.386;

        System.out.println(pesetas + " pesetas son " + euros + " euros");
    }
}
