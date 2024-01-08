import java.util.*;

public class q18 {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 50, 54, 50, 13, 32, 32 };
        System.out.println(Arrays.toString(arr));
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times ");
        }
    }
}
