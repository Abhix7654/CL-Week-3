import binarysearch.FirstAndLastOccurrence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FirstandLastOccurance {
    @Test
    void firstAndLastOccurance(){
        int arr[]={2,3,4,4,4,4,5,6,7};
        int target=4;
        int ans[]={2,5};
        Assertions.assertEquals(Arrays.toString(FirstAndLastOccurrence.findFirstAndLastOccurrence(arr,target)),Arrays.toString(ans));
    }
}
