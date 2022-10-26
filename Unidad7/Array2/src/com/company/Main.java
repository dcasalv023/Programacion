//Define un array de 10 caracteres con nombre simbolo y asigna valores a los
//elementos según la tabla que se muestra a continuación. Muestra el contenido
//de todos los elementos del array. ¿Qué sucede con los valores de los elementos
//que no han sido inicializados?
package com.company;

public class Main {

    public static void main(String[] args) {
        char [] simbolo = new char[10];
        simbolo [0] = 'a';
        simbolo [1] = 'x';
        simbolo [4] = '@';
        simbolo [6] = ' ';
        simbolo [7] = '+';
        simbolo [8] = 'Q';

        System.out.print("Los valores del array simbolo son los siguientes: ");
        System.out.print(simbolo[0] + ", " + simbolo[1] + ", " + simbolo[4] + ", " + simbolo[6] + ", " + simbolo [7] + ", " + simbolo[8]);

    }
}