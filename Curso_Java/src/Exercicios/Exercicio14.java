package Curso_Java.src.Exercicios;
import java.util.Scanner;

/***
 * Compare dois números e determine qual é o maior
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();


        if (num1 > num2){
            System.out.println("O primeiro número é MAIOR que o segundo número são eles: " + num1 + " e " + num2);
        }else {
            System.out.println("O primeiro número é MENOR que o segundo número, são eles: " + num1 + " e " + num2);
        }
    }
}
