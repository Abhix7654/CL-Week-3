package challengeproblem;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[]={1,2,3,-6,7,8};
        System.out.println(firstMissingPositive(arr));

    }
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        // Place each number in its correct index if possible.
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] with arr[arr[i]-1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        // The first place where the index doesn't match the value gives the missing positive.
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
