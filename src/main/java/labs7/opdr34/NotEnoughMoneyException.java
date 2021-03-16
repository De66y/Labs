package labs7.opdr34;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException() {
        super("Er staat niet genoeg op uw bankrekening om deze transactie uit te voeren");
    }

    public NotEnoughMoneyException (int cijfer) {
        super("Er staat niet genoeg op de rekening van de tegenpartij om deze transactie uit te voeren");
    }
}
