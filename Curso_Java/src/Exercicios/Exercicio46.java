package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Fibonacci
 */
public class Exercicio46 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o enésimo termo da série Fibonacci: ");
        int n = scan.nextInt();

        int primeiroNum = 1;
        int segundoNum = 1;
        int aux;

        System.out.println(primeiroNum);
        System.out.println(segundoNum);

        for (int i = 3; i<=n; i++){

            aux = primeiroNum + segundoNum;
            primeiroNum = segundoNum;
            segundoNum = aux;

            System.out.println(aux);

        }

    }
}
