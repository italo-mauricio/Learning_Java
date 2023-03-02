package POO.Exercicios.Ex06;

public class JogoVelha {

    char[][] jogoVelha = new char[3][3];
    int jogada = 1;


    boolean validarJogada(int linha, int coluna, char sinal){
        if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
            return false;
        }else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }
}
