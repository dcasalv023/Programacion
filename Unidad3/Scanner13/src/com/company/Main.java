//Realiza un programa que calcule la nota que hace falta sacar en el segundo
//examen de la asignatura Programación para obtener la media deseada. Hay
//que tener en cuenta que la nota del primer examen cuenta el 40% y la del
//segundo examen un 60%
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	    double nota1, nota2, notaFinal;

	    System.out.println("Introduzca la nota que sacaste en el primer examen: ");
	    nota1 = reader.nextInt();

	    System.out.println("Dime la nota que quieres sacar en el trimestre");
	    notaFinal = reader.nextInt();

        nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;

        System.out.println("Para sacar un " + notaFinal + " en el trimestre");
        System.out.println(" Deberías sacar un " + nota2 + " en el segundo examen.");
    }
}
