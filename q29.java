import java.util.*;

public class q29 {
    public static void main(String[] args) {

        int arr[] = { 11, 22, 33, 33, 44, 55, 66, 77, 88, 99, 100 };
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique)
                System.out.print(arr[i] + ", ");
        }

        System.out.println();

    }
}
