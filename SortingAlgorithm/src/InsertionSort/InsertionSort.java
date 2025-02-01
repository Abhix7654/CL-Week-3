package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIds[i];
            int j = i - 1;


            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }
            employeeIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {234, 302, 192, 100, 208, 403};

        System.out.println("Unsorted Employee " + Arrays.toString(employeeIds));
        insertionSort(employeeIds);
        System.out.println("Sorted Employee " + Arrays.toString(employeeIds));
    }
}
