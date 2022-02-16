package week5;
public class hwnum3 {
    public static int addAllNumbers(int[] array1) {
        int sum = 0;
        for(int item : array1) {
            if (item % 2 == 0) {
                sum += item;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println(addAllNumbers(test));
    }
}

