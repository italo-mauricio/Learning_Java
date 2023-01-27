import java.util.Scanner;


public class LeituraDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("=============================================================================");
        System.out.println("Seu nome completo é: " + nomeCompleto + "\nSeu primeiro nome é: " + primeiroNome +
                "\nSua idade é: " + idade + "\nSua altura é de: " + altura);
        System.out.println("==============================================================================");



    }
}
