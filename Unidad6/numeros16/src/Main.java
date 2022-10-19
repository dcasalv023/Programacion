//Realiza un simulador de máquina tragaperras simplificada que cumpla los
//siguientes requisitos:
//a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
//figuras posibles: corazón, diamante, herradura, campana y limón.
//b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
//ha perdido”.
//c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
//ha recuperado su moneda”.
//d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
//10 monedas”.
public class Main {
    public static void main(String[] args) {


        System.out.print("Bienvenid@ a la máquina tragaperras, si consigue 2 figuras iguales le devolveremos");
        System.out.println(" su dinero, si consigue las 3, habrá ganado el premio. ¡Buena suerte!.");
        System.out.println("-----------------------------------------------------------------------------");
        int figuras;
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;
        System.out.println();


        for (int i = 1; i <= 3; i++) {
            figuras = (int)(Math.random()*5+1);


            if (i == 1) {
                figura1 = figuras;
            } else if (i == 2) {
                figura2 = figuras;
            } else if (i == 3) {
                figura3 = figuras;
            }
            switch (figuras) {
                case 1:
                    System.out.print("Corazón ");
                    break;
                case 2:
                    System.out.print("Diamante ");
                    break;
                case 3:
                    System.out.print("Herradura ");
                    break;
                case 4:
                    System.out.print("Campana ");
                    break;
                case 5:
                    System.out.print("Limón ");
                    break;
                default:
                    System.out.print("Nada");
            }
        }
        System.out.println("---------------------------------------------------------------------------");

        if ((figura1 == figura2) && (figura2 == figura3)) {
            System.out.print("¡Has ganado, enhorabuena! Te doy tu premio guapo.");
        } else if ((figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)) {
            System.out.println("¡Has estado a punto de ganar! Le devuelvo su moneda para que lo vuelvas a intentar.");
        } else {
            System.out.print("Vaya has tenido mala suerte, no te preocupes sigue intentandolo y ganaras seguro.");
        }
    }
}