package labs7.opdr34;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ATM ATM = new ATM();
        ATM.mainMenu(new Scanner(System.in), new Bank(new ArrayList<>()));
    }
}
