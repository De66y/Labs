package labs4.opdr2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef in het engels en met capitale letters aan van welk seizoen je de tempratuur wilt weten : ");
        String question = scanner.nextLine();

        switch (question) {
            case "SPRING":
                System.out.println(Seasons.SPRING.getTemprature());
                break;
            case "SUMMER":
                System.out.println(Seasons.SUMMER.getTemprature());
                break;
            case "FALL":
                System.out.println(Seasons.FALL.getTemprature());
                break;
            case "WINTER":
                System.out.println(Seasons.WINTER.getTemprature());
                break;
            case "WET":
                System.out.println(Seasons.WET.getTemprature());
                break;
            case "DRY":
                System.out.println(Seasons.DRY.getTemprature());
                break;
            default:
                System.out.println("Dit is geen geldig seizoen");
        }
    }
}
