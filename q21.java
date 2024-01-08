import java.util.*;

public class q21 {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 50, 54, 50, 13, 32, 32 };
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        if (n == 0 || n == 1) {
            System.out.println("Array with no duplicates: " + arr[0]);
            return;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        System.out.println("Array after removing duplicates:");
        System.out.print("[");
        for (int i = 0; i < j - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[j - 1] + "]");
    }
}
