package labs4.opdr1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm {

    public void start () {
        String accountNumber = receiveBankAccountNumber(new Scanner(System.in));
        if (!checkValidBankAccountNumber(accountNumber)) { //If de bankaccount is valid
            int sumOfTotal = totalOfMultiply(new ArrayList<>(), accountNumber);
            bankAccountYesOrNo(sumOfTotal);
        }
    }

    public String receiveBankAccountNumber(Scanner scanner) {
        System.out.print("Goedendag, voer uw rekeningnummer in: ");
        return scanner.nextLine();
    }

    public boolean checkValidBankAccountNumber(String givenBankAccountNumber) {
        try {
            if (!givenBankAccountNumber.matches("[0-9]+")) {
                //throw new IllegalArgumentException("De invoer klopt niet");
                throw new NumberFormatException("De invoer klopt niet");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public int totalOfMultiply(List<Integer> opslagLijst, String bankAccount) {
        int counter = bankAccount.length();

        for (int i = 0; i < bankAccount.length(); i++) {
            int j = Integer.parseInt(bankAccount.substring(i, i + 1)) * counter;
            opslagLijst.add(j);
            counter--;
        }

        int totaal = 0;
        for (Integer getal : opslagLijst) {
            totaal += getal;
        }
        return totaal;
    }

    public String bankAccountYesOrNo(int sumOfTotal) {
        try {
            if (!(sumOfTotal % 11 == 0)) {
                throw new IllegalArgumentException("Dit is geen bankrekeningnummer.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return "Dit is een bankrekeningnummer.";
    }


}
