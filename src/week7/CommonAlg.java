package week7;

import java.util.ArrayList;

public class CommonAlg {
    public static boolean lessThanNumber(ArrayList<Integer> lst, int topValue) {
        for (Integer item : lst) {
            if (topValue > item) {
                return true;
            }
        }return false;
    }
}
