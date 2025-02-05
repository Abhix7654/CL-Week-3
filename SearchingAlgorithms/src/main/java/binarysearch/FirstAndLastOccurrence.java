package binarysearch;
import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int arr[]={2,3,4,4,4,4,5,6,7};
        int target=4;
        System.out.println(Arrays.toString(findFirstAndLastOccurrence(arr,target)));


    }
    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int first = -1, last = -1;
        // Find first occurrence.
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1; // Continue search on the left.
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // Find last occurrence.
        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1; // Continue search on the right.
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{first, last};
    }
}
