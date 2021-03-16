package labs7.opdr34;

import java.util.List;

public class Bank {
    private List<BankAccount> bank;
    private int countAccountNumber;

    public Bank(List<BankAccount> bank) {
        this.bank = bank;
    }

    public List<BankAccount> getBank() {
        return bank;
    }
    public void setBank(BankAccount bankAccount) {
        this.bank.add(bankAccount);
    } //Aangepast

    public int getCountAccountNumber() {
        return countAccountNumber;
    }
    public void setCountAccountNumber(int countAccountNumber) {
        this.countAccountNumber = countAccountNumber;
    }

    public void printAllBankRecords() {
        for (BankAccount bankAccount: this.getBank()) {
            System.out.println("Accountnummer: " + bankAccount.getAccountNumber() + " || " +
                    "Totaalbedrag op de rekening: " + bankAccount.getBalance() + " || " +
                    "Rente op dit moment voor één jaar: " + bankAccount.getInterestRate());
        }
    }
}
