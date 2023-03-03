package Curso_Java.src.com.italo.exercicios.Arrays;

/***
 * Gerar um vetor A com 10 elementos inteiros e iguais a 0 e 1. Sugestão: A[I] = (int) Math.round(Math.random()*1).
 * Pede-se para implementar um programa que determine o percentual de números 0's e 1 existentes no vetor A.
 */

public class Exercicio23 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 1);  //a maioria dos métodos Math retornam um double

            if(vetorA[i] == 0){
                qtd0++;
            }else{
                qtd1++;
            }
        }
        // Fórmula
        // 10 - 100%
        // qtd - x
        // x = qtd * 100 / 10;

        double porcent0 = (qtd0 * 100) / vetorA.length;
        double porcent1 = (qtd1 * 100) / vetorA.length;

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("\nPorcentagem 0: " + porcent0);
        System.out.println("\nPorcentagem 1: " + porcent1);
    }
}
