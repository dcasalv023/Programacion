//Escribe un programa que piense un número al azar entre 0 y 100. El usuario
//debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
//fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = (int) ((Math.random() * 100)+1);
        int b, i;


        System.out.println("He creado un juego donde tienes que adivinar un número con 100 posibilidades.");

        System.out.print("Tienes 5 intentos. Debes escribir un número entre 1 y 100: ");
        b = sc.nextInt();

        for (i=0; i<=4; i++) {



            if (a == b) {
                System.out.println("¡Lo has adivinado!");
                break; }



            else if (i == 4) {
                System.out.println("Lo siento, pero no lo has adivinado. El número era el: " + a);
                break; }



            else if (a > b)
                System.out.println("El número secreto es MAYOR que " + b);
            else if (a < b)
                System.out.println("El número secreto es MENOR que " + b);



            if (i <=1) {
                System.out.print("Puedes intentarlo de nuevo: ");
                b = sc.nextInt(); }
            else if (i ==2) {
                int x = (int) (a/10);
                System.out.println("Te voy a dar una pista porque soy amable, la primera cifra es: " + x);
                System.out.print("Debes hacer otro intento: ");
                b = sc.nextInt(); }
            else if (i >= 3) {
                System.out.print("Este es el últmo intento: ");
                b = sc.nextInt(); }
        }
    }
}