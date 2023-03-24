import java.util.Scanner;

public class TwoDemensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter number row of matrix: ");
        int row = scanner.nextInt();
        System.out.printf("Enter number of column of matrix: ");
        int col = scanner.nextInt();
        int[][] matrix = createRandomArray(row, col);
        printArray(matrix);
        int max = maxNumber(matrix);
        System.out.printf("Max number in matrix is %d", max);
    }
    public static int[][] createRandomArray(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int)(Math.random()*100);
            }
        }
        return matrix;
    }
    public static void printArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static int maxNumber(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i ++) {
            for (int element: matrix[i]) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
