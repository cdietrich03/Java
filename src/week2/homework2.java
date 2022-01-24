package week2;

import java.text.DecimalFormat;

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

    public static void main(String[] args) {
        double total = 0;
        double distance = 10;
        int day = 0;
        DecimalFormat formatter1 = new DecimalFormat("#0.000");
        do {
            day += 1;
            total += distance;
            System.out.println("Day " + day + "  distance today = " + formatter1.format(distance) + " total = " + formatter1.format(total));
            distance *= 0.7;
        }while (total > 0.1);
}
}
