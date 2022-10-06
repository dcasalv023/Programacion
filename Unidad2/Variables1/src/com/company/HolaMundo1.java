// Escribe un programa en el que se declaren las variables enteras x e y. Asignales
//los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
//el valor de cada variable, la suma, la resta, la división y la multiplicación.

package com.company;

public class HolaMundo1 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        double division = (double)x/(double)y;
        System.out.println("x = " +x+"  y = "+y);
        System.out.println("x+y = "+(x+y)+"  x-y = "+(x-y));
        System.out.println("x*y = "+(x*y)+ "  x/y = "+division);
    }
}
