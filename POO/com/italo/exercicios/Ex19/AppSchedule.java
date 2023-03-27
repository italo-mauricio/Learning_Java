package POO.com.italo.exercicios.Ex19;

import java.util.Scanner;

public class AppSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         Schedule schedule = new Schedule();

        System.out.println("Type your schedule name: ");
        String schuuName = scan.nextLine();

        Contact[] contacts = new Contact[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Type contact informations: " + (i+1));
            Contact c = new Contact();

            System.out.println("Enter your name: ");
            String name = scan.nextLine();
            c.setName(name);
            System.out.println("Enter your age: ");
            String age = scan.nextLine();
            c.setAge(age);
            System.out.println("Enter your email: ");
            String email = scan.nextLine();
            c.setEmail(email);

        }
    }
}
