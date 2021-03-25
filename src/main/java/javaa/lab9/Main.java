package javaa.lab9;

import javaa.labs7.opdr12.Gender;

public class Main {

    public static void main(String[] args) {
        try {
            Person p2 = new Person("Arnold", 25);
            Person p = new Person("Jane", 7);
            System.gc();
            Thread.sleep(5000);
            p = null;
            System.gc();
            Thread.sleep(5000);
            p2 = null;
            System.gc();
            Thread.sleep(5000);
            Person p1 = new Person("Bella", 3);
            System.gc();
            Thread.sleep(5000);
            Person p3 = new Person("Beer", 45, Gender.FEMALE);
            System.gc();
            Thread.sleep(5000);
            System.out.println("Ready");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
