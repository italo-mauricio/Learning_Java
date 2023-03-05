package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity of liters sold: ");
        double liters = scan.nextDouble();

        System.out.println("Enter the type of fuel: ");
        String type = scan.next();

        double gasPrice = 2.5;
        double ethanolPrice = 1.9;
        int discountPrice = 0;
        double total = 0;
        double totalDiscount = 0;

        if (type.equalsIgnoreCase("a")) {
            if (liters <= 20) {
                discountPrice = 3;
            } else {
                discountPrice = 5;
            }
            total = liters * ethanolPrice;

        } else if (type.equalsIgnoreCase("g")) {
            if (liters <= 20) {
                discountPrice = 4;
            } else {
                discountPrice = 6;
            }
            total = liters * gasPrice;
        }
        totalDiscount = (total / 100) * discountPrice;
        double priceToPay = total - totalDiscount;
        System.out.println("Amount to be paid: " + priceToPay);
    }
}