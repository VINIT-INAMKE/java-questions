import java.util.*;

public class q16 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int arr1[] = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            arr1[i - 1] = arr[i];
        }

        System.out.println("After deleting element at end=" + Arrays.toString(arr1));
    }
}