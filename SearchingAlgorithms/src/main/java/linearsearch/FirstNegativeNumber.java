package linearsearch;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, -4, 7, -2, 6};
        System.out.println(findNegative(arr));

    }

    public static int findNegative(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                return i;
        }
        return -1;
    }
}