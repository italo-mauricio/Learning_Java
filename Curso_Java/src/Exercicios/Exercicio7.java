package Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que pergunte quanto você ganha por hora,
 * e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no mês.
 */

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o seu salário por hora: ");
        double salarioPorHora = scan.nextDouble();
        System.out.print("Quantas horas você trabalhou no mês: ");
        double horasMes = scan.nextDouble();

        System.out.println("Seu salário esse mês foi de: " + (salarioPorHora * horasMes));
    }
}