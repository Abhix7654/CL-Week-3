package QuickSort;

import java.util.Arrays;

class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right parts
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Choosing the last element as the pivot
        int pivot = arr[high];
        int i = low - 1; // Pointer for the smaller element

        // Re-arrange elements around the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot element at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of pivot element
        return i + 1;
    }

    public static void main(String[] args) {
        int[] productPrices = {520, 300, 10, 50, 220, 120, 820};

        System.out.println("Original Prices " + Arrays.toString(productPrices));

        // Apply quick sort to the array
        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Prices " + Arrays.toString(productPrices));
    }
}
