package Curso_Java.src.Aulas;

public class Matrizes {
    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4];
        double soma = 0;
        String msg = "";

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

        for (int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(" | " + notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }

        notasAlunos[1][3] = 2;  //mudando a nota do aluno

        System.out.println();

        for (int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(" | " + notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("Calculando a média de cada aluno");

        for (int i = 0; i < notasAlunos.length; i++) {

            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }

                System.out.println("Média do aluno: " + i + " é: " + (soma / 4));

                if (soma < 7 && soma >= 3) {
                    msg = " está em Recuperação";
                    System.out.println("Aluno: " + i + msg);
                } else if (soma >= 7) {
                    msg = " está Aprovado";
                    System.out.println("Aluno: " + i + msg);
                } else {
                    msg = " está Reprovado";
                    System.out.println("Aluno: " + i + msg);
                }

        }
    }
}
