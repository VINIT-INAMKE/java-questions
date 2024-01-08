import java.util.*;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int arr1[] = new int[arr.length + 1];
        System.out.println("Enter location of element to be added at");
        int p = sc.nextInt();
        System.out.println("Enter element to add in middle");
        int elem = sc.nextInt();

        for (int i = 0; i < p - 1; i++) {
            arr1[i] = arr[i];
        }
        arr1[p - 1] = elem;
        for (int i = p; i < arr.length + 1; i++) {
            arr1[i] = arr[i - 1];
        }
        System.out.println("After element at Position " + p + " is " + Arrays.toString(arr1));
        sc.close();
    }

}
