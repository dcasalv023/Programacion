//Realiza un programa que vaya pidiendo números hasta que se introduzca un
//numero negativo y nos diga cuantos números se han introducido, la media de
//los impares y el mayor de los pares. El número negativo sólo se utiliza para
//indicar el final de la introducción de datos pero no se incluye en el cómputo.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);{
            double contador = 0, numero = 0, maximoPar = 0, sumaImpares = 0, numerosImpares = 0;

            System.out.println("Introduzca a continuación números positivos: ");
            System.out.println("-------------------------------------------");
            System.out.println("Introduzca también un número negativo: ");

            while (numero >= 0) {
                numero = reader.nextInt();
                if (numero >= 0) {
                    contador++;
                }
                if (((numero % 2) == 0) && (numero > maximoPar)) {
                    maximoPar = numero;
                } else {

                    if ((numero % 2) == 1 ) {
                        sumaImpares += numero;
                        numerosImpares++;
                    }
                }
            }

            System.out.println("Ha introducido " + contador + " numeros");
            System.out.println("La media de los numeros impares es " + sumaImpares / numerosImpares);
            System.out.print("El maximo par es " + maximoPar);
        }
    }
}
