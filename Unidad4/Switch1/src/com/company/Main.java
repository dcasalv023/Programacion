//Escribe un programa que pida por teclado un día de la semana
// y que diga qué asignatura toca a primera hora ese día.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dia;
        Scanner reader = new Scanner(System.in);

        System.out.println("Por favor, introduzca un día de la semana y le diré");
        System.out.print("qué asignatura toca a primera hora ese día: ");
        dia = reader.next();

        switch(dia) {
            case "lunes":
                System.out.println("Entorno De Desarrollo");
                break;
            case "martes":
                 System.out.println("Inglés");
                 break;
            case "miercoles":
                  System.out.println("Lenguaje De Marca");
                  break;
            case "miércoles":
                System.out.println("Programación");
                break;
            case "jueves":
                System.out.println("Sistemas Informáticos");
                break;
            case "viernes":
                System.out.println("Bases de Datos");
                break;
            case "sábado":
                System.out.println("No hay clase");
                break;
            case "domingo":
                System.out.println("¡Ese día no hay clase!");
                break;
            default: System.out.println("El día introducido no es correcto.");
        }
    }
}
