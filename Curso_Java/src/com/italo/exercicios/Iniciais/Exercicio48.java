package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * calculando o fatorial de um número
 */

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.print(num + "! = ");

        int fatorial = 1;

        for (int i = num; i > 0; i--){
            fatorial *= i;
            System.out.print(i + "\n");
        }

        System.out.println("Resultado : " + fatorial);


    }
}
