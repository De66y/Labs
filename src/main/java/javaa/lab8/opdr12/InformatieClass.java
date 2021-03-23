package javaa.lab8.opdr12;

import javaa.labs7.opdr12.Person;

import java.lang.reflect.Method;

public class InformatieClass {

    public static void printMethods(Method array[]) {
        for (int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printClassName() {
        System.out.println("Classname is: " + Person.class.getSimpleName());
    }


}
