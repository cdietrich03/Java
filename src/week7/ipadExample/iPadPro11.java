package week7.ipadExample;

public class iPadPro11 implements iPadTesting{

    private int memorySize; // GigaBytes

    private boolean cellular;

    public iPadPro11(int memory, boolean cell) {

        this.memorySize = memory;
        this.cellular = cell;
    }

    public double computePrice() {
        if (cellular) return ((11 * memorySize) + 150);
        else return (11 * memorySize);
    }

    public String toString() {
        return "Ipad with memory of " + memorySize + " gigabytes and cellular is " + cellular;
    }

}
