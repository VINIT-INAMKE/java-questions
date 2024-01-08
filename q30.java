import java.util.*;

public class q30 {
    public static void main(String[] args) {

        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
        System.out.println(Arrays.toString(arr));

        int rot = 2;
        for (int i = 0; i < rot; i++) {
            if (arr.length > 1) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
