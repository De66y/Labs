package labs7.opdr34;

import java.util.List;

public class Bank {
    private final String name = "DebBank";
    private List<BankAccount> bank;
    private int countAccountNumber;
    private BackOffice backOffice;

    public Bank(List<BankAccount> bank, BackOffice backOffice) {
        this.bank = bank;
        this.backOffice = backOffice;
    }

    public String getName() {
        return name;
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

    public BackOffice getBackOffice() {
        return backOffice;
    }

    public void printAllBankRecords() {
        for (BankAccount bankAccount: this.getBank()) {
            // je zou ook een toString kunnen maken in Bank hiervoor:
            System.out.println("Accountnummer: " + bankAccount.getAccountNumber() + " || " +
                    "Totaalbedrag op de rekening: " + bankAccount.getBalance() + " || " +
                    "Rente op dit moment voor één jaar: " + bankAccount.getInterestRate());
        }
    }
}
