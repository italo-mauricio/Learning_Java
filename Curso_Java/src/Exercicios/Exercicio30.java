package Exercicios;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("-    JOGO DETETIVE    -");
        System.out.println("-                     -");
        System.out.println("=======================");
        System.out.println("Por favor digite o nome do seu personagem: ");
        String nome = scan.next();
        System.out.println("Bem vindo " + nome + " iremos te fazer algumas perguntas");
    }
}
