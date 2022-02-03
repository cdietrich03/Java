package week3;
import java.util.Scanner;
public class quiz3 {
//    public static void main(String[] args)
//    {
//        double x = 4 + 3 + 2.0;
//        System.out.println(x);
//
//    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a child's age: ");
    int age = input.nextInt();

    if (age < 5) {
        System.out.println("The child is in preschool");
    }
    else if (age >= 5 && age < 11) {
        System.out.println("This child is in elementary school");
    }
    else if (age >= 11 && age < 14) {
        System.out.println("This child is in middle school");
    }
    else if (age >= 14 && age < 18) {
        System.out.println("This child is in high school");
    }
    else {
        System.out.println("This is not a child");
    }
}
//    public static int sumTheRange(int x, int y) {
//        int sum = 0;
//        if (y > x) {
//            do {
//                sum += y;
//                y--;
//            } while (y >= x);
//        }
//        else if (x > y) {
//            do {
//                sum += x;
//                x--;
//            } while (x >= y);
//        }
//        else {
//            sum = x + y;
//        }
//            return sum;
//        }
//    public static void main(String[] args) {
//        System.out.println(sumTheRange(10, 2));
//    }
}
