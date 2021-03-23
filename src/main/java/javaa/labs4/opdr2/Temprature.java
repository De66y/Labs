package javaa.labs4.opdr2;

public class Temprature {

    public void start(String input) {
        switch (input) {
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
