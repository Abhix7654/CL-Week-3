import challengeproblem.FirstMissingPositive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstmissingPositive {
    @Test
    void firstMissingpositive(){
        int arr[]={1,2,3,-6,7,8};
        Assertions.assertEquals(FirstMissingPositive.firstMissingPositive(arr),4);
    }
}
