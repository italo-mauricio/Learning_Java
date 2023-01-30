package Exercicios;

import java.util.Scanner;

/***
 * Convertendo de graus celsius para farenheit
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma temperatura em graus celsius: ");
        double grausCelsius = scan.nextDouble();

        double grausFaren = (grausCelsius * 1.8 + 32);

        String message = String.format("A temperatura: %.4s C convertendo para Farenheit fica ===> %.4s F", grausCelsius, grausFaren );

        System.out.println(message);
    }
}