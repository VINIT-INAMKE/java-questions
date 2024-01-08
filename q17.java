import java.util.*;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter index of element to be deleted from");
        int p = sc.nextInt();
        int arr1[] = new int[arr.length - 1];

        for (int i = 0; i < p; i++) {
            arr1[i] = arr[i];
        }

        for (int i = p + 1; i < arr.length; i++) {
            arr1[i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        sc.close();
    }
}
