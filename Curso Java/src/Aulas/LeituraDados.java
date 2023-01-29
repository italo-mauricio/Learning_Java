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
        System.out.println("Vamos recolher mais informações suas!");
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem algum animal de estimação: ");
        String primeiroNome1 = scan.next();
        int idade2 = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura2 = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        System.out.println("======================================");
        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Nome: " + primeiroNome1);
        System.out.println("Idade: " + idade2);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura2);
        System.out.println("Tem pet: " + temPet);
        System.out.println("======================================");




    }
}
