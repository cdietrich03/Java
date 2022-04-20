package week12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//loop through each item in the list and for each item in the list, compare to every item in the list

public class RemoveDuplicates {
//    public static ArrayList<String> remove(ArrayList<String> lst) {
//        HashSet<String> set = new HashSet<>();
//        for (String item : lst) {
//            set.add(item);
//        }
//        ArrayList<String> y = new ArrayList<>(set);
//        return y;
//    }
    public static ArrayList<String> remove(ArrayList<String> lst) {
        ArrayList<String> word = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++ ) {
            String j = lst.get(i);
            if (!word.contains(j)) {
                word.add(j);
            }
        }
        return word;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hi");
        list.add("low");
        list.add("hi");
        list.add("hi");
        list.add("hi");
        list.add("Hi");
        list.add("low");
        list.add("lo");
        list.add("hi");
        System.out.println(list);

        System.out.println(remove(list));
    }
}
