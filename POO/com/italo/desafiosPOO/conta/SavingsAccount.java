package POO.com.italo.desafiosPOO.conta;

import java.util.Calendar;

public class SavingsAccount extends AccountBank{
    private int dayPerformance;

    public int getDayPerformance() {
        return dayPerformance;
    }

    public void setDayPerformance(int dayPerformance) {
        this.dayPerformance = dayPerformance;
    }

    @Override
    public String toString() {
        return "Account Savings! " + "\n" +
                "Performance Day = " + dayPerformance + "\n" +
                super.toString();
    }

    public boolean calculateNewBalance(double yieldRate){
        Calendar today = Calendar.getInstance();

        if (dayPerformance == today.get(Calendar.DAY_OF_MONTH)){
          //  currency += currency * yieldRate;
            this.setCurrency(this.getCurrency() + (this.getCurrency() * yieldRate));
            return true;
        }
        return false;
    }
}
