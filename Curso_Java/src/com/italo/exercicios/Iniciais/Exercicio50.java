package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * saber a quantidade de notas usando for e tirando a média aritmética
 */
public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i=0; i<notas; i++){
            System.out.println("Digite a nota: " + (i+1));
            nota = scan.nextDouble();
            soma += nota;

        }
        media = soma / notas;
        System.out.println("Soma: " + soma);
        System.out.println("Médias: " + media);
        if (media < 3){
            System.out.println("Situação: reprovado");
        }else if (media <= 5){
            System.out.println("Situação: Recuperação");
        }else if (media <= 10){
            System.out.println("Situação: Aprovado");
        }else if (media > 10){
            System.out.println("Situação: Extra aprovado!");
        }
    }
}
