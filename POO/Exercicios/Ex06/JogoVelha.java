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

    void exibirTabuleiro(){

        for (int i = 0; i < jogoVelha.length; i++){
            for (int j = 0; j < jogoVelha[i].length; j++){
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    void verificarGanhador(){
        //verificar quem ganhou
        if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||    // linha 1
                (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X' ) ||  // linha 2
                (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X' ) ||  // linha 3
                (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X' ) ||  // coluna 1
                (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X' ) ||  // coluna 2
                (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X' ) ||  // coluna 3
                (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X' ) ||  // diagonal
                (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X') ){   //diagonal inversa


    }
}
