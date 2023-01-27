import java.util.Scanner;


public class LeituraDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Você tem " + idade + " anos de idade");
    }
}
