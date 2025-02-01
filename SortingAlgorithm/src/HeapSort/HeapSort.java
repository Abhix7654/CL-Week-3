package HeapSort;

import java.util.Arrays;

class HeapSort {

    // Function to perform Heap Sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Reheapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Function to ensure the Max Heap property is maintained
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        // Example array of job applicant salary demands
        int[] salaries = {4000, 53000, 223000, 42000, 96000,60000, 35000};

        System.out.println("Original Salary  " + Arrays.toString(salaries));

        // Apply heap sort to the salary demands
        heapSort(salaries);

        System.out.println("Sorted Salary  " + Arrays.toString(salaries));
    }
}
