import Recursivevsiterativefibonacci.RecursiveVsIterativeFibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveVsIterativeComparison {
    @Test
    void recursionVsIteration(){
        double arr[]= RecursiveVsIterativeFibonacci.compare();
//        arr[0]=Recursive Time;
//        arr[1]=Iterative Time;
        Assertions.assertTrue(arr[0]>arr[1]);
    }
}
