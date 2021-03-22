package lab5.opdr3;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int number) {
        //Zichzelf steeds aan laten roepen
        int uitkomst = number;
        for ( int i = number; i< number; i++) {
            uitkomst = uitkomst * (number-1);
        }
       return uitkomst;

    }
}
