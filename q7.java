import java.util.*;

public class q7 {
    public static void main(String[] args) {
        int arr[] = { 10, 31, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements in array " + sum);
    }

}
