import java.util.*;

public class Operations {
    public static void main(String[] args) {
        System.out.print("Enter frist number :");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        System.out.print("Enter second number :");
        double n2 = sc.nextDouble();
        System.out.print("Enter the arithematic operation to performed(+,-,*,/,%) :");
        char ch = sc.next().charAt(0);
        double res = 0;
        switch (ch) {
            case '+':
                res = n1 + n2;
                System.out.print("sum is :" + res);
                break;
            case '-':
                res = n1 + n2;
                System.out.print("difference is :" + res);
                break;
            case '*':
                res = n1 * n2;
                System.out.print("multiply is :" + res);
                break;
            case '/':
                res = n1 / n2;
                System.out.print("divided is :" + res);
                break;
            case '%':
                res = n1 % n2;
                System.out.print("modulus is :" + res);
                break;
            default:
                System.out.print("invalid operator");
                break;
        }
    }
}
