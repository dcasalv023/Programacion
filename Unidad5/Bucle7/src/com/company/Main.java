//Realiza el control de acceso a una caja fuerte. La combinación será un
//número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
//acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
//y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
//Tendremos cuatro oportunidades para abrir la caja fuerte.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int intentos = 4, numeroIntroducido;
        boolean acertado = false;

        do {
            System.out.print("Introduzca la clave de la caja fuerte: ");
            numeroIntroducido = reader.nextInt();

            if (numeroIntroducido == 2205) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }

            intentos--;

        } while(intentos > 0 && !acertado);

        if (acertado) {
            System.out.println("Ha abierto la caja fuerte.");
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    }
}