package POO.com.italo.exercicios.Ex13;

import POO.com.italo.exercicios.Ex03.ContaCorrente;

import java.util.Scanner;

public class AppBanco {


    private static String logo() {
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
        ContaBanco conta = new ContaBanco("123", "155", "555",
                true, 1500, 25000, true, 500, senhaNova());

        Scanner scan = new Scanner(System.in);
        String situacaoEmprestimo;
        String situacaoEspecial;
        boolean aproved = false;

        logo();


        if (conta.isEmprestimoAtivo()) {
            situacaoEmprestimo = "Empréstimo Ativo";

        } else {
            situacaoEmprestimo = "Empréstimo inativo";
        }
        if (conta.isEspecial()) {
            situacaoEspecial = "Conta especial ATIVA";
        } else {
            situacaoEspecial = "Conta especial INATIVA";
        }


        while (!aproved) {
            System.out.print("Para ver os dados da sua conta, digite sua senha: ");
            String senha = scan.next();

            if (senha.equals(conta.getSenha())) {
                aproved = true;
                System.out.println("Senha aprovada!");
                conta.consultarNumConta();
                conta.consultarAgencia();
                conta.consultarCvv();
                conta.consultarLimiteEspecial();
                conta.consultarSaldo();
                System.out.println("Situação da conta: " + situacaoEspecial);
                System.out.println("Situação de empréstimo: " + situacaoEmprestimo);


                boolean saqueEfetuado = conta.realizarSaque(400);
                System.out.println("Deseja sacar 400 reais?: ");
                String resposta = scan.next();
                if (resposta.equalsIgnoreCase("S")) {
                    if (saqueEfetuado) {
                        System.out.println("Saque efetuado com sucesso!");
                        conta.consultarSaldo();
                    } else {
                        System.out.println("Não foi possível realizar saque");
                        System.out.println("Seu saldo é insuficiente");
                    }
                    if (conta.verificarUsoChequeEspecial()) {
                        System.out.println("Está usando cheque especial!");
                    } else {
                        System.out.println("Não está usando cheque especial!");
                    }
                } else if (resposta.equalsIgnoreCase("N")) {
                    System.out.println("Obrigado!");
                    break;
                }


                System.out.println("Deseja depositar 1000 reais?: ");
                String respostaDois = scan.next();
                if (respostaDois.equalsIgnoreCase("S")) {
                    conta.depositar(1000);
                    conta.consultarSaldo();
                } else {
                    System.out.println("Não foi possível depositar");
                }
                if (conta.verificarUsoChequeEspecial()) {
                    System.out.println("Está usando cheque especial!");
                } else {
                    System.out.println("Não está usando cheque especial!");
                }
            } else {
                System.out.println("Senha incorreta, tente novamente!");
            }
        }
    }
}

