package staticvsnonstatic;

public class NonStaticEmployee {
    String name;
    int empId;
    String company;

    public NonStaticEmployee(String name, int empId, String company) {
        this.name = name;
        this.empId = empId;
        this.company = company;
    }

    public void display() {
        System.out.println("NonStaticEmployee [id: " + empId + ", name: " + name + ", company: " + company + "]");
    }
}
