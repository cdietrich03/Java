package week8;

public class hw8 {
//    public static double mystery(double x, int y) {
//        if (y == 0) return 1;
//        else if (y < 0) return 1/mystery(x, -y);
//        else return x * mystery(x, y - 1);
//    }

    public static double factorial(int n) {
        int count = 1;
        if (n <= 1){
            return 1;
        }
        else {
            count++;
            return n * factorial(n - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
