package javaa.lab12;

import javaa.lab10.Human;
import javaa.labs7.opdr12.Gender;
import javaa.labs7.opdr12.PersonHasDiedException;

public class Person extends Human {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        gender = Gender.UNKNOWN;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @MyAnnotation
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

    @MyAnnotation2
    public static int numberOfPossibleGenders() {
        return Gender.values().length;
    }

    @MyAnnotation2
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


}
