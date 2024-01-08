import java.util.*;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
        System.out.println("Enter element to be searched");
        int elem = sc.nextInt();
        int ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                ind = i;
                break;
            }
        }
        if (ind != -1) {
            System.out.println("Element " + elem + " found at location " + (ind + 1));
        } else {
            System.out.println("Element " + elem + " not found in the array");
        }
        sc.close();
    }
}