package nestedclass;

public class OuterClass {
    // instance variables and methods

    private int outerField;
    private static int staticOuterField;

    // Below is a non-static nested class === inner class
    // An inner class has access to all fields/methods of the outerClass
    // Inner classes are used to group related methods and fields and can be used to implement helper classes
    // that are only used by the outerClass.
    class InnerClass {
        // instance variables and methods

        public void innerMethod() {
            System.out.println(outerField);   // An inner class has access to all fields/methods of the outerClass

        }

    }

    public static class NestedClass {
        public void nestedMethod() {
            System.out.println(staticOuterField);
        }

    }
}
