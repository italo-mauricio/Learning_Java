package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa parecido com o anterior porem só mostrando a soma
 */

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scan.nextInt();
        double soma = 0;
        for (int i = 1; i <= n; i++){
            soma += 1/i;
        }

        System.out.println("Soma: " + soma);
    }
}
