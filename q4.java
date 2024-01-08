import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
           int arr[] = { 10, 31, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Negative Elements in array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + ", ");
            }

        }
    }
}
