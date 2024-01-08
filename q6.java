import java.util.*;

public class q6 {
    public static void main(String[] args) {
        int arr[] = { 10, 31, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            j--;

        }
        System.out.println("Reversed Array without using temp");
        System.out.println(Arrays.toString(arr));
    }
}
