package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número ");
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++){
            System.out.println(i);
        }
    }
}
