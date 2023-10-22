package POO.com.italo.desafiosPOO.conta;

public class TestBank {
    public static void main(String[] args) {
        System.out.println("*** Account Testing ***");

        SavingsAccount savingsAccount  = new SavingsAccount();
        savingsAccount.setClientName("Client Saving Account");
        savingsAccount.setAccountNumber("12345");
        savingsAccount.deposit(100);
        withdrawFunds(savingsAccount, 50);
        withdrawFunds(savingsAccount, 70);

        System.out.println(savingsAccount);
    }
    private static void withdrawFunds(AccountBank accountBank, double value){
        if (accountBank.withdraw(value)){
            System.out.println("Withdraw Sucessfully, new balance: " + accountBank.getCurrency());
        } else {
            System.out.println("Insufficient funds for withdrawal: " + value + " current balance: " + accountBank.getCurrency());
        }
    }
}
