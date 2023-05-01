package POO.com.italo.aulas.Final2;

import java.util.Scanner;



public class AppConst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        People people = new People();


        String name = readName(scanner);
        people.setName(name);


        int age = readAge(scanner);
        people.setAge(String.valueOf(age));

        String email = readEmail(scanner);
        people.setEmail(email);

        String password = readPassword(scanner);
        people.setPass(password);

        String address = readAddress(scanner);
        people.setAddress(address);

        String git = Const.URL_GITHUB;
        String twitter = Const.URL_TWITTER;
        String linkedin = Const.URL_LINKEDIN;
        String coderank = Const.URL_CODERSRANK;
        System.out.println("Name: " + people.getName());
        System.out.println("Email: " + people.getEmail());
        System.out.println("Age: " + people.getAge());
        System.out.println("Addres: " + people.getAddress());
        System.out.println("GitHub: " + git);
        System.out.println("Twitter: " + twitter);
        System.out.println("Linkedin: " + linkedin);
        System.out.println("CodeRank: " + coderank);
        System.out.println("Registration completed successfully");
        System.out.println("Follow Your Data");
        scanner.close();
    }

    private static String readName(Scanner scanner) {
        String name = "";

        while (name.trim().isEmpty() || !name.matches("^[a-zA-Z ]+$")) {
            System.out.print("Input Your Name: ");
            name = scanner.nextLine();

            if (name.trim().isEmpty() || !name.matches("^[a-zA-Z ]+$")) {
                System.out.println("Invalid name input: " + name);
            }
        }

        return name;
    }

    private static int readAge(Scanner scanner) {
        int age = -1;

        while (age < 0 || age > 120) {
            System.out.print("Input Your Age: ");
            String ageString = scanner.nextLine();

            try {
                age = Integer.parseInt(ageString);
            } catch (NumberFormatException e) {
                System.out.println("Invalid age input: " + ageString);
            }

            if (age < 0 || age > 120) {
                System.out.println("Invalid age value: " + age);
            }
        }

        return age;
    }

    private static String readEmail(Scanner scanner) {
        String email = "";

        while (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            System.out.print("Input Your Email: ");
            email = scanner.nextLine();

            if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                System.out.println("Invalid email address: " + email);
            }
        }

        return email;
    }

    private static String readPassword(Scanner scanner) {
        String password = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();

            if (password.length() < 8 || password.length() > 20) {
                System.out.println("Invalid password length (must be between 8 and 20 characters).");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Invalid password format (must contain at least one uppercase letter).");
            } else if (!password.matches(".*[a-z].*")) {
                System.out.println("Invalid password format (must contain at least one lowercase letter).");
            } else if (!password.matches(".*[0-9].*")) {
                System.out.println("Invalid password format (must contain at least one digit).");
            } else {
                isValid = true;
            }
        }
        System.out.println("Valid password: " + password);
        return password;
    }
    private static String readAddress(Scanner scanner) {
        String address = "";
        System.out.print("Input Your Address: ");
        address = scanner.nextLine();
        return address;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

