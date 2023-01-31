package Exercicios;

import java.util.Scanner;

/***
 * Programa básico de calcular média de semestre em Java
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("BOLETIM SEMESTRAL UFRN");
        System.out.println(" ");
        System.out.print("Digite o nome do Aluno: ");
        String nomeAluno = scan.next();
        System.out.print("Digite o número da matricula");
        int matricula = scan.nextInt();
        System.out.print("Digite a primeira nota do aluno: ");
        float nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float nota2 = scan.nextFloat();
        System.out.print("Digite a terceira nota do aluno: ");
        float nota3 = scan.nextFloat();
        System.out.print("Digite a quarta nota do aluno: ");
        float nota4 = scan.nextFloat();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media < 3){
            System.out.println("Aluno: " + nomeAluno + "\nMatricula: " + matricula + "\nSituação: REPROVADO\n" +
                    "\bMédia final: " + media);
        }else if (media <= 5){
            System.out.println("Aluno: " + nomeAluno + "\nMatricula: " + matricula + "\nSituação: RECUPERAÇÃO\n" +
                    "\bMédia final: " + media);
        } else if (media <= 10) {
            System.out.println("Aluno: " + nomeAluno + "\nMatricula: " + matricula + "\nSituação: APROVADO\n" +
                    "\bMédia final: " + media);
        } else {
            System.out.println("NOTA INVÁLIDA!");
        }

    }
}


