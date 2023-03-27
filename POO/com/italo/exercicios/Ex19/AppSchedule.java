package POO.com.italo.exercicios.Ex19;

import java.util.Scanner;

public class AppSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Schedule schedule = new Schedule();
        System.out.println("Type your schedule name: ");
        String schuuName = scan.nextLine();

        Contact[] contacts = new Contact[2];
        Phone[] phone = new Phone[2];
        Address add = new Address();


        for(int i = 0; i < 2; i++){
            System.out.println("Type contact informations: " + (i+1));
            Contact c = new Contact();
            Phone p = new Phone();

            System.out.println("Enter your name: ");
            String name = scan.nextLine();
            c.setName(name);
            System.out.println("Enter your age: ");
            String age = scan.nextLine();
            c.setAge(age);
            System.out.println("Enter your email: ");
            String email = scan.nextLine();
            c.setEmail(email);
            System.out.println("Enter your phone ");
            p.setNumeberPhone(scan.nextLine());
            System.out.println("Enter your street: ");
            add.setNameStreet(scan.nextLine());
            System.out.println("Enter your city name: ");
            add.setCity(scan.nextLine());
            System.out.println("Enter your statement: ");
            add.setState(scan.nextLine());
            System.out.println("Enter your CEP: ");
            add.setCep(scan.nextLine());
            System.out.println("Enter your street number: ");
            add.setNumberStreet(scan.nextLine());


            contacts[i] = c;
            phone[i] = p;

        }
        schedule.setContacts(contacts);
        if(schedule != null) {
            System.out.println("Name Diary: " + schuuName);
            System.out.println("Phone: " + phone[1].getNumeberPhone());
        }
    }
}
