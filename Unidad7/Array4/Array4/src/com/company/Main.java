//Define tres arrays de 20 números enteros cada una, con nombres numero,
//cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
//array cuadrado se deben almacenar los cuadrados de los valores que hay en el
//array numero. En el array cubo se deben almacenar los cubos de los valores que
//hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
//en tres columnas.
package com.company;

public class Main {

    public static void main(String[] args) {
        int [] numero = new int[20];



        for (int i = 0; i <= 19; i++){

            numero[i] = (int)(Math.random()*100);
            System.out.println("numero = " + numero[i] + " , Cuadrado = " + numero[i]*numero[i] + " , Cubo = " + numero[i]*numero[i]*numero[i]);
        }

        }
    }
