package javaa.lab12;

import java.lang.reflect.Method;
import java.util.List;

public class AnnotationReader {

    public List<String> readAnnotationsFromMethods(Class c, List<String> annotationList) {
        System.out.println("Deze methods hebben MyAnnotation or MyAnnotation2 annotaties in de class: "+c.getSimpleName());
        for (Method m : c.getMethods()) {
            if(m.isAnnotationPresent(MyAnnotation.class)) annotationList.add(m.getName());   //m.getAnnotation(MyAnnotation.class).value());
            if(m.isAnnotationPresent(MyAnnotation2.class)) annotationList.add(m.getName());  //getAnnotation(MyAnnotation2.class).value());
        }

        return annotationList;

    }
}
