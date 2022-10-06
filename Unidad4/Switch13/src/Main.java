//Escribe un programa que ordene tres números enteros introducidos por
//teclado.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);{
        }

        int a, b ,c;

        System.out.println("Este programa ordena tres nuúmeros");
        System.out.println("Por favor introduzca el valor de a: ");
        a = reader.nextInt();

        System.out.println("Por favor introduzca el valor de b: ");
        b = reader.nextInt();

        System.out.println("Por favor introduzca el valor de c: ");
        c = reader.nextInt();

        if (a > b && b > c){
            System.out.println("Orden: " + a + " - " + b + " - " + c);
        }
        else if(a > c && c > b){
            System.out.println("Orden: " + a + " - " + c + " - " + b);
        }
        else if(b > a && a > c){
            System.out.println("Orden: " + b + " - " + a + " - " + c );
        }
        else if (b > c && c > a){
            System.out.println("Orden: " + b + " - " + c + " - " + a);
        }
        else if (c > a && a > b){
            System.out.println("Orden: " + a + " - " + b + " - " + c );
        }
        else{
            System.out.println("Orden: " + c + " - " + b + " - " + a);
        }

    }
}



