package Curso_Java.src.com.italo.exercicios.Arrays;


import java.util.Scanner;

/***
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos
 * do vetor A são pares. Se pelo menos 1 elemento do vetor não for, o processo de repetição para percorrer os elementos
 * do vetor deve ser encerrado, como sugestão: Utilize uma variável do tipo flag pra atingir este propósito.
 */

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número para a posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0){
                System.out.println("Você digitou um número ímpar: " + vetorA[i]);
                break;
            }
        }

    }
}
