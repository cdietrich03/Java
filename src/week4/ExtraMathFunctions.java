package week4;

public class ExtraMathFunctions {
    public static int percentOf (int percent, double num1) {
        int num = (int)(((float)percent/100) * num1);
        return num;
    }

    public static double findPercent (double num1, double num2) {
        double percent = ((num1 / num2) * 100);
        return percent;
    }

    public static void main(String[] args) {
        System.out.println(ExtraMathFunctions.findPercent(100, 200)+ "%");
        System.out.println(ExtraMathFunctions.percentOf(20,115));
    }
}
