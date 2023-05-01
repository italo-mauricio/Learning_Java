package POO.com.italo.aulas.Final2;

import java.util.Scanner;

public class Const {
    public static final String URL_GITHUB = addGithub();
    public static final String URL_TWITTER = addTwitter();
    public static final String URL_CODERSRANK = addCoderank();
    public static final String URL_LINKEDIN = addLinkedin();
    public static String addGithub(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your GitHub: ");
        return scan.nextLine();
    }
    public static String addTwitter(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Your Twitter: ");
        return scan.nextLine();
    }
    public static String addLinkedin(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Your Linkedin: ");
        return scan.nextLine();
    }
    public static String addCoderank(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Your Coderank: ");
        return scan.nextLine();
    }

}


