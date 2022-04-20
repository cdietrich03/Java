package week13;

public class PascalsTriangle {
    public static void main(String[] args) {
        PrintUtils.printIntMatrix(pascalTriangle(5));
    }
    public static int [][] pascalTriangle(int n) {
        int [][] triangle = new int [n + 1][];

        triangle[0] = new int[1];
        triangle[0][0] = 1;
        triangle[1] = new int[2];
        triangle[1][0] = 1;
        triangle[1][1] = 1;

        for (int row = 2; row < n + 1; row++) {
            triangle[row] = new int[row + 1];
            triangle[row][0] = 1;
            triangle[row][row] = 1;
            for (int column = 1; column < triangle[row].length - 1; column++) {
                triangle[row][column] = triangle[row - 1][column] + triangle[row - 1][column - 1];
            }
            System.out.println();
        }
    return triangle;}
}
