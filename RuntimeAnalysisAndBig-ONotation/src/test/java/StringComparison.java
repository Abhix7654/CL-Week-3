import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringconcatenationperformance.StringConcatenationComparison;

public class StringComparison {
    @Test
    void stringConcatComapre(){
        int arr[]= StringConcatenationComparison.compare();
//        arr[0]=String time
//        arr[1]=StringBuffer time
//        arr[2]=StringBuilder time

        Assertions.assertTrue(arr[0]>arr[1] && arr[1]>arr[2]);
    }
}
