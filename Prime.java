import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter number- ");
        int n = sc.nextInt();
        int flag = 1;
        if (n == 1)
            System.out.println("not a Prime number");
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println("not a Prime number");
                flag = 0;
                break;
            }
        }
        if (flag == 1 && n != 1) {
            System.out.println("Prime number");
        }
    }

}