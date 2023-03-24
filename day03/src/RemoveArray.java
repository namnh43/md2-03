import java.util.Arrays;
import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        System.out.println("Found element in array?");
        System.out.printf("Enter number to find in array: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] myArray = new int[] {1,2,3,4,5,6,7,8,9};
        int index = removeArray(num, myArray);
        if (index > -1) {
            System.out.printf("Found number at index %d, new array is %s", index, Arrays.toString(myArray));
        } else {
            System.out.println("Not existed element in array");
        }
    }
    public static int removeArray(int number, int... arr) {
        if (arr.length <= 0) {
            return -1;
        }
        int index = -1;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = index; i < arr.length -1; i++) {
                arr[index] = arr[index + 1];
            }
            arr[arr.length-1] = 0;
        }
        return index;
    }
}
