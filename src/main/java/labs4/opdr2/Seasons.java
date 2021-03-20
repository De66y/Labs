package labs4.opdr2;

public enum Seasons {
    SPRING("Warm"), SUMMER("Warm"), FALL("Cold"), WINTER("Cold"),
    WET("Unknown"), DRY("Unknown");

    private String temprature;
    Seasons(String temprature) {
        this.temprature = temprature;
    }

    public String getTemprature() {
        return temprature;
    }
}
