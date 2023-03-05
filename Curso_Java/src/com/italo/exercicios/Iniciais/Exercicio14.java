package Curso_Java.src.com.italo.exercicios.Iniciais;
import java.util.Scanner;

/***
 * Compare dois números e determine qual é o maior
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();


        if (num1 > num2){
            System.out.println("The first number is GREATER than the second number, which are: " + num1 + " and " + num2);
        }else {
            System.out.println("The first number is LESS than the second number, which are: " + num1 + " and " + num2);
        }
    }
}