package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String genderM = "You are a man";
        String genderF = "You are a woman";
        System.out.print("Enter your height: ");
        float height = scan.nextFloat();
        System.out.print("Enter your gender [M/F]: ");
        String gender = scan.next();
        System.out.print("Enter your weight: ");
        int weight = scan.nextInt();
        double result = calculadoraImc(weight, height);

        if (gender.equals("M") && result < 18.5) {
            System.out.println(genderM);
            System.out.println("Below ideal weight, your bmi is: " + result);
        } else if (gender.equals("M") && result <= 24.9) {
            System.out.println(genderM);
            System.out.println("Your weight is ideal, your bmi is: " + result);
        } else if (gender.equals("M") && result <= 29.9) {
            System.out.println(genderM);
            System.out.println("Your weight is slightly above average, your bmi is: " + result);
        } else if (gender.equals("M") && result <= 39.9) {
            System.out.println(genderM);
            System.out.println("Your weight is well above average, your bmi is: " + result);
        } else if (gender.equals("M") && result > 40) {
            System.out.println(genderM);
            System.out.println("You are obese, seek a doctor, your bmi is: " + result);
        }
        if (gender.equals("F") && result < 18.5) {
            System.out.println(genderF);
            System.out.println("Below ideal weight, your bmi is: " + result);
        } else if (gender.equals("F") && result <= 24.9) {
            System.out.println(genderF);
            System.out.println("Your weight is ideal, your bmi is: " + result);
        } else if (gender.equals("F") && result <= 29.9) {
            System.out.println(genderF);
            System.out.println("Your weight is slightly above average, your bmi is: " + result);
        } else if (gender.equals("F") && result <= 39.9) {
            System.out.println(genderF);
            System.out.println("Your weight is well above average, your bmi is: " + result);
        } else if (gender.equals("F") && result > 40) {
            System.out.println(genderF);
            System.out.println("You are obese, seek a doctor, your bmi is: " + result);
        }

    }
    static float calculadoraImc(float weight, float height){
        return weight/(height * height);
    }
}