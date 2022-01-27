package week2;

import java.text.DecimalFormat;
import java.util.Scanner;


public class homework2 {
    //    public static void main(String[] args) {
//        System.out.println("Celsius | Fahrenheit");
//        System.out.println("________|___________");
//        double tempinf;
//        for (int celsius = 0; celsius <= 100; celsius += 10)
//        {
//            System.out.println("     " + celsius + "  |     " + (tempinf = (celsius * (9.0/5)) + 32));
//        }
//    }

//    public static void main(String[] args) {
//        for (int count = 817; count > 10; count-= 2)
//            System.out.print(count + " ");
//    }

    //    public static void main(String[] args) {
//        double total = 0;
//        double distance = 10;
//        int day = 0;
//        DecimalFormat formatter1 = new DecimalFormat("#0.000");
//        do {
//            day += 1;
//            total += distance;
//            System.out.println("Day " + day + "  distance today = " + formatter1.format(distance) + " total = " + formatter1.format(total));
//            distance *= 0.7;
//        }while (total > 0.1);
//}
//public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter a letter grade: ");
//    String grade = input.next();
//    int gradeValue = 0;
//
//    switch(grade) {
//        case "A":
//            System.out.println("A is worth 4");
//            gradeValue = 4;
//            break;
//        case "B":
//            System.out.println("B is worth 3");
//            gradeValue = 3;
//            break;
//        case "C":
//            System.out.println("C is worth 2");
//            gradeValue = 2;
//            break;
//        case "D":
//            System.out.println("D is worth 1");
//            gradeValue = 1;
//            break;
//        case "F":
//            System.out.println("F is worth 0");
//            gradeValue = 0;
//            break;
//        default:
//            System.out.println("Invalid choice.");
//    }
//}
//public static void main(String[] args) {
//    for (int count = 1; count < 10; count++)
//    {
//        System.out.print(count);
//        if (count > 5) count = 10;
//    }
//    System.out.println();
//
//}
//public static void main(String[] args) {
//    for (int i = 1, j = 4; (i <= 3 && j > 1); i++, j--)
//        System.out.println("i = " + i + " j = " + j);
//
//}
//public static void main(String[] args) {
//    for (int i = 1; i <= 3; i++)
//        for (int j = 4; j > 1; j--)
//            System.out.println("i = " + i + " j = " + j);
//
//}
//public static void main(String[] args) {
//    int sum = 0;
//    for (int i = 1; i <= 10; i++)
//
//    sum = sum + i;
//    System.out.println(sum);
//}
//public static void main(String[] args) {
//    String s1 = "Simp";
//    String s2 = "son";
//    System.out.println((s1 + s2) == "Simpson" );
//    System.out.println((s1 + s2).equals("Simpson"));
//    System.out.println(s1 + s2.equals("Simpson") );
//}
//public static void main(String[] args) {
//    String s1 = "Simp";
//    String s2 = "son";
//    System.out.println((s1 + s2).compareTo("Simpson"));
//    System.out.println("Simpson". compareTo("Timpson") );
//    System.out.println("Simpson". compareTo("Silence") );
//    System.out.println("Simpson". compareTo("Simpleton") );
//    System.out.println("Simpson". compareTo("Simpsonian") );
//    System.out.println("Simpson". compareTo("Sim") );
//    System.out.println("Simpson". compareTo("simpson"));
//}
    public static void main(String[] args) {
        boolean done = false;
        int total = 0;

        Scanner input = new Scanner(System.in);

        while (!done) {
            System.out.print("Please enter a word or q to quit: ");
            String word = input.next();
            if (word.equals("q")) {
                done = true;
                System.out.println(total);
            } else {

                total += word.length();
            }

        }
    }
}
