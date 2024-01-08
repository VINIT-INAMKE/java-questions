import java.util.*;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int arr1[] = new int[arr.length + 1];
        System.out.println("Enter element to add at start");
        int elem = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr1[i + 1] = arr[i];
        }
        arr1[0] = elem;
        System.out.println("After element at start=" + Arrays.toString(arr1));
        sc.close();
    }

}
