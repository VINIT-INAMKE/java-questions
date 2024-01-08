import java.util.*;

public class q2 {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(arr));
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.println("Total number of elements in the array: " + count);
	}
}