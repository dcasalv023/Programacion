//Escribe un programa que nos diga el horóscopo a partir del día y el mes de
//nacimiento.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int dia, mes;

        System.out.println("Por favor introduce el mes en que naciste(número): ");
        mes = reader.nextInt();

        System.out.println("Por favor introduce el dia en que naciste: ");
        dia = reader.nextInt();

        switch (mes){
            case 1:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Capricornio");
                }
                else if(dia >= 21 && dia <= 30){
                    System.out.println("Eres Acuario");
                }
                break;

            case 2:
                if (dia >= 1 && dia <= 18){
                    System.out.println("Eres Acuario");
                }
                else if(dia >= 19 && dia <= 30){
                    System.out.println("Eres Piscis");
                }
                break;

            case 3:
                if (dia >= 1 && dia <= 18){
                    System.out.println("Eres Piscis");
                }
                else if(dia >= 19 && dia <= 30){
                    System.out.println("Eres Aries");
                }
                break;

            case 4:
                if (dia >= 1 && dia <= 19){
                    System.out.println("Eres Aries");
                }
                else if (dia >= 20 && dia <= 30){
                    System.out.println("Eres Tauro");
                }
                break;

            case 5:
                if (dia >= 1 && dia <= 21){
                    System.out.println("Eres Tauro");
                }
                else if (dia >= 22 && dia <= 30){
                    System.out.println("Eres Geminis");
                }
                break;

            case 6:
                if (dia >= 1 && dia <= 21){
                    System.out.println("Eres Geminis");
                }
                else if (dia >= 22 && dia <= 30){
                    System.out.println("Eres Cáncer");
                }
                break;

            case 7:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Cáncer");
                }
                else if (dia >= 21 && dia <= 30){
                    System.out.println("Eres Leo");
                }
                break;

            case 8:
                if (dia >= 1 && dia <= 16){
                    System.out.println("Eres Leo");
                }
                else if (dia >= 17 && dia <= 30){
                    System.out.println("Eres Virgo");
                }
                break;

            case 9:
                if (dia >= 1 && dia <= 18){
                    System.out.println("Eres Virgo");
                }
                else if (dia >= 19 && dia <= 30){
                    System.out.println("Libra");
                }
                break;

            case 10:
                if(dia >= 1 && dia <= 19){
                    System.out.println("Eres Libra");
                }
                else if (dia >= 20 && dia <= 30){
                    System.out.println("Eres Escorpio");
                }
                break;

            case 11:
                if(dia >= 1 && dia <= 17){
                    System.out.println("Eres Escorpio");
                }
                else if (dia >= 18 && dia <= 30){
                    System.out.println("Eres Ofiuco");
                }
                break;

            case 12:
                if(dia >= 1 && dia <= 18){
                    System.out.println("Eres Ofiuco");
                }
                else if(dia >= 19 && dia <= 30){
                    System.out.println("Eres Sagitario");
                }
                break;
        }
    }
}
