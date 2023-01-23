package staticvsnonstatic;

public class StaticEmployee {
    String name;
    int empId;
    static String company = "SDA"; // a static field belongs to the class not the object

    public StaticEmployee(String name, int empId, String company) {
        this.name = name;
        this.empId = empId;
        this.company = company;
    }

    // display() method is a non-static method which belongs to the objects of StaticEmployee class
    public void display() {
        System.out.println("StaticEmployee [id: " + empId + ", name: " + name + ", company: " + company + "]");
    }

    // calculateSalary() is a static method which belongs to the class StaticEmployee and not to the objects
    // it's shared across all instances of StaticEmployee
    public static double calculateSalary (double basic, double taxRate) {
        return basic * (1 - taxRate);
    }

}
