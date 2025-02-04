package stringbuffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        String s1="Abhishek";

        System.out.println(Arrays.toString(comparing(s1)));


    }
    public static Long[] comparing(String s1){
        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        Long arr[]=new Long[2];


        int iterations = 1000000;  // 1 million

        // Measuring time for StringBuffer
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(s1);
        }
        long endTime = System.nanoTime();
        arr[0] = endTime - startTime;


        // Measuring time for StringBuilder

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(s1);
        }
        endTime = System.nanoTime();
        arr[1]= endTime - startTime;

        System.out.println();
        // Comparing performance
       return arr;


    }
}
