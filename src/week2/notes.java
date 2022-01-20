package week2;

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

    public static void main(String[] args) {

        int target = 20, total = 1, factor = 2, count = 0;
        while (total < target) {

            total *= factor;
            count++;
            System.out.print(" total = " + total);
        }
        System.out.println(); // prints a blank line
        System.out.println("count = " + count);

    }
}
