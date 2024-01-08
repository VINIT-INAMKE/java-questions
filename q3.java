import java.util.*;

public class q3 {
    public static void main(String[] args) {

        int arr[] = { 10, 31, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total Number of odd Elements are: " + odd );
        System.out.println(" Total Number of even elements are: " + even);
    }
}
