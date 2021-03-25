package javaa.lab10;

public class Andriod extends Human implements Chargeable{
    private int level;

    @Override
    public String greet() {
        return "I'm only half human, but human stil.... My energy level is " + level + "%.";
    }

    @Override
    public int charge(int amount) {
        if ((level +amount) > 100) {
            return level;
        }
        return level += amount;
    }
}
