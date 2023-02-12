package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
 * Escreva um programa que determina a quantidade de pessoas que possuem idade maior que 35. Em seguida
 * leia um vetor B indicando os nomes das pessoas atreladas as idades e mostre na tela as idades e nomes correspondentes.
 */

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        String[] vetorB = new String[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite sua idade: " + (i+1));
            vetorA[i] = scan.nextInt();
            System.out.println("Digite o nome");
            vetorB[i] = scan.next();
        }
        int qtd = 0;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] > 35){
                qtd++;
            }
        }
        System.out.println("Vetor idade: ");
        for (int i=0; i < vetorA.length; i++){
            System.out.print(" / " + vetorA[i] + " ");

        }
        System.out.println();
        System.out.println("Nomes em ordem de representação: ");
        for (int i=0; i < vetorA.length; i++){
            System.out.print(" / " + vetorB[i] + " ");

        }
        System.out.println();
        System.out.println("A quantidade de pessoas com idade maior que 35 é: " + qtd);
        System.out.println();
        System.out.println("As pessoas com mais de 35 anos são: ");
        System.out.println();
        for (int i=0; i < vetorA.length; i++){
            if (vetorA[i] > 35){
                System.out.print(" / " + vetorB[i] + " ");
            }
        }
    }
}
