package Curso_Java.src.Aulas;

public class Matrizes {
    public static void main(String[] args) {

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

        for (int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(" | " + notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }

    }
}
