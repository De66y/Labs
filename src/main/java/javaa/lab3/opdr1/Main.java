package javaa.lab3.opdr1;

public class Main {
    public static void main(String[] args) {
        plusPlusNumber(4);
        numberPlusPlus(4);
        numberPlusPlusB(4);
    }

    public static void plusPlusNumber(int number){
        System.out.println("4 ++number in printstatement: " + ++number);
    }

    public static void numberPlusPlus(int number){
        System.out.println("4 number++ in printstatement: " + number++);
    }

    public static void numberPlusPlusB(int number){
        ++number;
        System.out.println("4 number++ before printstatement: " + number);
    }


}
