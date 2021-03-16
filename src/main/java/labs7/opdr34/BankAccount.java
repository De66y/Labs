package labs7.opdr34;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;
    private final BigDecimal interestPercentage = BigDecimal.valueOf(0.1); //Rente is 10%
    private BigDecimal interestRate;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.valueOf(0);
        this.interestRate = BigDecimal.valueOf(0);
    }

    public void depositMoney (BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
    public void depositMoney(BigDecimal amount, BankAccount bankAccount) {
        this.balance = this.balance.add(amount);
        bankAccount.withdrawMoney(amount);
    }
    public void withdrawMoney(BigDecimal amount) {
        if(this.getBalance().subtract(amount).compareTo(BigDecimal.ZERO) == -1) {
            throw new NotEnoughMoneyException(6);
        } else {
            this.balance = this.balance.subtract(amount);
        }

    }
    public void withdrawMoney(BigDecimal amount, BankAccount bankAccount) {

        if(this.getBalance().subtract(amount).compareTo(BigDecimal.ZERO) == -1) { //-1 als de som kleiner is dan zero
            throw new NotEnoughMoneyException();
        } else {
            this.balance = this.balance.subtract(amount);
            bankAccount.depositMoney(amount);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }
    public BigDecimal getInterestRate() {
        this.interestRate = this.balance.multiply(interestPercentage).setScale(2, RoundingMode.HALF_UP);
        return this.interestRate;
    }
}
