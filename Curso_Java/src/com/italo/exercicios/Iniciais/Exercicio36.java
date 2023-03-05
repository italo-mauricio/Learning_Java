package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Make a program that calculates the amount of years population A will surpass population B
 */
public class Exercicio36 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        boolean valid = false;
        double popA;
        double popB;
        double growthRateA;
        double growthRateB;

        do {
            System.out.println("Enter population A: ");
            popA = scan.nextDouble();

            if (popA > 0) {
                valid = true;
            } else {
                System.out.println("Population A must be greater than zero.");
            }
        } while (!valid);

        valid = false;

        do {
            System.out.println("Enter population B: ");
            popB = scan.nextDouble();

            if (popB > 0) {
                valid = true;
            } else {
                System.out.println("Population B must be greater than zero.");
            }
        } while (!valid);

        valid = false;

        do {
            System.out.println("Enter population A growth rate: ");
            growthRateA = scan.nextDouble();

            if (growthRateA > 0) {
                valid = true;
            } else {
                System.out.println("Population A growth rate must be greater than zero.");
            }
        } while (!valid);

        valid = false;

        do {
            System.out.println("Enter population B growth rate: ");
            growthRateB = scan.nextDouble();

            if (growthRateB > 0) {
                valid = true;
            } else {
                System.out.println("Population B growth rate must be greater than zero.");
            }
        } while (!valid);

        int years = 0;

        while (popA < popB) {
            popA += (popA / 100) * growthRateA;
            popB += (popB / 100) * growthRateB;
            years++;
        }

        System.out.println("Population A: " + popA);
        System.out.println("Population B: " + popB);
        System.out.println("Years: " + years);
    }
}