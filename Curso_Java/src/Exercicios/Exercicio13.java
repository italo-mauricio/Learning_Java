package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.print("Digite a velocidade da internet: ");
        double velocidadeNet = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidadeNet;

        System.out.println("Tempo de DOWNLOAD é: " + tempo);
    }
}
