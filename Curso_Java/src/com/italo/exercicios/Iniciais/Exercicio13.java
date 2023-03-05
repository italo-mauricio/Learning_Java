package Curso_Java.src.com.italo.exercicios.Iniciais;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the file size: ");
        double fileSize = scan.nextDouble();

        System.out.print("Enter the internet speed: ");
        double internetSpeed = scan.nextDouble();

        double time = fileSize / internetSpeed;

        System.out.println("DOWNLOAD time is: " + time);
    }
}

