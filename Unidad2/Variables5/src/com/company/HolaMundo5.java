//Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
//convertir deberá estar almacenada en una variable.

package com.company;

public class HolaMundo5 {
    public static void main(String[] args) {
        float pesetas = 1000;
        int euros = ( int)  (pesetas*0.006);

        System.out.println("Estas" + pesetas + "pesetas son estas" + euros + " pesetas");

    }
}
