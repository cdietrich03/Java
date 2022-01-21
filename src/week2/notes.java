package week2;

import java.util.Scanner;

public class notes {
//    public static void main(String[] args) {
//        for (int count = 0; count <= 10; count ++)
//        {
//            System.out.println("Count is " + count);
//        }
//    }

//    public static void main(String[] args) {
//        for (int count = 1; count < 30; count *= 2)
//            System.out.print(count + " ");
//        // count = 1, then 2, then 4, then 8, etc
//        System.out.println(); // new line
//        for (int count = 20; count >= 15; count--)
//            System.out.print(count  + " ");
//// count DECREASES
//        System.out.println();
//        for (double count = 1.1; count < 10; count = count + 2.7)
//            System.out.print(count + " ");
//    }

//    public static void main(String[] args) {
//        for (int count = 1; count < 10; count++) {
//            System.out.print(count);
//            if (count > 5) count = 10;
//        }
//
//    }
//public static void main(String[] args) {
//    int index;
//    for (index =1; index < 10; index ++) {
//        System.out.println(index + " ");
//    }
//    index += 100;
//    System.out.println(index);
//}

//    public static void main(String[] args) {
//        int sum = 0, i;
//        for (i = 5; i <= 25; i++)
//            sum = sum + i;
//        System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        int x = 0;
//        while (x < 10) {
//            System.out.println(x + " ");
//            x++;
//        }
//    }

//    public static void main(String[] args) {
//
//        int target = 20, total = 1, factor = 2, count = 0;
//        while (total < target) {
//
//            total *= factor;
//            count++;
//            System.out.print(" total = " + total);
//        }
//        System.out.println(); // prints a blank line
//        System.out.println("count = " + count);
//
//    }

//    public static void main(String[] args) {
//        int x = 0;
//        do {
//            System.out.println(x);
//            x ++;
//        }while (x < 10);
//    }
//    // do loops will run one time even if x is greater than 10 because
//    // it doesn't check until after the loop
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    double value; // declare variable before loop.
//    do
//    {
//        System.out.print("Please enter a positive number: ");
//        value = in.nextDouble();
//    } while (value <= 0);
//    System.out.println("Value is " + value);
//
//}
//public static void main(String[] args) {
//    int total = 0;
//    int number = 5;
//    while (number <= 25)
//    {
//        total += number;
//        System.out.println(total);
//        number++;
//
//    }
//    System.out.println(" total = " + total);
//}

//    public static void main(String[] args) {
//        int total = 0;
//        int number = 5;
//        do {
//            total += number;
//            number ++;
//        }while (number <= 25);
//        System.out.println(total);
//    }
//public static void main(String[] args) {
//    String s1 = "25";
//    int number = Integer.parseInt(s1);
//    System.out.println(number + 10);
//}
public static void main(String[] args) {
    boolean done = false;
    double total = 0;
    int count = 0;

    Scanner input = new Scanner(System.in);

    while (!done) {
        System.out.println("Please enter a number or q to quit: ");
        String txt = input.next();
        if (txt.equals("q"))
        {
            done = true;
        }
        else
        {
            total += Double.parseDouble(txt);
            count ++;
        }
    }
    if (count > 0) {
        System.out.println("Average is " + total / count);
    }
    else
    {
        System.out.println("Average is 0");
    }
}

}
