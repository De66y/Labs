package javaa.lab9;

import javaa.labs7.opdr12.Gender;
import javaa.labs7.opdr12.PersonHasDiedException;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    //Opdracht 1 roept constructor aan met de 2 variabelen en 3x this
    public Person(String name, int age) {
        this(name, age, Gender.UNKNOWN);
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    //can be overriden to specify what to do when a given object is garbage collected
    //(actually what to do just before it is garbage collected, automatic or with System.gc).
    //Va java 9 niet meer mogelijk om te gebruiken.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize was called");
    }
}
