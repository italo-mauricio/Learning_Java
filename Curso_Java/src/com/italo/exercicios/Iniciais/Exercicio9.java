package Curso_Java.src.com.italo.exercicios.Iniciais;
import java.util.Scanner;

/***

 Converting from Celsius to Fahrenheit
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 1.8 + 32);

        String message = String.format("The temperature %.4s C converted to Fahrenheit is ===> %.4s F", celsius, fahrenheit );

        System.out.println(message);
    }
}