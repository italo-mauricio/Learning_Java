package Curso_Java.src.com.italo.aulas;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        double novoSalario = (salario * 0.1);
        salario += novoSalario;
        int num = 10;
        num %= 2;
        //salario = salario + (int) (salario * 0.1);
        System.out.println(salario);
        System.out.println(num);
    }
}