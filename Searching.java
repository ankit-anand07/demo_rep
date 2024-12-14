import java.util.*;

public class Searching {
    static boolean search(int k, int size, int arr[]) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == k) {
                System.out.println("Element found at index" + i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the element in array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key vlaue: ");
        int k = sc.nextInt();
        boolean res = search(k, size, arr);
        if (res == false)
            System.out.println("Element not found");
    }
}
