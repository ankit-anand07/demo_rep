import java.util.*;

public class Fibonacci {
    static void fib(int n) {
        int a = 1;
        int b = 1;
        if (n == 1)
            System.out.println(a);
        else if (n == 2)
            System.out.println(a + " " + b + " ");
        else {
            System.out.print(a + " " + b + " ");

            for (int i = 3; i <= n; i++) {
                int temp = a;
                a = b;
                b = temp + b;
                System.out.print(b + " ");
            }
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        fib(n);
    }
}
