package labs7.opdr34;

// ruim oude imoprts op m.b.v. IDEA
import java.math.BigDecimal;

public class BackOffice {

    // Denk om je code layout. is bijna netjes, maar kan nog iets beter. Gewoon IDEA laten doen, da's altijd goed.

    public void depositMoney(BigDecimal amount, BankAccount bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance().add(amount));
    }

    public void withdrawMoney(BigDecimal amount, BankAccount bankAccount) {
        if (bankAccount.getBalance().subtract(amount).compareTo(BigDecimal.ZERO) == -1) { //-1 als de som kleiner is dan zero
            throw new NotEnoughMoneyException();
        } else {
            bankAccount.setBalance(bankAccount.getBalance().subtract(amount));
        }
    }

}
