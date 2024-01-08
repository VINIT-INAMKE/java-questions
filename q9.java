import java.util.*;

public class q9 {
    public static void main(String[] args) {
        int arr[] = { 10, -8, 30, 40, 60 };

        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Number of negative elements are " + count);
        System.out.println();
    }

}
