package Curso_Java.src.Exercicios.Arrays;


import java.util.Scanner;

/***
 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos
 * divisores do respectivo elemento.
 */
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];


        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Analizando o número: " + vetorA[i]);

            for (int j = 1; j < vetorA[i]; j++){
                if (vetorA[i] % j ==0){
                    System.out.println(j + " é divisor");
                }else{
                    System.out.println(j + " Não é divisor");
                }
            }
        }

    }
}
