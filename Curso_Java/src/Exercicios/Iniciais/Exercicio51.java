package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * programa para calcular média de idades
 */

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de idades: ");
        int idades = scan.nextInt();

        int idade;
        int soma = 0;

        for (int i = 0; i < idades; i++){
            System.out.println("Digite a idade da pessoa: " + (i+1));
            idade = scan.nextInt();
            soma += idade;
        }
        double media = soma / idades;

        System.out.println("Média de idades: " + media );

        if (media >= 0 && media <= 25){
            System.out.println("Jovem");
        }else if (media >= 26 && media <= 60){
            System.out.println("Adulta");
        }else if (media > 60){
            System.out.println("Idoso");
        }
    }
}
