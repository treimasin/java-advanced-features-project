package staticvsnonstatic;

public class Main {

    public static void main1 (String[] args) {

        NonStaticEmployee emp1 = new NonStaticEmployee("Tom Holland", 1001, "SDA");
        NonStaticEmployee emp2 = new NonStaticEmployee("Kristo Treiman", 1002, "SDA");
        emp1.display();
        emp2.display();

    }

    public static void main2 (String[] args) {

        StaticEmployee emp1 = new StaticEmployee("Kristopher", 1001, "SDA");
        StaticEmployee emp2 = new StaticEmployee("Tommike", 1002, "SDA");
        emp1.display();
        emp2.display();

        StaticEmployee emp3 = new StaticEmployee("Alex", 1003, "Ericcson");
        emp3.display();
        emp1.display();

    }

    public static void main(String[] args) {

        StaticEmployee emp1 = new StaticEmployee("Kristopher", 1001, "SDA");

        // Because display() is non-static, you need to first create an instance of the class
        // and then call it on the object
        emp1.display();

        // Because calculateSalary() is static, you don't need to create any object to use it
        // You can directly call it on the class itself
        System.out.println(StaticEmployee.calculateSalary(100, 0.2));
    }

    // Static variables and methods are created even before the class is loaded and object is created.
    // Therefore, we can access the static variables and methods from anywhere in the program.
    // But non-static variables and methods are created only when the class is loaded and object is created.
    // Therefore, we can access non-static variables and methods only from within the non-static context.

}
