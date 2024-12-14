import java.util.*;

public class Palindromic {
    public static void main(String[] args) {
        System.out.print("Enter any string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // reads string.
        int flag = 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("Not a Palindrome number");
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Palindromic number");
    }
}
