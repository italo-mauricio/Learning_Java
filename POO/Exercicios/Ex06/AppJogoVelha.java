package POO.Exercicios.Ex06;

import java.util.Scanner;

public class AppJogoVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JogoVelha jogoDaVelha = new JogoVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while(!ganhou){
            if(jogoDaVelha.vezJogador1()){
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1 - 3): ");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1 - 3): ");
                sinal = 'O';
            }
            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);
            jogoDaVelha.validarJogada(linha, coluna, sinal);
            jogoDaVelha.exibirTabuleiro();

            if(jogoDaVelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Parabéns jogador 1 ganhou");
            }else if (jogoDaVelha.verificarGanhador('O')){
                System.out.println("Parabéns jogador 2 ganhou");
            }else if (jogoDaVelha.jogada > 9){
                ganhou = true;
                System.out.println("Empate");
            }
        }
    }
    static int valor(String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValido = false;
        while(!valorValido){
            System.out.println("Digite a" + tipoValor + " 1 2 e 3");
            valor = scan.nextInt();
            if(valor >= 1 && valor <= 3){
                valorValido = true;
            }else{
                System.out.println("Entrada inválida, tente novamente!");
            }
        }
        valor --;
        return valor;
    }
}
