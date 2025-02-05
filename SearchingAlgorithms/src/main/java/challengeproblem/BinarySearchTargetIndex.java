package challengeproblem;

import java.util.Arrays;

public class BinarySearchTargetIndex {
    public static void main(String[] args) {
        int arr[]={2,3,6,4,32,54,6};
        int target=32;

        System.out.println(binarySearch(arr,target));

    }
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found.
    }

}
