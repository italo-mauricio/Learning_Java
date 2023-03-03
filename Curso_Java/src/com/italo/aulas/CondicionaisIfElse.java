package Curso_Java.src.com.italo.aulas;

import java.util.Scanner;

public class CondicionaisIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade, você tem: " + idade + " anos");
            System.out.println("Você tem idade válida para comprar!");
            System.out.print("Digite o valor do item: ");
            double valor = scan.nextDouble();
            if (valor <= 10){
                System.out.println("Está muito barato, pode comprar!");
            }else if (valor > 10 && valor < 15){
                System.out.println("Você pode pedir um desconto!");
            }else if (valor >= 15 && valor < 17){
                System.out.println("Você pode pesquisar mais!");
            }else if (valor > 17){
                System.out.println("Está muito caro!");
            }
        }else{
            System.out.println("É menor de idade, sua idade é de: " + idade + " anos");
        }

    }
}
