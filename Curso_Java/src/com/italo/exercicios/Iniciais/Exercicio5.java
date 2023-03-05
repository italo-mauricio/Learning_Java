package Curso_Java.src.com.italo.exercicios.Iniciais;
import java.util.Scanner;

/***

 Make a program that asks for the radius of a circle, calculates and shows its area.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
    }
}