package lab6.opdr12;

public class Main {
    public static void main(String[] args) {
        //Opdracht 1
        //Omdat je het adres kopieert van een reference type vervang je in 'beide' als je in 1 aanpast.
        long[] row = new long[4];
        row[2] = 3;               //3
        System.out.println("Voor bewerking: " + row[2]);
        long[] copy = row;        //Array adres gekopieerd naar copy Array
        copy[2]++;                //In copy Array een optellen bij [2]

        System.out.println("Na bewerking van de copy: " + row[2]);

        //Opdracht 2: Er bestaat geen [4]. Array is 4 lang dus het laatste slot is [3].
    }




}
