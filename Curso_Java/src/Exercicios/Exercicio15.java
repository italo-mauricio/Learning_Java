package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que peça um número e diga se ele é positivo ou negativo
 */

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        if (num < 0){
            System.out.println("O número é negativo, sendo ele: " + num);
        }else{
            System.out.println("O número é positivo, sendo ele: " + num);
        }
    }
}
