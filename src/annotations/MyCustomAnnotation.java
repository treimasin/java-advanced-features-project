package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.Month;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
    // Although is written like a method, but it is not.
    // It is rather called an 'Element' of the annotation.
    // 'Element' defined this way, they can become arguments of annotation.
    // There are certain limitations around 'Elements':
    // 1. return type of the 'Element' must be
    //      - simple types (int, float, double, etc) and their object-oriented counterparts(Integer, Double,...)
    //      - String class
    //      - Enum class
    //      - other annotation classes
    //      - arrays of the types as mentioned above

    // 2. 'Element' cannot take any arguments (i.e look like method declarations with no arg)

    String[] value();

    // You can define 'default' values for every Element that you don't want to specify

    String[] dates() default {};

    Month month() default Month.JANUARY;
}
