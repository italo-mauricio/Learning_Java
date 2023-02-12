package Curso_Java.src.Exercicios.Arrays;


import java.util.Scanner;

/***
 * Números palindromos são aqueles que escritos da direita pra esquerda têm o mesmo valor
 * quando escritos da direita pra esquerda. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros
 * é um palindromo ou seja, o primeiro elemento do vetor é igual ao último, se o segundo elemento é igula o penultimo e assim por diante.
 */
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        // 1221
        // 1 = 0
        boolean palindromo = true;
        for (int i = 0; i < (vetorA.length / 2); i++){
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        if (palindromo){
            System.out.println("\nPalindromo");
        }else{
            System.out.println("\nNão é palindromo");
        }
    }
}
