import binarysearch.FindRotationPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindRotationIndex {
    @Test
    void findIndexPoint(){
        int arr[]={5,6,1,2,3,4};
        int ans=2;
        Assertions.assertEquals(FindRotationPoint.findRotationPoint(arr),ans);
    }
}
