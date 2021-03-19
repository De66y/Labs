//1. Som voor jaren opgeven waarvoor je interest kan berekenen?????
//3. print statement uit elkaar halen zoals op de foto voor betere test.
//4. Printen met slasjes
//5. Accountnumber laten maken door de backoffice??
//6. Afvangen of het accountnummer bestaat
//7. Testjes

package labs7.opdr34;

import java.util.ArrayList;
import java.util.Scanner;

public class MyBankApp {

    public static void main(String[] args) {
        ATM ATM = new ATM();
        ATM.mainMenu(new Scanner(System.in), new Bank(new ArrayList<>(), new BackOffice()));


    }
}
