import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter number row of matrix: ");
        int row = scanner.nextInt();
        int[][] matrix = createRandomArray(row);
        printArray(matrix);
        int sum = calSumArray(matrix);
        System.out.printf("Sum is: %d", sum);
    }
    public static int[][] createRandomArray(int rowcol) {
        int[][] matrix = new int[rowcol][rowcol];
        for (int i = 0; i < rowcol; i++) {
            for (int j = 0; j < rowcol; j++) {
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
    public static int calSumArray(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i ++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
