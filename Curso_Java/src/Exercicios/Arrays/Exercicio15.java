package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 * Crie um veotor A de 10 elementos inteiros. Implemente um programa que defina e escreva a média aritmética simples
 * dos elementos ímpares armazenados neste valor.
 */

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA =  new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                impar++;
            }
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + (soma/impar));

        System.out.println("Os valores ímpares são: ");
        for (int i = 0; i<vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                System.out.print(vetorA[i] + " ");
            }
        }

    }
}
