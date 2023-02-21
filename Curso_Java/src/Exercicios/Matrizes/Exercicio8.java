package Curso_Java.src.Exercicios.Matrizes;

import java.util.Scanner;

/***
 * Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida
 * do jogo da velha usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja
 * colocar a sua peça ('o' e 'X'). O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o
 * vencedor (jogador 1 ou jogador 2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.
 */

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;

        while(!ganhou){

            if (jogada % 2 == 1){  // jogador 1

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1 - 3 )");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1 - 3 )");
                sinal = 'O';
            }

            boolean linhaValida = false;

            while(!linhaValida){
                System.out.println("Digite a linha (1 / 2 / 3) ");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3){
                    linhaValida = true;
                }else{
                    System.out.println("Linha inválida, tente novamente!");
                }
            }

            boolean colunaValida = false;

            while(!colunaValida){
                System.out.println("Digite a coluna (1 / 2 / 3) ");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }else{
                    System.out.println("Coluna inválida, tente novamente!");
                }
            }
            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
                System.out.println("Posição já usada, tente novamente");
            }else{
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            // imrpimir tabuleiro

            for (int i = 0; i < jogoVelha.length; i++){
                for (int j = 0; j < jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println();
            }

            //verificar quem ganhou
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||    // linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X' ) ||  // linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X' ) ||  // linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X' ) ||  // coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X' ) ||  // coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X' ) ||  // coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X' )){   //diagonal

                ganhou = true;
                System.out.println("Parabéns jogador 1 ganhou!!!");

            }else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||    // linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O' ) ||  // linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O' ) ||  // linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O' ) ||  // coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O' ) ||  // coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O' ) ||  // coluna 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O' )){   //diagonal

                ganhou = true;
                System.out.println("Parabéns jogador 2 ganhou!!!");

            }else if (jogada > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou a partida!");
            }
        }
    }
}
