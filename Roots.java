import java.util.*;

public class Roots {
    static void Root(double a, double b, double c) {
        double D = 0;
        D = b * b - 4 * a * c;
        if (D >= 0) {
            double n1 = -b + Math.pow(D, .5);
            double n2 = -b - Math.pow(D, .5);
            System.out.print("first root is :" + n1);
            System.out.println();
            System.out.print("second root is :" + n2);
        } else {
            System.out.print("first root is :" + -b + " + " + Math.pow(-D, .5) + "i");
            System.out.println();
            System.out.print("second root is :" + -b + " + " + -Math.pow(-D, .5) + "i");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of a,b,c :");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Root(a, b, c);
    }
}
