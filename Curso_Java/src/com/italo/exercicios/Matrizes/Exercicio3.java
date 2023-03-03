package Curso_Java.src.com.italo.exercicios.Matrizes;

import java.util.Random;

/***
 * Gere e imprima uma matirz M 4x4 com valores aleatórios entre 0 e 9. Após isso
 * determine o maior número da matriz e a sua posição (linha/coluna)
 */



public class Exercicio3 {
    public static void main(String[] args) {

        int [][] numAleatorio = new int[4][4];
        Random numeroRandom = new Random();

        for (int i =0; i < numAleatorio.length; i++){
            for (int j = 0; j < numAleatorio[i].length; j++){
                numAleatorio[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = Integer.MIN_VALUE;  // usamos o Integer.MIN_VALUE para calcular o maior valor e o Integer.MAX_VALUE para calcular o menor valor
        int linha = 0;
        int coluna = 0;

        for (int i =0; i < numAleatorio.length; i++){
            for (int j = 0; j < numAleatorio[i].length; j++){
                numAleatorio[i][j] = numeroRandom.nextInt(100);
                if (numAleatorio[i][j] > maior){
                    maior = numAleatorio[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        for (int i =0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                System.out.print(numAleatorio[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);




    }
}
