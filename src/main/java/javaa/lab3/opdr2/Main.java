package javaa.lab3.opdr2;

public class Main {

    public static void main(String[] args) {
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);

        //Als i is kleiner dan 3?
        //i++ + ++i
        //3   + 7   = 7

        //Anders
        //In binary ++i = 4  0100
        //Daarna alles 1 plek naar rechts opschuiven opschuiven 0010 en dan is 2.
        //Links wordt aangevuld met nullen zodat het een positief getal blijft.


    }
}
