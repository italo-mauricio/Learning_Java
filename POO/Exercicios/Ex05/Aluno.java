package POO.Exercicios.Ex05;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplina;
    double[][] notasDisciplinas = new double[3][4];
    int idade;


    void mostrarInfo(){
        System.out.println("Universidade Federal do Rio Grande do Norte");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);

        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina: " + disciplina[i]);
            for(int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
