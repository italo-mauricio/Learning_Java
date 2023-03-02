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
        }
    }
}
