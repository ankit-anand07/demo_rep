import java.util.*;

public class BinaryToDecimal {
    static double BtoD(long n) {
        int i = 0;
        double res = 0;
        while (n != 0) {
            long r = n % 10;
            if( r > 1 || n < 0 ) return -1;
            res += r * (Math.pow(2, i));
            n /= 10;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print("Enter any binary number :");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        double ans = BtoD(n);
        if( ans == -1) System.out.print("number is not in binary form!!"); 
        else System.out.print("decimal form is :" + ans);
    }
}
