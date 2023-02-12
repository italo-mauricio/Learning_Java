package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 *  Ler as duas notas bimestrais para um conjunto de 10 alunos.
 *  Armazenar as notas informadas em dois vetores "Nota1" e "Nota2".
 *  Escreva um programa que calcule a média aritmética simples das notas informadas
 *  armazenando o resultado em um "Result" de mesmo tipo e tamanho.
 *  Ao mostrar o resultado exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7
 *  o aluno está aprovado, caso contrário, a situação do aluno será reprovado.
 */

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[5];
        double[] nota2 = new double[nota1.length];
        double[] result = new double[nota1.length];
        String[] aluno = new String[nota1.length];

        for (int i = 0; i < nota1.length; i++){
            System.out.print("Digite o nome do aluno: ");
            aluno[i] = scan.next();
            System.out.print("Digite a PRIMEIRA nota do aluno: ");
            nota1[i] = scan.nextDouble();
            System.out.print("Digite a SEGUNDA nota do aluno: ");
            nota2[i] = scan.nextDouble();

            result[i] = (nota1[i] + nota2[i]) / 2;
        }
        String aprovado = " ";
        String recuperacao = " ";
        String reprovadp = " ";
        System.out.println("Primeira nota: ");
        for (int i = 0; i < nota1.length; i++){
            System.out.print(" / "+ nota1[i] + " ");
        }
        System.out.println("\nSegunda nota: ");
        for (int i = 0; i < nota2.length; i++){
            System.out.print(" / "+ nota2[i] + " ");
        }
        System.out.println("\nResultados: ");
        for (int i = 0; i < result.length; i++){
            if (result[i] >= 7){
                aprovado = " - Aprovado";
                System.out.println("\nAluno: " + aluno[i] + "\nNota: " + result[i] + "\nSituação: " + aprovado);
            }else if (result[i] >= 5) {
                recuperacao = " - Recuperação";
                System.out.println("\nAluno: " + aluno[i] + "\nNota: " + result[i] + "\nSituação: " + recuperacao);
            }else if (result[i] < 5){
                reprovadp = " - Reprovado";
                System.out.println("\nAluno: " + aluno[i] + "\nNota: " + result[i] + "\nSituação: " + reprovadp);
            }else {
                System.out.println("Média inválida!");
            }
        }
    }
}
