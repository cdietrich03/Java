package week10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TryLinkedLists {
    public static void addNumber(List<Double> lst) {
        lst.add(40.4);
        lst.add(100.4);
        lst.add(2.6);
//        System.out.println(lst);
//        System.out.println(lst.size());

//        for (int count = 0; count < lst.size(); count++) {
//            System.out.print(lst.get(count) + " ");
//        }
//        System.out.println();
//        for (Double item : lst) {
//            System.out.println(item + " ");
//        }
//        System.out.println();
        ListIterator<Double> iter = lst.listIterator();
        double total = 0;
        while (iter.hasNext()) {
            double x = iter.next();
            System.out.println(x + " ");
            total += x;

        }
//        System.out.println();
//        System.out.println("total = " + total);

//        while (iter.hasPrevious()) {
//            System.out.println(iter.previous() + " ");
//        }

    }

    public static void main(String[] args) {
        List<Double> theList1 = new LinkedList<>();
        List<Double> theList2 = new ArrayList<>();
        addNumber(theList1);
        addNumber(theList2);
    }
}
