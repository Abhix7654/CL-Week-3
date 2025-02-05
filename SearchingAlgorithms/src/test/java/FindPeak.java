import binarysearch.FindPeakElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FindPeak {
    @Test
    void findPeak(){
        int arr[]={2,3,4,5,6,1};
        int ans=4;

        Assertions.assertEquals(FindPeakElement.findPeakElement(arr),ans);

    }

}
