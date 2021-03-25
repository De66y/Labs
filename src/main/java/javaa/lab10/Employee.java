package javaa.lab10;

import javaa.labs7.opdr12.Gender;

public class Employee extends Person{

    //Door het super keyword hoef je hier niet opnieuw variabelen te defineren.
    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String greet() {
        return "I'm tired of working. This is inhuman!";
    }
}
