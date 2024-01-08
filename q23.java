import java.util.*;

public class q23 {
    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int evenArr[] = new int[even];
        int oddArr[] = new int[odd];

        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

    }
}