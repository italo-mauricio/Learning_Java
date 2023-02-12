package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA =  new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor da posição: ");
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < vetorA.length; i++){
            soma += vetorA[i];
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma é: " + soma);
    }
}
