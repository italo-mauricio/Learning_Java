package POO.Exercicios.Ex03;


/***
 * Criar uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não,
 * um limite. Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo
 * e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar a classe.
 */


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
        conta.limiteEspecial = 500.0;
        conta.saldo = 100;
        conta.valorEspecialUsado = 0;
        boolean aproved = false;
        boolean saqueEfetuado = conta.realizarSaque(2000);



        if (conta.emprestimoAtivo) {
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


                System.out.println("Deseja sacar dinheiro da sua conta? ");
                String resposta = scan.next();
                if (resposta.equalsIgnoreCase("S")) {
                    if (saqueEfetuado) {
                        System.out.println("Saque efetuado com sucesso!");
                        System.out.println("Saldo atual da conta: " + conta.saldo);
                    } else {
                        System.out.println("Não foi possível realizar saque");
                        System.out.println("Seu saldo é insuficiente");
                    }
                } else if (resposta.equalsIgnoreCase("N")) {
                    System.out.println("Obrigado!");
                    break;
                }
            } else {
                System.out.println("Senha incorreta, tente novamente!");
            }
        }
    }

}

