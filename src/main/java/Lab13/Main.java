package Lab13;

import javaa.lab10.Andriod;
import javaa.lab10.Employee;
import javaa.lab10.Person;
import javaa.lab10.Teacher;
import javaa.labs7.opdr12.Gender;

public class Main {

    public static void main(String[] args) {
        House<Person> huis = new House<>(new Person("Piet", 10));
        System.out.println(huis.toString());
        House<Employee> huis1 = new House<>(new Employee("Werkster", 45));
        System.out.println(huis1.toString());
        House<Teacher> huis2 = new House<>(new Teacher("Lerares", 31, Gender.FEMALE));
        System.out.println(huis2.toString());
    }
}
