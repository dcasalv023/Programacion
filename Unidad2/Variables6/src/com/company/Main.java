//Escribe un programa que calcule el total de una factura a partir de la base
//imponible (precio sin IVA). La base imponible estará almacenada en una
//variable.

package com.company;


class HolaMundo6 { //
    public static void main(String[] args) {
        int IVA = 21;
        int baseImp = 100;
        int totalFac = ((baseImp*IVA/100)+baseImp);

        System.out.println("El total sin IVA es: "+baseImp+".");
        System.out.println("El total con IVA es: "+totalFac+".");

    }
}
