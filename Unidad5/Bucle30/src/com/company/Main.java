//Realiza una programa que calcule las horas transcurridas entre dos horas de
//dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
//El día de la semana se puede pedir como un número (del 1 al 7) o como
//una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
//introduce los datos correctamente y que el segundo día es posterior al primero.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int primerDia, segundoDia, primeraHora, segundaHora;
        String primerDiaS, segundoDiaS, nombrePrimerDia = null, nombreSegundoDia = null;
        boolean datosCorrectos;

        do {
            System.out.println("Por favor, introduzca a continuación el día y la hora del primer día.");
            System.out.print("Día: ");
            primerDiaS = reader.next();
            System.out.print("Hora: ");
            primeraHora = reader.nextInt();
            if ("lunes".equals(primerDiaS) || "1".equals(primerDiaS)) {
                primerDia = 1;
                nombrePrimerDia = "lunes";
            } else if ("martes".equals(primerDiaS) || "2".equals(primerDiaS)) {
                primerDia = 2;
                nombrePrimerDia = "martes";
            } else if ("miércoles".equals(primerDiaS) || "3".equals(primerDiaS)) {
                primerDia = 3;
                nombrePrimerDia = "miercoles";
            } else if ("jueves".equals(primerDiaS) || "4".equals(primerDiaS)) {
                primerDia = 4;
                nombrePrimerDia = "jueves";
            } else if ("viernes".equals(primerDiaS) || "5".equals(primerDiaS)) {
                primerDia = 5;
                nombrePrimerDia = "viernes";
            } else if ("sábado".equals(primerDiaS) || "6".equals(primerDiaS)) {
                primerDia = 6;
                nombrePrimerDia = "sábado";
            } else if ("domingo".equals(primerDiaS) || "7".equals(primerDiaS)) {
                primerDia = 7;
                nombrePrimerDia = "domingo";
            } else {
                primerDia = 0;
            }

            System.out.println("Por favor, introduzca a continuación el segundo día y la segunda hora.");
            System.out.print("Día: ");
            segundoDiaS = reader.next();
            System.out.print("Hora: ");
            segundaHora = reader.nextInt();

            if ("lunes".equals(segundoDiaS) || "1".equals(segundoDiaS)) {
                segundoDia = 1;
                nombreSegundoDia = "lunes";
            } else if ("martes".equals(segundoDiaS) || "2".equals(segundoDiaS)) {
                segundoDia = 2;
                nombreSegundoDia = "martes";
            } else if ("miércoles".equals(segundoDiaS) || "3".equals(segundoDiaS)) {
                segundoDia = 3;
                nombreSegundoDia = "miércoles";
            } else if ("jueves".equals(segundoDiaS) || "4".equals(segundoDiaS)) {
                segundoDia = 4;
                nombreSegundoDia = "jueves";
            } else if ("viernes".equals(segundoDiaS) || "5".equals(segundoDiaS)) {
                segundoDia = 5;
                nombreSegundoDia = "viernes";
            } else if ("sábado".equals(segundoDiaS) || "6".equals(segundoDiaS)) {
                segundoDia = 6;
                nombreSegundoDia = "sábado";
            } else if ("domingo".equals(segundoDiaS) || "7".equals(segundoDiaS)) {
                segundoDia = 7;
                nombreSegundoDia = "domingo";
            } else {
                segundoDia = 0;
            }

            datosCorrectos = true;

            if (segundoDia <= primerDia) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datosCorrectos = false;
            }

            if ((primerDia == 0) || (segundoDia == 0)) {
                System.out.println("No se ha introducido correctamente el día de la semana.");
                System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
                datosCorrectos = false;
            }

            if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
                System.out.println("No se ha introducido correctamente la hora del día.");
                System.out.println("Las horas válidas están entre 0 y 23.");
                datosCorrectos = false;
            }

        } while (!datosCorrectos);


        System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
        System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
        System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");

    }
}
