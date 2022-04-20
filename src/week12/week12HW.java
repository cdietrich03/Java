package week12;

import week11.studentStuf.Course;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class week12HW {
    public static <E extends Comparable> List<E> test(E[] array, E first, E last) {
        List<E> lst = new ArrayList<E>();
        for (E item : array) {
            int one = first.compareTo(item);
            int two = last.compareTo(item);
            if (one ==0 | two == 0) {
                lst.add(item);
            }
        }
        return lst;
    }


}