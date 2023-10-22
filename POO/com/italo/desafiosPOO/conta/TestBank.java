package POO.com.italo.desafiosPOO.conta;

public class TestBank {
    public static void main(String[] args) {
        System.out.println("*** Account Testing ***");

        AccountBank accountSimple = new AccountBank();
        accountSimple.setClientName("Client simple account");
        accountSimple.setAccountNumber("12345");
        accountSimple.deposit(100);
        withdrawFunds(accountSimple, 50);
        withdrawFunds(accountSimple, 70);

        System.out.println(accountSimple);
    }
    private static void withdrawFunds(AccountBank accountBank, double value){
        if (accountBank.withdraw(value)){
            System.out.println("Withdraw Sucessfully, new balance: " + accountBank.getCurrency());
        } else {
            System.out.println("Insufficient funds for withdrawal: " + value + " current balance: " + accountBank.getCurrency());
        }
    }
}
