package class_and_object;

public class Demo {

    public static void main(String[] args) {


    // Let's create two instances of the class Building
    Building building1 = new Building("B1", 4, 2);
    Building building2 = new Building("B2", 5, 3);

    // We can access the properties of the object by using their fields
        System.out.println("Building name: " + building1.getName());
        System.out.println("Number of floors: " + building1.getNumberOfFloors());

    // We can also change the value of the property(field)
        building1.setNumberOfFloors(6);
        System.out.println("Number of floors: " + building1.getNumberOfFloors());


    }

}
