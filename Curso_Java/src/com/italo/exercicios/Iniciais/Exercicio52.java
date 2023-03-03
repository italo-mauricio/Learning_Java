package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa que calcule o valor total investido por um colecionador em sua coleção
 * de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDS e o valor
 * para pago em cada um.
 */

public class Exercicio52 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de CDS: ");
        int cds = scan.nextInt();
        double preco;
        double soma = 0;

        for (int i=1; i <= cds; i++){
            System.out.println("Digite o valor do CD: " + i);
            preco = scan.nextDouble();

            soma += preco;
        }

        double media = soma / cds;

        System.out.println("A média gasta com cada CD: " + media);
    }
}
