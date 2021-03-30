package javaa.lab11;

import javaa.lab10.Human;
import javaa.labs7.opdr12.Gender;
import javaa.labs7.opdr12.PersonHasDiedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person extends Human {
    private String name;
    private int age;
    private Gender gender;
    private HistoryRecord[] historyRecordList;
    private int historyRecordCounter = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        gender = Gender.UNKNOWN;
        historyRecordList = new HistoryRecord[100];
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        historyRecordList = new HistoryRecord[100];
    }

    public void haveBirthday() {
        try {
            age++;
            if (age > 130) {
                throw new PersonHasDiedException(name + " had died");
            }
        } catch (PersonHasDiedException ex) {
            System.out.println("Catch print: " + ex.getMessage());
        }
    }

    public static int numberOfPossibleGenders() {
        return Gender.values().length;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }


    //Lab 8 opdr 1
    @Override
    public String toString() {
        return String.format("%s (%d) is " + this.getGender(), this.getName() + "", this.getAge());
    }

    @Override
    public String greet() {
        return "Hello, my name is " +name + ". Nice to meet you!";
    }

    //Lab 8 opdr 1
    @Override
    public boolean equals(Object o) {
        if (this==o) {                                  //if adressen zijn hetzelfde
            return true;
        }
        if (o == null || getClass() != o.getClass()) { //if o is null or class type is not equal
            return false;
        }
        Person person = (Person) o;
        return name == person.name &&
                age == person.age &&
                gender == person.gender;

    }

    @Override
    public int hashCode() {
        return age * name.hashCode() * gender.hashCode();
    }

    //Lab 11 opdr 4
    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() {
                return "Sub is het best";
            }
        };
    }

    //Lab 11 opdr 3
    public void printHistory() {
        for (int i = 0; i<historyRecordList.length; i++){
            if(historyRecordList[i] != null)
            System.out.println(historyRecordList[i]);
        }
    }

    //Lab 11 opdr 2
    public void addHistory(String descr) {
        historyRecordList[historyRecordCounter] = new HistoryRecord(descr);
        this.historyRecordCounter++;
    }

    //Lab 11 opdr 1 private inner class
    private class HistoryRecord {
    String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }


}
