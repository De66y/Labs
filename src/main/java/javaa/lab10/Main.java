package javaa.lab10;

import javaa.labs7.opdr12.Gender;

//Hij kan bij de Gender omdat alle labs in dezelfde package zitten. Deze niet meegekopieerd.
public class Main {

    public static void main(String[] args) {
        Person p = new Person("Debby", 33);

        System.out.println(p);
        System.out.println(p.greet());

        Andriod a = new Andriod();
        System.out.println(a.greet());

        Employee e = new Employee("Vincent", 37, Gender.MALE);
        System.out.println(e.greet());

        Teacher t = new Teacher("Eric", 25);
        System.out.println(t.greet());
    }
}
