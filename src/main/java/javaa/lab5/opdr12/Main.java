package javaa.lab5.opdr12;

public class Main {

    public static void main(String[] args) {
        System.out.println("Opdracht 1");
        System.out.println(greatest(4, 10));
        System.out.println(greatest(-5, 7));
        System.out.println(greatest(5, 5));
        System.out.println(greatest(9, -4));

        System.out.println("Opdracht 2 String");
        System.out.println(greatest("Velaris", "Outlander"));
        System.out.println(greatest("Feyre", "Rhys"));
        System.out.println(greatest("Zonderling", "Blood heir"));

        System.out.println("Opdracht 2 Array");
        int greatestNumber = Integer.MIN_VALUE;
        System.out.println(greatest(5, -34847, 7, 6));
    }

    //Opdracht 1
    public static int greatest (int a, int b) {
        if ( a > b) {
            return a;
        } else if ( a == b) {
            return 0;
        }else {
            return b;
        }
        //Korte variant zonder wanneer getallen gelijk zijn return (a>b) ? a : b;
    }

    //Opdracht 2
    public static String greatest (String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else if (a.length() == b.length()) {
            return "Beide Strings zijn even lang";
        }else {
            return b;
        }
    }

    public static int greatest (int ... numbers) {
        int greatestNumber = Integer.MIN_VALUE;
        for (int i :numbers) {
            greatestNumber = (i>greatestNumber) ? i : greatestNumber;
        }
        return greatestNumber;
    }
}
