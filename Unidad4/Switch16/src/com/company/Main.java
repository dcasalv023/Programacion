//Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
//nos está siendo infiel. El programa irá haciendo preguntas que el usuario
//contestará con verdadero o falso. Cada pregunta contestada como verdadero
//sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
//del programa.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int puntos = 0;
        String respuesta;

        System.out.println("Esto es un test de fidelidad para saber si su pareja le es fiel: ");
        System.out.println("1. Sus horarios y rutinas han cambiado(v)erdadero o (f)also:" );
        respuesta = reader.next();

        if ( respuesta.equals("v") ){
            puntos += 3;
        }

        System.out.println("2. No sabe qué responder cuando preguntas dónde ha estado (v)erdadero o (f)also: ");
        respuesta = reader.next();
        if ( respuesta.equals("v") ){
            puntos += 3;
        }

        System.out.println("3. Evita contestar llamadas delante de ti (v)erdadero o (f)also: ");
        respuesta = reader.next();
        if ( respuesta.equals("v") ){
            puntos +=3;
        }

        System.out.println("4. No tiene ganas de hacer planes juntos (v)erdadero o (f)also: ");
        respuesta = reader.next();
        if (respuesta.equals("v") ){
            puntos +=3;
        }

        System.out.println("5. Está más distante (v)erdadero o (f)also: ");
        respuesta = reader.next();
        if (respuesta.equals("v") ){
            puntos +=3;
        }

        if ( puntos <= 5 ) {
            System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }

        if  (puntos > 6  && puntos <= 14) {
            System.out.print(" No bajes la guardia,  puede haber alguien por ahí pero no te preocupes mucho.");
        }

        if ( puntos >= 15 ) {
            System.out.print("La persona que es tu pareja al parecer esta teniendo un romance con alguien investiga sobre eso y ten cuidado!");
        }
    }
}
