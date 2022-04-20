package week7.ipadExample;

public class iPad implements iPadTesting {
    int memorySize;
    private boolean cellular;

    public iPad( int memory, boolean cell) {
        this.memorySize = memory;
        this.cellular = cell;
    }

    public double computePrice() {
        if (cellular) return ((10 * memorySize) + 140);
        else return (10 * memorySize);
    }

    public String toString() {
        return "Ipad with memory of " + memorySize + " gigabytes and cellular is " + cellular;
    }


}
