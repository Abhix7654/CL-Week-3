package StacksQueues.stockspan;

public class Main {
    public static void main(String[] args) {
        int[] prices = {130, 48, 20, 30, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Stock Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("\nStock Spans: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

