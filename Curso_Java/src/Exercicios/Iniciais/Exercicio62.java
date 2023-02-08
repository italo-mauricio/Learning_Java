package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa que mostre os N termos da série a seguir
 *
 * n = 1/1 + 2/3 + 3/5...
 */

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n = scan.nextInt();
        double soma = 0;

        for (int i = 1, j = 1; i <= n; i++, j+=2){
            System.out.print(i + "/" + j + " + ");
            soma += i/j;
        }
        System.out.println("Soma: " + soma);
    }
}
