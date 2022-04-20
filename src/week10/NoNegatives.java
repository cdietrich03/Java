package week10;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class NoNegatives {

    public static List<Integer> NoNegative (List<Integer> lst) {
        List<Integer> newlst = new ArrayList<Integer>();
        ListIterator<Integer> iter = lst.listIterator();
        while (iter.hasNext()) {
            int item = iter.next();
                if (item > 0) {
                    newlst.add(item);
                }
        } return newlst;
    }
    public static List<Integer> createList(int length) {
//        List<Integer> largeList = new ArrayList<>();
        List<Integer> largeList = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            largeList.add((int) (length * Math.random() - length + 5));
        }
        return largeList;
    }

    public static void main(String[] args) {
        System.out.println(NoNegative(createList(30)));
    }
}
