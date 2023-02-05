package Curso_Java.src.Exercicios;

import java.util.Scanner;


/***
 * Faça um programa que lê as duas notas de um aluno parciais obtidas numa disciplina ao longo do semestre
 * e calcule a sua média.
 */
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";

        if (media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9){
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5){
            aproveitamento = "C";
        } else if (media >= 4 && media < 6){
            aproveitamento = "D";
        } else if (media >= 0 && media < 4){
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Aproveitamente: " + aproveitamento);

        switch (aproveitamento){
            case "A":
                System.out.println("Aprovado");
                break;
            case "B":
                System.out.println("Aprovado");
                break;
            case "C":
                System.out.println("Aprovado");
                break;
            case "D":
                System.out.println("Reprovado");
                break;
            case "E":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Dados inválidos!");
                break;
        }
    }
}
