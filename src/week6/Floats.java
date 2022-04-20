package week6;

public class Floats {
    public static boolean floats(float num1, float num2, int[] array1) {
        boolean yay = false;
        for (int num : array1) {
            if (num < num1 || num > num2) {
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(floats(0, 6, array));
    }

        }



