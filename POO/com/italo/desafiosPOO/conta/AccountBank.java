package POO.com.italo.desafiosPOO.conta;

public class AccountBank {

    private String clientName;
    private String accountNumber;
    private double currency;

    @Override
    public String toString() {
        return "AccountBank! " + "\n" +
                "ClientName = " + clientName + "\n" +
                "AccountNumber = " + accountNumber + "\n" +
                "Currency = " + currency + "\n";
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }


    public void deposit(double value){
        currency += value;
    }

    public boolean withdraw(double value){
        if((currency - value) >= 0){
            currency -= value;
            return true;
        }
        return false;
    }
}
