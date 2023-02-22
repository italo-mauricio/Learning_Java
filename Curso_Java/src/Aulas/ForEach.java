package Curso_Java.src.Aulas;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];

        Random random = new Random();
        for (int i = 0; i < notas.length; i++){
            notas[i] = random.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

        // usando for each
        System.out.println("Utilizando o for each: ");
        for(int nota : notas){
            System.out.print(nota);
        }

        // exemplo 2
        System.out.println("Exemplo com Arrays multidimensionais");
        double[][] notasAlunos = new double[3][4];


        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 5;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 9;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 4;
        notasAlunos[2][3] = 8;

        for (double[] notasAluno : notasAlunos){
                for(double nota : notasAluno){
                    System.out.print(nota + " ");
                }
            System.out.println();
        }
    }
}
