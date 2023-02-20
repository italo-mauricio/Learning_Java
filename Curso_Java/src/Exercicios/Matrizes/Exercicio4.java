package Curso_Java.src.Exercicios.Matrizes;

import java.util.Random;

/***
 * Gere e imprima uma matriz M de 10x10 com valores aleatórios entre 0-9. Após isso, indique qual é o maior e o menor
 * valor da linha 5 e qual é o maior e menor valor da linha 7.
 *
 */


public class Exercicio4 {
    public static void main(String[] args) {
        int [][] numAleatorio = new int[10][10];
        Random numeroRandom = new Random();

        for (int i =0; i < numAleatorio.length; i++){
            for (int j = 0; j < numAleatorio[i].length; j++){
                numAleatorio[i][j] = numeroRandom.nextInt(100);
            }
        }
        for (int i =0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                System.out.print(numAleatorio[i][j] + " ");
            }
            System.out.println();
        }

        int maiorLinha5 = Integer.MIN_VALUE;
        int menorLinha5 = Integer.MAX_VALUE;
        int linha5 = 0;
        int coluna = 0;

        for (int i =0; i < numAleatorio[linha5].length; i++){
            if (numAleatorio[linha5][i] > maiorLinha5){
                maiorLinha5 = numAleatorio[5][i];
            }
            if (numAleatorio[linha5][i] < menorLinha5){
                menorLinha5 = numAleatorio[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5: " + maiorLinha5);
        System.out.println("Menor valor da linha 5: " + menorLinha5);


    }
}
