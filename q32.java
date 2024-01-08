import java.util.*;

public class q32 {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 54, 514, 50, 13, 32, 32 };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Top two largest elements are " + arr[arr.length - 1] + " and " + arr[arr.length - 2]);
    }
}