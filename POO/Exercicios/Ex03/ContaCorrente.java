package POO.Exercicios.Ex03;

import java.util.Scanner;




public class ContaCorrente {

    String numConta;
    String agencia;
    String cvv;
    boolean especial;
    double limiteEspecial;
    double saldo;
    boolean emprestimoAtivo;
    double valorEspecialUsado;
    String senha;

    boolean realizarSaque(double quantidadeSaque){
        // tem saldo na conta?
        if (saldo >= quantidadeSaque){
            saldo -= quantidadeSaque;
            return true;
        }else {
            // não tem saldo na conta
            if (especial){
                // verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantidadeSaque){
                    saldo -= quantidadeSaque;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;   // não é conta espcial, não tem saldo suficiente
            }
        }
    }

    void depositar (double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }

    void consultarLimiteEspecial(){
        System.out.println("Limite especial" + limiteEspecial);
    }

    void consultarCvv(){
        System.out.println("CVV" + cvv);
    }

    void consultarAgencia(){
        System.out.println("Agência: " + agencia);
    }

    void consultarNumConta(){
        System.out.println("Número da conta: " + numConta);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}


