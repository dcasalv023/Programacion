//Escribe un programa que lea una lista de diez números y determine cuántos
//son positivos, y cuántos son negativos.
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10;
        int negativo = 0;
        int positivo = 0;
        int cero = 0;

        System.out.println("Introduzca el primer número entero: ");
        numero1 = reader.nextInt();

                System.out.println("Introduzca el segundo número entero: ");
        numero2 = reader.nextInt();

                System.out.println("Introduzca el tercer número  entero: ");
        numero3 = reader.nextInt();

                System.out.println("Introduzca el cuarto número entero: ");
        numero4 = reader.nextInt();

                System.out.println("Introduzca el quinto número entero: ");
        numero5 = reader.nextInt();

        System.out.println("Por favor introduzca el sexto número entero: ");
        numero6 = reader.nextInt();

        System.out.println("Por favor introduzca el septimo número entero: ");
        numero7 = reader.nextInt();

        System.out.println("Por favor introduzca el octavo número entero: ");
        numero8 = reader.nextInt();

        System.out.println("Por favor introduzca el noveno número entero: ");
        numero9 = reader.nextInt();

        System.out.println("Por favor introduzca el decimo número entero: ");
        numero10 = reader.nextInt();

        if (numero1 > 0){
            positivo = positivo +1;
        }


        if(numero1 < 0){
            negativo = negativo +1;
        }


        if (0 == numero1)  {
              cero = cero +1;
        }


        if (numero2 > 0) {
             positivo = positivo +1;
        }


        if (numero2 < 0){
            negativo = negativo +1;
        }


        if( 0 == numero2) {
            cero = cero + 1;
        }


        if (numero3 > 0){
            positivo = positivo +1;
        }


        if (numero3 < 0){
            negativo = negativo +1;
        }


        if (0 == numero3){
            cero = cero +1;
        }


        if (numero4 > 0) {
            positivo = positivo +1;
        }


        if (numero4 < 0){
            negativo = negativo +1;
        }


        if(0 == numero4){
            cero = cero +1;
        }


        if (numero5 > 0){
            positivo = positivo +1;
        }


        if (numero5 < 0){
            negativo = negativo +1;
        }


        if (0 == numero5){
            cero = cero +1;
        }


        if (numero6 > 0) {
            positivo = positivo +1;
        }


        if (numero6 < 0){
            negativo = negativo +1;
        }


        if (0 == numero6) {
            cero = cero +1;
        }


        if (numero7 > 0){
               positivo = positivo +1;
        }


        if (numero7 < 0) {
            negativo = negativo +1;
        }


        if (0 == numero7){
            cero = cero +1;
        }


        if (numero8 > 0){
            positivo = positivo +1;
        }


        if (numero8 < 0){
            negativo = negativo +1;
        }


        if (0 == numero8) {
            cero = cero +1;
        }


        if (numero9 > 0){
            positivo = positivo +1;
        }


        if (numero9 < 0){
            negativo = negativo +1;
        }


        if (0 == numero9) {
            cero = cero +1;
        }


        if (numero10 > 0)  {
             positivo = positivo +1;
        }


        if (numero10 < 0)  {
             negativo = negativo +1;
        }


        if (0 == numero10) {
              cero = cero +1;
        }


        System.out.print("De los numeros introducidos " + positivo + " son positivos, " + negativo + " son negativos y " + cero + " son ceros");

            



    }
}
