//Escribe un programa que dada una hora determinada (horas y minutos),
//calcule los segundos que faltan para llegar a la medianoche.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int hora, minuto, horaSec, minSec, medianoche;

        System.out.println("Por favor introduce una hora: ");
        hora = reader.nextInt();

        if(hora < 0 || hora > 24){
            System.out.println("La hora no es correcta");
        }else{
            System.out.println("Por favor introduce los minutos: ");
            minuto = reader.nextInt();

            if (minuto < 0 || minuto > 59){
                System.out.println("Este dato no puede ser correcto");
            }else{
                if (hora == 0 && minuto == 0){
                    System.out.println("Ya es medianoche");
                }else{
                     horaSec = (23 - hora)* 3600;
                     minSec = (60 - minuto)* 60;
                     medianoche = horaSec + minSec;
                    System.out.println("Faltan " + medianoche + " segundos para medianoche.");
                }
            }
        }
    }
}
