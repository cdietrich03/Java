package week7.ipadExample;

public class iPadPro129 implements iPadTesting{

    private int memorySize; // GigaBytes

    private boolean cellular;

    public iPadPro129(int memory, boolean cell) {
        this.memorySize = memory;
        this.cellular = cell;
    }
    public double computePrice () {
            if (cellular) return ((12 * memorySize) + 160);
            else return (12 * memorySize);

    }

    public String toString() {
        return "Ipad with memory of " + memorySize + " gigabytes and cellular is " + cellular;
    }

}