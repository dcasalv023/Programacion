//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
//que se imparten en el curso. Cada pregunta acertada sumará un punto. El
//programa mostrará al final la calificación obtenida. Pásale el minicuestionario
//a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Vamos a jugar a un pequeño cuestionario");

        int puntos = 0;
        int respuesta;

        System.out.println("Primera pregunta: ¿Qué tipo de variable almacena números enteros?");
        System.out.println("1) Double");
        System.out.println("2) Integer");
        System.out.println("3) String");
        System.out.println("4) Int");
        respuesta = reader.nextInt();
        if  (respuesta == 2) {
            puntos ++;
        }

        System.out.println("Segunda pregunta: ¿Qué nota hay que sacar para aprobar un examen, como minimo?");
        System.out.println("1) Hay que sacar un 4");
        System.out.println("2) Hay que sacar un 6");
        System.out.println("3) Hay que sacar un 5 ");
        System.out.println("4) Hay que sacar un 3");
        respuesta = reader.nextInt();
        if (respuesta == 3){
            puntos ++;
        }

        System.out.println("Tercera pregunta: ¿Qué operador lógica hay que usar para decir que las dos condiciones son verdaderas");
        System.out.println("1) Hay que usar el operador &&");
        System.out.println("2) Hay que usar el operador ||");
        System.out.println("3) Hay que usar el operador !");
        respuesta = reader.nextInt();
        if (respuesta == 1) {
            puntos ++;
        }

        System.out.println("Cuarta pregunta: Cuál de los siguientes no es un dios sin importar la religión? ");
        System.out.println("1) Apolo");
        System.out.println("2) Zeus");
        System.out.println("3) Anubis");
        System.out.println("4) Ryuk");
        respuesta = reader.nextInt();
        if (respuesta == 4){
            puntos ++;
        }

        System.out.println("Quinta pregunta: ¿Cual de esta lista no fue un emperador japonés? ");
        System.out.println("1) Hisahito");
        System.out.println("2) Naruhito");
        System.out.println("3) Naruhito");
        System.out.println("4) Fumihito");
        System.out.println("5) Yoshihito");
        respuesta = reader.nextInt();
        if (respuesta == 5) {
            puntos ++;
        }

        System.out.println("Sexta pregunta: ¿Cuál de los siguientes no fue un emperador egipto?");
        System.out.println("1) Cleopatra");
        System.out.println("2) Keops");
        System.out.println("3) Nectanebo III");
        System.out.println("4) Ramses");
        System.out.println("5) Menkaura");
        System.out.println("6) Nectanebo II");
        respuesta = reader.nextInt();
        if (respuesta == 3){
            puntos ++;
        }

        System.out.println("Septima pregunta: ¿Qué rol cumplía el dios Hermes dentro de la mitología griega?");
        System.out.println("1) Dios del vino");
        System.out.println("2) Dios de la guerra");
        System.out.println("3) Mensajero de los dioses");
        System.out.println("4) Dios del amor");
        respuesta = reader.nextInt();
        if (respuesta == 3){
            puntos++;
        }

        System.out.println("Octava pregunta: ¿Qué hizo Cronos el dios del tiempo humano de la mitología griega para que sus hijos no lo desafiara?");
        System.out.println("1) Los echo al fuego");
        System.out.println("2) Los lanzó al océano");
        System.out.println("3) Los apresó");
        System.out.println("4) Se los tragó enteros al nacer");
        respuesta = reader.nextInt();
        if (respuesta == 4){
            puntos++;
        }

        System.out.println("Novena pregunta: ¿A qué monstruo mató y decapitó Perseo?");
        System.out.println("1) Hidra");
        System.out.println("2) Minotauro");
        System.out.println("3) Medusa");
        System.out.println("4) León de Nemea");
        respuesta = reader.nextInt();
        if (respuesta == 3){
            puntos++;
        }

        System.out.println("Decima pregunta: Según los griegos, ¿Qué dios otorgó a los seres humanos el regalo del fuego?");
        System.out.println("1) Hermes");
        System.out.println("2) Hefesto");
        System.out.println("3) Prometeo");
        System.out.println("4) Hércules");
        respuesta = reader.nextInt();
        if (respuesta == 3){
            puntos++;
        }

        System.out.printf("Has conseguido un total de " + puntos + " puntos de los 10 puntos");
    }
}