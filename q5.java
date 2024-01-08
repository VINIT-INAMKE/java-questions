import java.util.*;

public class q5 {
    public static void main(String[] args) {

        int arr[] = { 10, 31, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int j = arr.length - 1;
        for (int i = 0; i < (arr.length / 2); i++) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println("Reversed Array using temp");
        System.out.println(Arrays.toString(arr));
    }
}