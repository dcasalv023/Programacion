//Calcula la nota de un trimestre de la asignatura Programación. El programa
//pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
//Si la media de los dos controles da un número mayor o igual a 5, el alumno
//está aprobado y se mostrará la media. En caso de que la media sea un número
//menor que 5, el alumno habrá tenido que hacer el examen de recuperación
//que se califica como apto o no apto, por tanto, se debe preguntar al usuario
//¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
//resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
//mantiene la nota media anterior.
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Dime la nota del primer examen: ");
        nota1 = reader.nextDouble();

        System.out.println("Dime la nota del segundo examen: ");
        nota2 = reader.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media < 5) {
            System.out.print("Dime cual ha sido la nota de la recuperación, ¿Es apto o no es apto?: ");
            String recuperacion;
            recuperacion = reader.next();
            if (recuperacion.equals("apto")) {
                media = 5;
            }
        }

        System.out.print("Tu nota de Programación es " + media);
    }
}