package POO.com.italo.exercicios.Ex05;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scan.nextLine();
        System.out.print("Digite o número da matricula: ");
        aluno.matricula = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite a idade do aluno: ");
        aluno.idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o curso do aluno: ");
        aluno.curso = scan.nextLine();
        System.out.print("Digite em qual período você esta: ");
        aluno.periodo = scan.nextLine();


        aluno.disciplina = new String[3];
        for(int i = 0; i < aluno.disciplina.length; i++){
            System.out.println("Digite o nome da disciplina: " + i);
            aluno.disciplina[i] = scan.nextLine();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.disciplina[i]);
            for(int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Digite a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();
        System.out.println(" -------------------------------------------- ");
        System.out.println(" -                Resultado                 - ");

        for (int i=0; i<aluno.disciplina.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina: " + aluno.disciplina[i]);
                System.out.println("Aprovado!");
            }else if (aluno.verificarRecuperacao(i)){
                System.out.println("Disciplina: " + aluno.disciplina[i]);
                System.out.println("Recuperação");
            }else{
                System.out.println("Disciplina: " + aluno.disciplina[i]);
                System.out.println("Reprovado");
            }
        }
    }
}
