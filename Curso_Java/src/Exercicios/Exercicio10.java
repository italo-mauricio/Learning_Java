package Exercicios;


import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Cálculos
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Digite o terceiro número: ");
        float num3 = scan.nextFloat();

        int num4 = 3;
        double resultado1 = (num1 * 2) + (num2 % 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, num4);

        // Resultados
        System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("O terceiro elevado ao cubo é: " + resultado3);



    }
}