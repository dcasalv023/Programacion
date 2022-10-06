//Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
//convertir deberá estar almacenada en una variable.
package com.company;

class HolaMundo4 {
    public static void main(String[] args) {
        float euros = 2;
        int pesetas = (int)(euros*166.86);

        System.out.println("Estos"+  euros + " euros son estas"+ pesetas + "pesetas.");

    }
}
