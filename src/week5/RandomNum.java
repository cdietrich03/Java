package week5;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class RandomNum {
    public static int [] myArray(int n, int bottom, int top) {
        Random randomGenerator = new Random();
        int num = 0;
        int [] myArray = new int[n];
        for(int count = 0; count < n; count ++) {
            num = randomGenerator.nextInt(top - bottom) + bottom;
            myArray[count] = num;
        }
    return myArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(myArray(5, 10, 20)));
    }
}
