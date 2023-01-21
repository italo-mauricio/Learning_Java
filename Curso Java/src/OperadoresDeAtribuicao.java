public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        double novoSalario = (salario * 0.1);
        salario += novoSalario;
        //salario = salario + (int) (salario * 0.1);
        System.out.println(salario);
    }
}
