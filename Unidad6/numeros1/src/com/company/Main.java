//Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
//también la suma total (los puntos que suman entre los tres dados).
package com.company;



public class Main {
    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <=3; i++){
            int a = (int)(Math.random()*6+1);
            suma = suma +a;
            System.out.println(a);
        }

        System.out.println("La suma es = " + suma);

    }
}