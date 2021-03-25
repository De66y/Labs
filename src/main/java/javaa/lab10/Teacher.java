package javaa.lab10;

import javaa.labs7.opdr12.Gender;

public class Teacher extends Person{

    //Door het super keyword hoef je hier niet opnieuw variabelen te defineren.
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Gender gender) {
        super(name, age, gender);
    }
}
