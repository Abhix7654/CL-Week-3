import challengeproblem.BinarySearchTargetIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTargetindex {
    @Test
    void findIndex(){
        int arr[]={2,3,6,4,32,54,6};
        int target=32;

        Assertions.assertEquals(BinarySearchTargetIndex.binarySearch(arr,target),5);
    }
}
