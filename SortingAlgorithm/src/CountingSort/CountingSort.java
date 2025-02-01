package CountingSort;

import java.util.Arrays;

class CountingSort {

    // Function to perform Counting Sort
    public static void countingSort(int[] arr) {
        int max = 18;  // Maximum age
        int min = 10;  // Minimum age

        // Create a count array to store the frequency of each age
        int[] count = new int[max - min + 1];

        // Count the occurrences of each age
        for (int age : arr) {
            count[age - min]++;
        }

        // Reconstruct the sorted array using the count array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;  // i + min gives the actual age
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {13, 12, 13, 10, 11, 13, 12, 15, 13, 11};

        System.out.println("Original Ages " + Arrays.toString(studentAges));

        // Apply counting sort to the array
        countingSort(studentAges);

        System.out.println("Sorted Ages " + Arrays.toString(studentAges));
    }
}
