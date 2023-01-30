package Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que peça 4 notas bimestrais e mostre a média
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = scan.nextFloat();
        System.out.print("Digite a quarta nota: ");
        float nota4 = scan.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media < 3){
            System.out.println("Você foi reprovado, sua média foi de: " + media);
        } else if (media <= 5) {
            System.out.println("Você está na recuperação, sua média foi de: " + media);
        }else if (media > 5 && media < 10){
            System.out.println("Você foi aprovado, sua média foi de: " + media);
        }
    }
}