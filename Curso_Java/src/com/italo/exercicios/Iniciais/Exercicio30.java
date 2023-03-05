package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Create a mini game of questions and answers asking if a person witnessed a crime or not
 */

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("- DETECTIVE GAME -");
        System.out.println("- -");
        System.out.println("=======================");
        System.out.println("Please enter your character name: ");
        String name = scan.next();
        System.out.println("Welcome " + name + " there was a murder this morning\n" +
                "and people said they saw you around the area today, we are going to ask you some questions.");
        System.out.print("Did you call the victim [Y/N]: ");
        String question1 = scan.next();
        System.out.print("Were you at the scene of the crime [Y/N]: ");
        String question2 = scan.next();
        System.out.print("Do you live near the victim [Y/N]: ");
        String question3 = scan.next();
        System.out.print("Do you owe the victim money [Y/N]: ");
        String question4 = scan.next();
        System.out.print("Have you ever worked with the victim [Y/N]: ");
        String question5 = scan.next();


        int count = 0;
        if (question1.equalsIgnoreCase("Y")){
            count++;
        }
        if (question2.equalsIgnoreCase("Y")){
            count++;
        }
        if (question3.equalsIgnoreCase("Y")){
            count++;
        }
        if (question4.equalsIgnoreCase("Y")){
            count++;
        }
        if (question5.equalsIgnoreCase("Y")){
            count++;
        }
        if (count == 2 || count == 1){
            System.out.println("Okay, you are a suspect");
        }else if(count == 3 || count == 4){
            System.out.println("You are an accomplice");
        }else if(count == 5){
            System.out.println("You are under arrest, you are guilty!");
        }else {
            System.out.println("Okay, you are free to go!");
        }
    }
}