package week5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(1);
        myList.add(1, 3);
        myList.set(0, 4);
        myList.add(myList.get(1));
        myList.remove(myList.size() - 1);
        myList.remove(Integer.valueOf(3));
        myList.remove(myList.size());
        System.out.println(myList);


        Integer[] x = { 3, 1, 7 };

        ArrayList<Integer> myArrayList = new
                ArrayList<>(Arrays.asList(x));



    }

}
