import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import searchtargetinlargedataset.SortingComparison;

public class Sortingcomparison {
    @Test
    void compareSortingAlgo(){
        double arr[]= SortingComparison.compare();
        Assertions.assertTrue(arr[0]>arr[1] && arr[1]>arr[2]);
    }
}
