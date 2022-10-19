//Escribe un programa que simule la tirada de dos dados. El programa deberá
//continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
//dados tengan el mismo valor.
public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        while (a != b){
            a = (int)(Math.random()*6+1);
            b = (int)(Math.random()*6+1);

            System.out.println("El dado a saco un " + a);
            System.out.println("El dado b saco un " + b);
        }
    }
}