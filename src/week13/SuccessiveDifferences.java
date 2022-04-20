package week13;

public class SuccessiveDifferences {
        public static void main(String[] args) {
            int [] array1  = new int [] {2, 9, 28, 65, 126};
            PrintUtils.printIntMatrix(SuccessiveDif(array1));
        }
        public static int [][] SuccessiveDif(int [] array) {
            int n = array.length;
            int [][] success = new int [n][];

            success[0] = new int[n];
            int count;
            for (count = 0; count < array.length; count++) {
                int m = array[count];
                success[0][count] = m;
                System.out.println();
            }


//            triangle[1] = new int[2];
//            triangle[1][0] = 1;
//            triangle[1][1] = 1;

            int count2 = n;
            for (int row = 1; row < n - 1; row++) {
                success[row] = new int[row + 1];
                for (int column = 0; column < count2; column++) {
                    count2--;
                    success[row][column] = success[row - 1][column + 1] - success[row - 1][column];
                }
                System.out.println();
            }
            return success;}
    }
