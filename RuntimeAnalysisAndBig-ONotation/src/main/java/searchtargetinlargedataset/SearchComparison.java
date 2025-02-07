package searchtargetinlargedataset;

import java.util.*;

public class SearchComparison {

    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {


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
        return -1;
    }
    public static double[] compare(int size){
        int arr[]=new int[size];
        double ans[]=new double[2];
        for (int i=1;i<=size;i++){
            arr[i-1]=i;
        }

        System.out.println("\nDataset Size: " + size);
        // Linear Search
        long startTime = System.nanoTime();
        linearSearch(arr, size-1);
        long endTime = System.nanoTime();
        ans[0]=(endTime - startTime) / 1000000.0;
        System.out.println("Linear Search Time: " + (endTime - startTime) / 1000000.0 + " ms");

        Arrays.sort(arr);
        // Binary Search (after sorting)
        startTime = System.nanoTime();
        binarySearch(arr, size-1);
        endTime = System.nanoTime();
        ans[1]=(endTime - startTime) / 1000000.0;
        System.out.println("Binary Search Time: " + (endTime - startTime) / 1000000.0 + " ms");


        return ans;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};


        for (int size : datasetSizes) {
            compare(size);
        }
    }
}

