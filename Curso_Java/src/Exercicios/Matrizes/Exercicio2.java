package Curso_Java.src.Exercicios.Matrizes;


import java.util.Scanner;

/***
 * Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas
 * da avenida mais movimentada da cidade onde você mora.
 * A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome do filho. Guarde
 * essas informações em uma matriz de forma que cada pessoa entrevistada ocupe somente o espaço necessário na memória
 * para guardar os nomes dos filhos.
 * Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada entrevistado e os respectivos nomes dos filhos.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de pessoas que serão entrevistadas: ");
        int entrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[entrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Quantos filhos você tem: ");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do filho: " + (j+1));
                nomesFilhos[i][j] = scan.next();


            }
        }

        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Pessoa: " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }

        }



    }
}
