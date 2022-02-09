package week5;

import java.util.Arrays;

public class ArraysAsParameters {
//    public static int multiplyArrayElements(int[] numbers) {
//        int product = 1;
//        for (int number : numbers) product *= number;
//        return product;
//    }
//
//    public static void main(String[] args) {
//        int[] test = {1, 5, -3, 2, 6};
//        System.out.print(multiplyArrayElements(test));
//
//    }
    public static int[] createArrayOfLargerElements(int[] array1, int[] array2)
{
        int[] newArray = new int[array1.length];

        for (int count = 0; count < array1.length; count++) {
            if (array1[count] > array2[count])
                newArray[count] = array1[count];
            else newArray[count] = array2[count];
        }
        return newArray;
}

    public static void main(String[] args) {
        int[] tst1 = {2, 25, 4, 6};
        int[] tst2 = {5, 16, 4, 57};

        System.out.println(Arrays.toString(createArrayOfLargerElements(tst1, tst2)));
    }
}
