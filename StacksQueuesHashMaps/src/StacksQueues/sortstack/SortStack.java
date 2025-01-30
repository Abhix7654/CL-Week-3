package StacksQueues.sortstack;
import java.util.Stack;
class SortStack {

    // Function to sort the stack
    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            //  Pop the top element
            int top = stack.pop();

            //  Recursively sort the remaining stack
            sort(stack);

            //  Insert the popped element back at the correct position
            insertInSortedOrder(stack, top);
        }
    }

    // Helper function to insert an element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int top = stack.pop();

            // Recursively insert the given element
            insertInSortedOrder(stack, element);

            // Push the removed element back
            stack.push(top);
        }
    }
}
