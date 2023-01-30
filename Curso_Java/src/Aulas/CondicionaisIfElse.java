package Aulas;

import java.util.Scanner;

public class CondicionaisIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade, você tem: " + idade + " anos");
        }else{
            System.out.println("É menor de idade, sua idade é de: " + idade + " anos");
        }
    }
}
