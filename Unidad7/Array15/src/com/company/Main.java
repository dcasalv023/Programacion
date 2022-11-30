
//Un restaurante nos ha encargado una aplicación para colocar a los clientes en
//sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
//(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
//el programa no está preparado para colocar a grupos mayores a 4, por tanto,
//si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
//mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
//personas como máximo e intente de nuevo”. Para el grupo que llega,
//se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
//libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
//grupo es de dos personas, se podrá colocar donde haya una o dos personas.
//Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
//vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
//Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
//funcionamiento del programa se ilustra a continuación:

package com.company;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int [] mesas = new int[10];
        int nPer,personas = 0,cont = 0;

        for(int i = 0; i < mesas.length;i++){

            nPer = (int)(Math.random()*5);

            mesas[i] = nPer;
        }



        while(personas != -1){

            System.out.print(" Nº Mesas -----");
            for(int i = 1; i <= 10;i++){

                System.out.print("  " + i + "  ");
            }

            System.out.println("");

            System.out.print(" Nº Personas --");
            for(int i = 0; i < mesas.length;i++){

                System.out.print(" [" + mesas[i] + "] ");
            }

            System.out.println();
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa)");
            personas = reader.nextInt();


            if( personas > 0 && personas <= 4){

                for(int x = 0; x < mesas.length;x++){
                    if(mesas[x] == 0){
                        mesas[x] += personas;
                        System.out.println("Porfavor, sientese en la mesa " + (x + 1));
                        cont++;
                        break;
                    }
                }

                if(cont == 0){
                    for(int i = 0; i < mesas.length;i++){

                        if(mesas[i] <= 4){

                            if(personas == 4){

                                if(mesas[i] == 0){
                                    mesas[i] += personas;
                                    System.out.println("Porfavor, sientese en la mesa " + (i + 1));
                                    break;
                                }
                            }

                            if(personas == 3){

                                if(mesas[i] == 1 | mesas[i] == 0){
                                    mesas[i] += personas;
                                    break;
                                }
                            }

                            if(personas == 2){

                                if(mesas[i] == 1 | mesas[i] == 0 | mesas[i] == 2){
                                    mesas[i] += personas;
                                    System.out.println("Porfavor, sientese en la mesa " + (i + 1));
                                    break;
                                }

                            }

                            if(personas == 1){

                                if(mesas[i] == 1 | mesas[i] == 0 | mesas[i] == 2 | mesas[i] == 3){
                                    mesas[i] += personas;
                                    System.out.println("Porfavor, sientese en la mesa " + (i + 1));
                                    break;
                                }
                            }
                        }
                        if(i == 9){
                            System.out.println("No hay huecos libres losiento mucho");
                            personas = -1;
                            break;
                        }
                    }
                }else{

                }
            }
            cont = 0;
        }
    }
}
