package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo
 * as seguintes regras de formação. A) B deverá receber 'a' quando A for menor que 7. B) B deverá receber 'b' quando
 * A for igual a 7. C) B deverá receber 'c' quando A for maior que 7 e menor que 10. D) B deverá receber 'd' quando A for
 * igual a 10. E) B deverá receber 'e' quando A for maior que 10.
 */

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];  // caso eu queria que apareça um 'a' por exemplo, preciso modificar o vetor para char
        // caso contrário, ele me retornará um número inteiro, condizente com a tabela ASCII

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            }else if (vetorA[i] == 7){
                vetorB[i] = 'b';
            }else if (vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            }else if (vetorA[i] == 10){
                vetorB[i] = 'd';
            }else if(vetorA[i] > 10){
                vetorB[i] = 'e';
            }

        }

        System.out.println("\nVetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}
