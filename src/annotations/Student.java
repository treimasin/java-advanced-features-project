package annotations;

import java.lang.reflect.Method;
import java.time.Month;

public class Student {
    private String firstname;
    private String lastname;
    private int age;

    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Deprecated
    @MyCustomAnnotation({"first value", "second value"})
    public void methodWithAnnotation(@Deprecated int someNumber) {
        System.out.println("inside methodWithAnnotation()");
    }

    // Now lets see how we can process the @MyCustomAnnotation
    public void processMyCustomAnnotation() {
        //  we are going to use Reflection API to get the method with @MyCustomAnnotation
        Method[] methods =  this.getClass().getMethods();

        for (Method m: methods) {
            if (m.isAnnotationPresent(MyCustomAnnotation.class)) {
                MyCustomAnnotation annotation = m.getAnnotation(MyCustomAnnotation.class);
                System.out.println(annotation.value()[0]); // "First value"
                System.out.println(annotation.value()[1]);
            }
        }
    }



    public String toStringg() {
        return "this is the string representation of a student";
    }
}
