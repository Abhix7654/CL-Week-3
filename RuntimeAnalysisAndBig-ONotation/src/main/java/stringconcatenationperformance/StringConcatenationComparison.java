package stringconcatenationperformance;

public class StringConcatenationComparison {
    public static void main(String[] args) {
      compare();
    }
    public static int[] compare(){
        int arr[]=new int[3];

        int N = 100000;

        // Using String
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "Abhi"; // Inefficient due to immutability
        }
        long endTime = System.currentTimeMillis();
        arr[0]= (int) (endTime - startTime);
        System.out.println("Time taken using String: " + (endTime - startTime) + " ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < N; i++) {
            stringBuffer.append("Abhi");
        }
        endTime = System.currentTimeMillis();
        arr[1]= (int) (endTime - startTime);
        System.out.println("Time taken using StringBuffer: " + (endTime - startTime) + " ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringBuilder.append("Abhi");
        }
        endTime = System.currentTimeMillis();
        arr[2]= (int) (endTime - startTime);
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " ms");



        return arr;

    }
}
