package aggregation;

public class Student {
    private String name;
    private double weight;
    private Backpack backpack;
    private Notebook [] notebooks;


    public Student(String name, double weight, Backpack backpack, Notebook[] notebooks) {
        this.name = name;
        this.weight = weight;
        this.backpack = backpack;
        this.notebooks = notebooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Notebook[] getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(Notebook[] notebooks) {
        this.notebooks = notebooks;
    }
}
