package labs4.opdr1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm {

    public void start () {
        String accountNumber = receiveBankAccountNumber(new Scanner(System.in));
        if (checkValidBankAccountNumber(accountNumber)) { //If de bankaccount is valid
            int sumOfTotal = totalOfMultiply(new ArrayList<>(), accountNumber);
            System.out.println(bankAccountYesOrNo(sumOfTotal));
        }
    }

    public String receiveBankAccountNumber(Scanner scanner) {
        System.out.print("Goedendag, voer uw rekeningnummer in: ");
        return scanner.nextLine();
    }

    public boolean checkValidBankAccountNumber(String givenBankAccountNumber) {
        boolean boo = false;
        try {
            if (!givenBankAccountNumber.matches("[0-9]+")) { //if het nummer niet matches
                throw new NumberFormatException("De invoer klopt niet");
            } else {boo = true;}
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return boo;
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
        String yesOrNo = null;
        try {
            if (!(sumOfTotal % 11 == 0)) {
                throw new IllegalArgumentException("Dit is geen bankrekeningnummer.");
            } else{yesOrNo = "Dit is een bankrekeningnummer.";}
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return yesOrNo;
    }


}
