package Curso_Java.src.Exercicios;

/***
 * faça um programa que monte uma tebala de preços de uma loja
 */
public class Exercicio53 {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        for (int i=1; i <= 50; i++){
            System.out.println(i + " R$ " + (1.99 * i));
        }
    }
}
