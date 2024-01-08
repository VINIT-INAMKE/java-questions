import java.util.*;

public class q22 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int arr1[] = { 60, 70, 80, 90, 100 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        int arr2[] = new int[arr.length + arr1.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[arr.length + i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
