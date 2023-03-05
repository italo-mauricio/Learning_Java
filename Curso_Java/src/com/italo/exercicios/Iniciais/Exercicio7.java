package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 Create a program that asks how much you earn per hour,
 and the number of hours worked in the month. Calculate and show your total salary for the month.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your hourly wage: ");
        double salarioPorHora = scan.nextDouble();
        System.out.print("How many hours did you work this month: ");
        double horasMes = scan.nextDouble();

        System.out.println("Your salary this month is: " + (salarioPorHora * horasMes));
    }
}