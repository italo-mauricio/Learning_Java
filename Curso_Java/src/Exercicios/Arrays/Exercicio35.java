package Curso_Java.src.Exercicios.Arrays;


import java.util.Scanner;

/***
 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima do vetor A e a relação de todos os pares de 0 até o respectivo elemento.
 */
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];


        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Analizando o número: " + vetorA[i]);

            for (int j = 2; j < vetorA[i]; j++){
                if (j % 2 ==0){
                    System.out.println(j + " é par");
                }else{
                    System.out.println(j + " é ímpar");
                }
            }
        }
        System.out.println();

    }
}
