package Exercicios;


import java.util.Scanner;

/***
 * Convertendo graus farenheit para celsius
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Farenheit: ");
        double grausFaren = scan.nextDouble();
        double grausCelsius = (5 * (grausFaren - 32) / 9);
        String message = String.format("A temperatura: %.4s F convertendo para Celsius fica ===> %.4s C", grausFaren, grausCelsius );

        System.out.println(message);
    }
}