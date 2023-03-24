import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character: ");
        char c = scanner.next().charAt(0);
        int num = countNumberCharacter(str, c);
        System.out.printf("Number character %c in string %s is %d",c, str, num);
    }
    public static int countNumberCharacter(String str, char c) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                num ++;
            }
        }
        return num;
    }

}
