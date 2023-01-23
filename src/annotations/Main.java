package annotations;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Kristo", "Treiman", 25);

        System.out.println(student.toString());  // This bug is due to typo in toStringg()
        // Forgetting to put @Override avoided compiler to detect this typo

        student.methodWithAnnotation(51);

        student.processMyCustomAnnotation();
    }
}
