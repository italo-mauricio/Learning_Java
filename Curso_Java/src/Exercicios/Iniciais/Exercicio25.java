package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar
 * se os valores podem ser um triângulo, indique caso os lados formem um triângulo, se o mesmo é:
 * equilátero, isóceles ou escaleno.
 */
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        int lado1 = scan.nextInt();
        System.out.print("Digite o lado 2: ");
        int lado2 = scan.nextInt();
        System.out.print("Digite o lado 3: ");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2) ||
                ((lado2 + lado3) > lado1)){
            if (lado1 == lado2 && lado1 == lado3){
                System.out.println("Triângulo Equilátero");
            }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");
            }else {
                System.out.println("Triângulo Escaleno");
            }
        }else {
            System.out.println("Não forma um triângulo");
        }
    }
}
