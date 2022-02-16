package week5;

import java.util.Arrays;
import java.util.ArrayList;


public class homework6 {
    public static void main(String[] args) {
//
//        int[] intArray = {4, 1, 3};
//        String[] stringArray = {"hi", "bye", "mymymy!"};
//        double[] doubleArray = new double[5];
//
//        doubleArray[0] = intArray[1];
//        doubleArray[1] = 1.5;
//
//        int[] otherIntArray = intArray;
//        int[] anotherIntArray = Arrays.copyOf(intArray, intArray.length);
//
//        boolean arraysEqualOne = (anotherIntArray == intArray);
//        boolean arraysEqualTwo = (Arrays.equals(anotherIntArray, intArray));
//        intArray[1] += intArray[2];
//
//        System.out.println(arraysEqualTwo);

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.1);
        list1.add(2.2);
        list1.add(3.3);
        list1.add(4.4);
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(5.5);
        list2.add(6.6);
        for (Double item : list1) {
            list2.add(item);
        }
        System.out.println(list2);
    }
}
