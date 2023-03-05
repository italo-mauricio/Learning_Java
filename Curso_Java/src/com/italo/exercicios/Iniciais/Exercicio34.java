package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;
/*
Create a code that validates basic registration information
*/
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String name;
        String gender;
        String maritalStatus;
        int age;
        double salary;
        boolean validInfo = false;

        do {
            System.out.print("Enter your name: ");
            name = scan.next();
            if (name.length() >= 3) {
                validInfo = true;
                System.out.println("Valid name!");
            } else {
                System.out.println("Invalid name!");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.print("Enter your age: ");
            age = scan.nextInt();

            if (age >= 0 && age <= 120) {
                validInfo = true;
                System.out.println("Valid age!");
            } else {
                System.out.println("Invalid age!");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.print("Enter your salary: ");
            salary = scan.nextDouble();

            if (salary > 0) {
                validInfo = true;
                System.out.println("Valid salary!");
            } else {
                System.out.println("Invalid salary!");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.print("Enter your gender [M/F/O]: ");
            gender = scan.next();

            if (gender.equalsIgnoreCase("f") ||
                    gender.equalsIgnoreCase("m") ||
                    gender.equalsIgnoreCase("o")) {
                validInfo = true;
                System.out.println("Valid gender!");
                if (gender.equals("f")) {
                    System.out.println("Female");
                    gender = "Female";
                } else if (gender.equals("m")) {
                    System.out.println("Male");
                    gender = "Male";
                } else if (gender.equals("o")) {
                    System.out.println("You chose other");
                    System.out.print("Enter your gender: ");
                    String newGender = scan.next();
                    gender = newGender;
                }
            } else {
                System.out.println("Invalid gender!");
            }
        } while (!validInfo);

        validInfo = false;

        do {
            System.out.print("Enter your marital status [S/C/V]: ");
            maritalStatus = scan.next();

            if (maritalStatus.equalsIgnoreCase("s") ||
                    maritalStatus.equalsIgnoreCase("c") ||
                    maritalStatus.equalsIgnoreCase("v")) {
                validInfo = true;
                System.out.println("Valid marital status!");
                if (maritalStatus.equals("s")) {
                    System.out.println("Single");
                    maritalStatus = "Single";
                } else if (maritalStatus.equals("c")) {
                    System.out.println("Married");
                    maritalStatus = "Married";
                } else if (maritalStatus.equals("v")) {
                    System.out.println("Widowed");
                    maritalStatus = "Widowed";
                }
            } else {
                System.out.println("Invalid marital status!");
            }
        } while (!validInfo);

        System.out.println("The information entered was!!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marital status: " + maritalStatus);
        System.out.println("Salary: " + salary + " R$");
        System.out.println("REGISTRATION EFFECTED!");
    }
}