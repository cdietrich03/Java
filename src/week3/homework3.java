package week3;

import java.util.Scanner;

public class homework3 {
//    public static int specificNumber() {
//        int count = 0;
//        boolean done = false;
//        int realnumb;
//        while (!done) {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Please enter an integer or q to quit: ");
//            String number = input.next();
//            if (number.equals("q")) {
//                done = true;
//            } else {
//                realnumb = Integer.parseInt(number);
//                if (realnumb > 10 && realnumb < 15) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Number in range is " + specificNumber());
//    }

//    public static void main(String[] args) {
//        int number = 1000000;
//        System.out.println(number * number);
//    }
//    public static void main(String[] args) {
//        long number = 1000000;
//        System.out.println(number * number);
//    }
//public static int func1(int x, String y) {
//
//}
//
//    public static String func2(String x, int y) {
//
//    }
//
//    public static void main(String[] args) {
//        int a = 1;
//        String b = "hi";
//        System.out.println(func1(2 * a, a + b));
//
//    }
    public static String words(String s1, String s2, int n)
    {
        String total = (s1 + (s2 * n));

        return total;

    }

    public static void main(String[] args) {
        System.out.println(words("Hi", "Lo", 10));

    }
}


