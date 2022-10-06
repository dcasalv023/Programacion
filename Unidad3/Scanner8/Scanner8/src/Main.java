//Escribe un programa que calcule el salario semanal de un empleado en base
//a las horas trabajadas, a razón de 12 euros la hora.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double horasTrabajadas;
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        horasTrabajadas = reader.nextInt();
        System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
    }
}
