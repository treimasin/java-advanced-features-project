package class_and_object;

public class Building {

    // Properties (fields)
    private String name;
    private int numberOfFloors;
    private int numberOfRooms;

    // Constructor
    public Building(String name, int numberOfFloors, int numberOfRooms) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
    }

    // GETTER methods (READ access)
    public String getName() {
        return name;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    // SETTER methods (WRITE access)
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
