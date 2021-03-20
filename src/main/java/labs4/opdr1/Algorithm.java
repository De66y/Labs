package labs4.opdr1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm {


    public void askBankAccountNumber(Scanner scanner) {
        try {
            System.out.print("Goedendag, voer uw rekeningnummer in: ");
            String givenBankAccountNumber = scanner.nextLine();
            List<Integer> opslagLijst = new ArrayList<>();
            int counter = givenBankAccountNumber.length();
            if (givenBankAccountNumber.matches("[0-9]+")) {
                for (int i = 0; i < givenBankAccountNumber.length(); i++) {
                    int j = Integer.parseInt(givenBankAccountNumber.substring(i, i + 1)) * counter;
                    opslagLijst.add(j);
                    counter--;
                }
                int totaal = 0;
                for (Integer getal : opslagLijst) {
                    totaal += getal;
                }

                if (totaal % 11 == 0) {
                    System.out.println("Dit is een bankrekeningnummer.");
                } else {
                    throw new IllegalArgumentException("Dit is geen bankrekeningnummer.");
                }
            } else {
                throw new IllegalArgumentException("De invoer klopt niet");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
