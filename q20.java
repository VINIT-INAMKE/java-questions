import java.util.*;

public class q20 {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 50, 54, 50, 13, 32, 32 };
        System.out.println(Arrays.toString(arr));
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    count++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of dupilcate elements in array " + count);
    }
}