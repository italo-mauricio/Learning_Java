package POO.com.italo.exercicios.Ex16;


import java.util.Scanner;

/**
 * Escreva um método para calcular fatorial de um número na classe calculadora do Exercicio anterior
 */


public class AppFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do{
            System.out.print("Digite um número positivo");
            num = scan.nextInt();
            if(num < 0){
                System.out.println("Número inválido, não pode ser menor que ZERO");
            }
        }while(num < 0);

        System.out.println("O fatorial de: "+ num + "\né: " + Fatorial.fatorialRecursivo(num));
    }
}
