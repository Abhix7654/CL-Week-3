package searchtargetinlargedataset;

import java.util.Arrays;

public class SortingComparison {
    public static void main(String[] args) {
        compare();
    }
    // Bubble Sort - O(N^2)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // Merge Sort - O(N log N)
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }


    // Quick Sort - O(N log N)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static double[] compare(){
        double arr[]=new double[3];

        int[] largeDataset = new int[100000];
        for (int i = 0; i < largeDataset.length; i++) {
            largeDataset[i] = (int) (Math.random() * 1000000);
        }

        // Compare Sorting Algorithms for a large dataset
        int[] bubbleSortArray = Arrays.copyOf(largeDataset, largeDataset.length);
        long startTime = System.nanoTime();
        bubbleSort(bubbleSortArray);
        long endTime = System.nanoTime();
        arr[0]=(endTime - startTime) / 1000000.0;
        System.out.println("Bubble Sort time: " + (endTime - startTime) / 1000000.0 + " ms");

        int[] mergeSortArray = Arrays.copyOf(largeDataset, largeDataset.length);
        startTime = System.nanoTime();
        mergeSort(mergeSortArray);
        endTime = System.nanoTime();
        arr[1]=(endTime - startTime) / 1000000.0;
        System.out.println("Merge Sort time: " + (endTime - startTime) / 1000000.0 + " ms");

        int[] quickSortArray = Arrays.copyOf(largeDataset, largeDataset.length);
        startTime = System.nanoTime();
        quickSort(quickSortArray, 0, quickSortArray.length - 1);
        endTime = System.nanoTime();
        arr[2]=(endTime - startTime) / 1000000.0;
        System.out.println("Quick Sort time: " + (endTime - startTime) / 1000000.0 + " ms");



        return arr;

    }
}
