package Curso_Java.src.com.italo.exercicios.Iniciais;


import java.util.Scanner;

/***
 Converting degrees Fahrenheit to Celsius
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        double degreesFarenheit = scan.nextDouble();
        double degreesCelsius = (5 * (degreesFarenheit - 32) / 9);
        String message = String.format("The temperature: %.4s F converted to Celsius is ===> %.4s C", degreesFarenheit, degreesCelsius );

        System.out.println(message);
    }
}