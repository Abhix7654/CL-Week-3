package binarysearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1};
        System.out.println(findPeakElement(arr));


    }
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        if (n == 1) return 0;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int leftNeighbor;
            if(mid - 1 >= 0) leftNeighbor= arr[mid - 1]; else leftNeighbor=Integer.MIN_VALUE;
            int rightNeighbor;
            if(mid + 1 < n) rightNeighbor= arr[mid + 1]; else rightNeighbor=Integer.MIN_VALUE;

            if (arr[mid] >= leftNeighbor && arr[mid] >= rightNeighbor) {
                return mid;
            }

            if (leftNeighbor > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
