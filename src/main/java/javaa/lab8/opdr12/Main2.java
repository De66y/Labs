package javaa.lab8.opdr12;

import javaa.labs7.opdr12.Gender;
import javaa.labs7.opdr12.Person;

public class Main2 {
    public static void main(String[] args) {
        Person p = new Person("Jan", 45, Gender.MALE);
        //Lab 8 opdr 1
        System.out.println(p.toString());

        Person p2 = new Person("Jan", 46, Gender.MALE); //true omdat laatste return checked of de waardes van de velden gelijk zijn, niet het adres van het object
        System.out.println(p2.equals(p));

        System.out.println(p2.hashCode());

        //Lab 8 opdr 2
        InformatieClass.printMethods(Person.class.getMethods());
        InformatieClass.printClassName();
    }
}
