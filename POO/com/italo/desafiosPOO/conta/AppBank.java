package POO.com.italo.desafiosPOO.conta;

public class AppBank {
    public static void main(String[] args) {
        System.out.println("*** Account Testing ***");

        AccountBank accountSimple = new AccountBank();
        accountSimple.setClientName("Client simple account");
        accountSimple.setAccountNumber("12345");

        System.out.println(accountSimple);
    }
}
