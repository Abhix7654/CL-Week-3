package StacksQueues.slidingwindow;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 5, -1, -35, 5, 83, 6, 7};
        int k = 3;

        int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximums:");
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}