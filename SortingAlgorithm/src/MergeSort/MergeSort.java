package MergeSort;

import java.util.Arrays;

class MergeSort {

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si < ei) {
            int mid = (si + ei) / 2; // Find the middle index

            // Recursively sort the left and right halves
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);

            // Merge the two sorted halves
            conquer(arr, si, mid, ei);
        }
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        // Create a temporary merged array to store sorted elements
        int[] merged = new int[ei - si + 1];

        int idx1 = si;      // Pointer to the first half (left part)
        int idx2 = mid + 1; // Pointer to the second half (right part)
        int x = 0;          // Pointer for the merged array

        // Merge the two halves while comparing elements
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from the left half (if any)
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from the right half (if any)
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged array back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] bookPrices = {240, 643, 344, 350, 853, 124, 976};

        System.out.println("Original Prices" + Arrays.toString(bookPrices));

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Prices " + Arrays.toString(bookPrices));
    }
}
