//Realiza un programa que vaya generando números aleatorios pares entre 0
//y 100 y que no termine de generar números hasta que no saque el 24. El
//programa deberá decir al final cuántos números se han generado.
public class Main {
        public static void main(String[] args) {
            System.out.println("Realiza un programa que genere números aleatorios pares del 0 al 100 y que no acabe hasta"
                    + "que no saque el número 24. El programa tendrá que decir cuantos números se han generado.");
            int contador = 1;
            int i = 0;
            do{
                int aleatorio = (int)(Math.random() * (100 + 1));
                i=aleatorio;
                if(i%2==0){
                    System.out.println(i);
                    if(i==24){
                        System.out.println("Lo hemos intentado " + contador + " veces");
                        break;
                    }
                    contador++;
                }
            }while(i!=24);
        }
    }


