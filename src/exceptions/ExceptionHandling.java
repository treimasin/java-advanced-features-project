package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main1(String[] args) {
        // What is the output of the following code?

        throwAnException();


        System.out.println("Hello world");
    }

    public static void main2(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }


    public static void main3(String[] args) {

        try {
            throwAnException();
            System.out.println(10/0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }

    }

    // Always when using multiple catch blocks, you should put the most specific exception first
    // For example, if you have a catch block for your ArrayIndexOutOfBoundsException,
    // then you should not have a catch block for Exception or RuntimeException before it.
    public static void main4(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            int result = 10 / 0;   // this will throw ArithmeticException
            System.out.println(arr[5]);   // this will throw ArrayIndexOutOfBoundsException
            System.out.println("this line will never execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
        } catch (Exception e) {
            System.out.println("Exception caught!");
        } catch (Throwable throwable) {
            System.out.println("Throwable caught!");
        }

    }

    public static void main5(String[] args) {
        // Let's define a method that throws a custom exception
        // and call it from this main method
        try {
            throwCustomException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void main6(String[] args) {
        // Consider a logic that you want to execute no matter exception is thrown or not
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);  // this is IndexArrayOutOfBoundsException
            System.out.println("This line will never execute");
        } catch (Exception e) {
            System.out.println("Exception caught!");
        } finally {
            // Whatever you put inside finally block, will execute no matter the exception
            System.out.println("IMPORTANT LOGIC");
        }
    }
    // IOException is a special type of try-catch-finally block that guarantees the resource created
    // inside try block and are closed for sure
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/com/sda/java/nonExistingFile.txt");) {
            System.out.println("Reading from the above file.");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }


    public static void throwAnException() {

            int[] arr = {1, 2, 3, 4, 5};

            try {
                // try block
                System.out.println(arr[10]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                // catch block
//            System.out.println("Exception happened: " + exception.getStackTrace());
                exception.printStackTrace();
            }

        }

        public static void throwCustomException() throws MyException {
        throw new MyException("MyException message");

        }

}
