package week12;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListCOunt {
    public static List<Integer> count(List<Integer> lst, int n){
        List<Integer> numb = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j = lst.get(i);
            numb.add(j);
        }return numb;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        System.out.println(numbers);
        System.out.println(count(numbers, 4));
    }
}
