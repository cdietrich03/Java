package week12;

import java.util.*;

public class PlayWithSorts {
    public static void main(String[] args) {
        String[] temp = {"one", "hello", "a"};
        List<String> lst = new ArrayList<>(Arrays.asList(temp));
        System.out.println(lst);
//        Collections.sort(lst);
//        System.out.println(lst);
        Collections.sort(lst, (String first, String second) -> Integer.compare(first.length(), second.length()));
        System.out.println(lst);
    }
}
