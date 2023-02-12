package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/**
 * Crie um vetorA com 10 elementos inteiros. Implemente um programa que determine a soma dos elementos armazenados neste vetor
 * que são múltiplos de 5
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA =  new int[10];


        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        int multiplos = 0;

        for (int i = 0; i < vetorA.length; i++){
            soma += vetorA[i];
            if (vetorA[i] % 5 == 0){
                multiplos += vetorA[i];
            }
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma geral das posições é: " + soma);
        System.out.println("A soma apenas dos múltiplos de 5 é: " +  multiplos);

        System.out.println("Os múltiplos de 5 individualmente foram: ");
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 5 == 0){
                System.out.print(vetorA[i] + " ");
            }
        }

    }
}
