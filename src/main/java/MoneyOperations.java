import java.math.BigDecimal;

public class MoneyOperations {

    public BigDecimal deposit(BigDecimal amount) {


        envelopeBalance += amount;

        envelopesHistory.add(String.valueOf("D" + amount));

        return balance;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("There are not enough savings in the envelope.");
        }
        balance -= amount;
        envelopesHistory.add(String.valueOf("W" + amount));

        return balance;
    }


    public double getBalance() {
        System.out.println("The current balance of an envelope - " + envelopesType + " is:");
        return balance;
    }




}
