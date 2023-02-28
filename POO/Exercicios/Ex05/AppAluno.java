package POO.Exercicios.Ex05;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scan.next();
        System.out.println("Digite o número da matricula: ");
        aluno.matricula = scan.next();
        System.out.println("Digite a idade do aluno: ");
        aluno.idade = scan.nextInt();
        System.out.println("Digite o curso do aluno: ");
        aluno.curso = scan.next();

        aluno.disciplina = new String[3];
        for(int i = 0; i < aluno.disciplina.length; i++){
            System.out.println("Digite a disciplina: " + i);
            aluno.disciplina[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.disciplina[i]);
            for(int j = 0; j < aluno.notasDisciplinas[i].length; j++){

            }
        }



    }
}
