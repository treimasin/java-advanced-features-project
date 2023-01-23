package generics;

public class MacBook implements Comparable<MacBook> {

    private int cpuCore;

    public MacBook(int cpuCore) {
        this.cpuCore = cpuCore;
    }


    @Override
    public int compareTo(MacBook other) {
        return this.cpuCore - other.cpuCore;
    }
}
