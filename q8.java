import java.util.*;

public class q8 {
    public static void main(String[] args) {
        int arr[] = { 10, 8, 30, 40, 60 };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max = arr[arr.length - 1];
        int min = arr[0];
        System.out.println("Minimum element in array is " + min);
        System.out.println("Maximum element in array is " + max);
        
    }

}
