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

            String name = scan.nextLine();
            String phone = scan.nextLine();
            String email = scan.nextLine();

        }
    }
}
