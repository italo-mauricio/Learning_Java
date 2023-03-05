package Curso_Java.src.com.italo.exercicios.Iniciais;
import java.util.Scanner;

/**

 Multiplication table generator
 */
public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter a number to generate the multiplication table: ");
        int num = scan.nextInt();
        System.out.println("Multiplication table of " + num);

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}