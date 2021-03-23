package javaa.labs4.opdr2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Temprature temprature = new Temprature();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef in het engels en met capitale letters aan van welk seizoen je de tempratuur wilt weten : ");
        temprature.start(scanner.nextLine());

    }
}
