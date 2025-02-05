import binarysearch.SearchTargetIn2DMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SearchTarget {
    @Test
    void searchTarget(){
        int[][] arr = {{ 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 }};
        int target = 3;
        Assertions.assertEquals(SearchTargetIn2DMatrix.searchMatrix(arr,target),true);
    }
}
