package POO.com.italo.exercicios.Ex19;

import java.util.Scanner;

public class AppSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Schedule schedule = new Schedule();
        System.out.println("Type your schedule name: ");
        schedule.setNameDiary(scan.nextLine());

        Contact[] contacts = new Contact[2];


        for(int i = 0; i < 2; i++){
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
            System.out.println("Enter your phone ");
            String phone = scan.nextLine();
            c.setPhone(phone);
            System.out.println("Enter your street: ");
            String street = scan.nextLine();
            c.setNameStreet(street);
            System.out.println("Enter your city name: ");
            String city = scan.nextLine();
            c.setCity(city);
            System.out.println("Enter your statement: ");
            c.setState(scan.nextLine());
            System.out.println("Enter your CEP: ");
            c.setCep(scan.nextLine());
            System.out.println("Enter your street number: ");
            c.setNumberStreet(scan.nextLine());


            contacts[i] = c;

        }
        schedule.setContacts(contacts);
        if(schedule != null) {
            System.out.println(schedule.obterInfo());
        }
    }
}
