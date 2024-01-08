import java.util.*;

public class q10 {
    public static void main(String[] args) {
        int arr[] = { 10, -8, 30, 40, 60 };
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println("Old array=" + Arrays.toString(arr));
        System.out.println("New copied array=" + Arrays.toString(arr1));
    }

}
