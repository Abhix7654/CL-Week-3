package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minInd = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minInd]) {
                    minInd = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = scores[minInd];
            scores[minInd] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {24, 22, 42, 73, 40, 62};

        System.out.println("Unsorted Scores " + Arrays.toString(scores));
        selectionSort(scores);
        System.out.println("Sorted Scores " + Arrays.toString(scores));
    }
}
