package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 * Criar um vetor A de 10 elementos inteiros. Implementar um programa que calcule:
 * a) a soma dos elementos armazenados neste vetor que são inferiores a 15.
 * b) a quantidade de elementos armazenados no vetor que são iguais a 15.
 * c) a média dos elementos armazenados no vetor que são superiores a 15.
 */

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }
        int somaMenor15 = 0;
        double somaMaior15 = 0;
        int qtdElementos = 0;
        int igual15 = 0;
        for (int i=0; i< vetorA.length; i++){

            if (vetorA[i] == 15){
                igual15++;
            }else if (vetorA[i] < 15){
                somaMenor15 += vetorA[i];
            }else {
                qtdElementos++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.println("Vetor A: " );
        for (int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Números iguais a 15: " + igual15);
        System.out.println("Soma dos números menores 15: " + somaMenor15);
        System.out.println("Os números menores que 15 são: ");
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] < 15){
                System.out.print(vetorA[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Media dos números maiores que 15: " + (somaMaior15 / qtdElementos));
        System.out.println("Números maiores que 15: ");
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] > 15){
                System.out.print(vetorA[i] + " ");
            }
        }

    }
}
