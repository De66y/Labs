package javaa.lab12;

import java.util.ArrayList;

public class MyAnn {

    public static void main(String[] args) {
        System.out.println(new AnnotationReader().readAnnotationsFromMethods(Person.class, new ArrayList<>()));
    }
}
