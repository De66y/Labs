//1. Som voor jaren opgeven waarvoor je interest kan berekenen?????
//2. Bank een naam geven en aan het menu meegeven in goedemiddag
//3. print statement uit elkaar halen zoals op de foto voor betere test.
//4. Printen met slasjes
//5. Accountnumber laten maken door de backoffice??
//6. Afvangen of het accountnummer bestaat

package labs7.opdr34;

import java.util.ArrayList;
import java.util.Scanner;

// nog een keer testjes maken (eigenlijk tegelijk doen met code schrijven)
public class MyBankApp {

    public static void main(String[] args) {
        // object met kleine letters
        ATM atm = new ATM();
        atm.mainMenu(new Scanner(System.in), new Bank(new ArrayList<>(), new BackOffice()));

    }
}
