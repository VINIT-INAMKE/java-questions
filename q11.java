import java.util.*;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int arr1[] = new int[arr.length + 1];
        System.out.println("Enter element to add at end");
        int elem = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr1.length - 1] = elem;
        System.out.println("After element at end=" + Arrays.toString(arr1));
        sc.close();
    }

}
