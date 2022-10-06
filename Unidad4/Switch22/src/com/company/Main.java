//Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
//hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
//Se considerará que el fin de semana comienza el viernes a las 15:00 h. Se da
//por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
//a las 15:00 h.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String dia;
        int diaNumeric = 0;
        int horas, minutos, minutosTotales, minutosActuales;

        System.out.println("Por favor introduce un dia de la semana que sea de lunes-viernes: ");
        dia = reader.next();

        switch(dia) {
            case "lunes":
                break;
            case "martes":
                diaNumeric = 1;
                break;
            case "miercoles":
                diaNumeric = 2;
                break;
            case "jueves":
                diaNumeric = 3;
                break;
            case "viernes":
                diaNumeric = 4;
                break;
            default:
                System.out.print("El día introducido no es correcto.");
        }

        System.out.println("A continuación introduzca la hora (hora y minutos)");

        System.out.print("Hora: ");
         horas = reader.nextInt();

        System.out.print("Minutos: ");
         minutos = reader.nextInt();

         minutosTotales = (4 * 24 * 60) + (15 * 60);
         minutosActuales = (diaNumeric * 24 * 60) + (horas * 60) + minutos;

        System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
    }
}