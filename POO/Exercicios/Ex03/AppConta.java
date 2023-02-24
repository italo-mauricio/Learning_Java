package POO.Exercicios.Ex03;


import java.util.Scanner;

public class AppConta {


    private static String init(){
        String logo = "Bem vindos ao Banco Digital!";
        System.out.println(logo);
        return logo;
    }
    public static String senhaNova() {

        Scanner scan = new Scanner(System.in);
        String senhaNova;
        System.out.print("Crie uma senha [números ou letras]: ");
        senhaNova = scan.next();
        System.out.println("Senha cadastrada com sucesso!");
        return senhaNova;

    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        Scanner scan = new Scanner(System.in);
        String situacaoEmprestimo;
        String situacaoEspecial;

        init();
        conta.senha = senhaNova();
        conta.numConta = "12346";
        conta.agencia = "4004";
        conta.cvv = "156";
        conta.emprestimoAtivo = true;
        conta.especial = true;
        conta.limiteEspecial = 1500.0;
        conta.saldo = 15000;
        boolean aproved = false;

        if (conta.emprestimoAtivo) {
            situacaoEmprestimo = String.valueOf(conta.emprestimoAtivo);
            situacaoEmprestimo = "Empréstimo Ativo";
        } else {
            situacaoEmprestimo = "Empréstimo inativo";
        }
        if (conta.especial) {
            situacaoEspecial = String.valueOf(conta.especial);
            situacaoEspecial = "Conta especial ATIVA";
        } else {
            situacaoEspecial = "Conta especial INATIVA";
        }
        while (!aproved) {
            System.out.print("Para ver os dados da sua conta, digite sua senha: ");
            String senha = scan.next();

            if (senha.equals(conta.senha)) {
                aproved = true;
                System.out.println("Senha aprovada!");
                System.out.println("Número da conta: " + conta.numConta);
                System.out.println("Agencia: " + conta.agencia);
                System.out.println("CVV: " + conta.cvv);
                System.out.println("Situação da conta: " + situacaoEspecial);
                System.out.println("Situação de empréstimo: " + situacaoEmprestimo);
                System.out.println("Limite cheque especial: " + conta.limiteEspecial);
                System.out.println("Saldo: " + conta.saldo);
            } else {
                System.out.println("Senha incorreta, tente novamente!");
            }
        }
    }
}

