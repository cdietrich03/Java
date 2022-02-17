package week5;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotate {
    public static int [] rotate(int [] array) {
        int temp = array[array.length - 1];
        int count = 0;
            for (count = array.length - 1; count > 0; count--) {
                array[count] = array[count - 1];
            }
            array[0]= temp;
            return array;
    }

    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(rotate(myArray)));
    }
}
