package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * formatando o exercicio de fatorial de outra forma
 */

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Fatorial de " + num);
        System.out.print(num + " != ");
        int fatorial = 1;
        for (int i = num; i > 1; i--){
            fatorial *= i;
            System.out.print(i + " . ");
        }
        System.out.println(" 1 = " + fatorial);

    }
}
